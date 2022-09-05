package com.example.fonyou.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.example.fonyou.entity.Estudiante;
import com.example.fonyou.entity.Evaluacion;
import com.example.fonyou.entity.Examen;
import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.entity.Respuesta;
import com.example.fonyou.model.AgendaEstudiante;
import com.example.fonyou.model.ConsultaExamen;
import com.example.fonyou.model.ConsultaPreguntas;
import com.example.fonyou.model.ExamenAlta;
import com.example.fonyou.model.PeticionAgenda;
import com.example.fonyou.model.PreguntaRespuesta;
import com.example.fonyou.model.RespuestaAgenda;
import com.example.fonyou.model.RespuestasEstudiante;
import com.example.fonyou.repository.EstudianteRepository;
import com.example.fonyou.repository.EvaluacionRepository;
import com.example.fonyou.repository.ExamenRepository;
import com.example.fonyou.repository.PreguntaRepository;
import com.example.fonyou.repository.RespuestaRepository;
import com.example.fonyou.utils.Constantes;

@Service
public class PruebaServiceImpl implements PruebaService {
	
	@Autowired
	private ExamenRepository examenRepository;
	
	@Autowired
	private PreguntaRepository preguntaRepository;
	
	@Autowired
	private EstudianteRepository estudianteRepository;
	
	@Autowired
	private EvaluacionRepository evaluacionRepository;
	
	@Autowired
	private RespuestaRepository respuestaRepository;

	@Override
	public Examen crearExamen(ExamenAlta examenAlta) throws HttpClientErrorException{
		Examen examen = new Examen();
		int total = Constantes.CERO;
		for(Pregunta pregunta : examenAlta.getPreguntas()) {
			total = total + pregunta.getPorcentaje();
		}
		
		if(total == Constantes.TOTAL_EXAMEN) {		
			examen.setDescripcion(examenAlta.getDescripcion());
			examen = examenRepository.save(examen);			
			for(Pregunta pregunta : examenAlta.getPreguntas()) {
				Pregunta preguntaTemp = new Pregunta();
				preguntaTemp.setPregunta(pregunta.getPregunta());
				preguntaTemp.setRespuestaUno(pregunta.getRespuestaUno());
				preguntaTemp.setRespuestaDos(pregunta.getRespuestaDos());
				preguntaTemp.setRespuestaTres(pregunta.getRespuestaTres());
				preguntaTemp.setRespuestaCuatro(pregunta.getRespuestaCuatro());
				preguntaTemp.setRespuestaCorrecta(pregunta.getRespuestaCorrecta());
				preguntaTemp.setPorcentaje(pregunta.getPorcentaje());
				preguntaTemp.setIdExamen(examen.getId());
				preguntaRepository.save(preguntaTemp);
			}
		}else {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "El total del examen no debe ser direfrente de 100");
		}
		return examen;
	}

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	@Override
	public RespuestaAgenda crearEvaluacion(PeticionAgenda evaluacion) {
		RespuestaAgenda respuesta = new RespuestaAgenda();
		List<AgendaEstudiante> listAgendaEstudiante = new ArrayList<>();
		Evaluacion registro = null;
		try {
			for(int estudiante : evaluacion.getIdEstudiante()) {
				registro = new Evaluacion();
				registro.setIdExamen(evaluacion.getIdExamen());
				registro.setFechaExamen(evaluacion.getFechaExamen());
				registro.setIdEstudiante(estudiante);
				registro = evaluacionRepository.save(registro);
				listAgendaEstudiante.add(formatoZonaHoraria(estudiante, evaluacion.getFechaExamen()));
			}
			respuesta.setAgendaEstudiante(listAgendaEstudiante);
			
			Examen infoExamen = examenRepository.findById(evaluacion.getIdExamen());
			respuesta.setExamen(infoExamen.getDescripcion());
			respuesta.setFechaExamen(evaluacion.getFechaExamen());
			respuesta.setCiudad(Constantes.CIUDAD_EXAMEN);
		}catch(Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
		}		
		return respuesta;
	}

	@Override
	public String crearRespuesta(RespuestasEstudiante respuestasExamen) {
		Respuesta respuestaExamen = null;
		int calificacion = 0;
		String resultado;
		try {
			List<Pregunta> preguntas = preguntaRepository.findByIdExamen(respuestasExamen.getIdExamen());
			for(Pregunta pregunta : preguntas) {
				for(PreguntaRespuesta respuestaEstudiante : respuestasExamen.getRespuestas()) {
					if(pregunta.getId() == respuestaEstudiante.getIdPregunta()) {
						respuestaExamen = new Respuesta();
						if(pregunta.getRespuestaCorrecta().equals(respuestaEstudiante.getRespuesta())) {
							calificacion = calificacion + pregunta.getPorcentaje();
							respuestaExamen.setCalificacion(pregunta.getPorcentaje());
						}else {
							respuestaExamen.setCalificacion(Constantes.CERO);
						}
						respuestaExamen.setIdEstudiante(respuestasExamen.getIdEstudiante());
						respuestaExamen.setIdExamen(respuestasExamen.getIdExamen());
						respuestaExamen.setIdPregunta(respuestaEstudiante.getIdPregunta());
						respuestaExamen.setRespuesta(respuestaEstudiante.getRespuesta());
						respuestaRepository.save(respuestaExamen);
						break;
					}					
				}
			}
		}catch(Exception e) {
			System.out.println("Ocurrio un error " + e.getMessage());
		}
		resultado = "Calificacion del examen " + calificacion;
		return resultado;
	}
	
	private AgendaEstudiante formatoZonaHoraria (int idEstudiante, Date fechaExamen) {
		AgendaEstudiante agendado = new AgendaEstudiante();
		Estudiante estudiante = estudianteRepository.findById(idEstudiante);
		agendado.setNombre(estudiante.getNombre());
		agendado.setCiudad(estudiante.getCiudad());
		String zonaHor = "";
		try {
			@SuppressWarnings("deprecation")
			ZonedDateTime fechaBogota = ZonedDateTime.of(fechaExamen.getYear(), 
					fechaExamen.getMonth(), 
					fechaExamen.getDay(),
					fechaExamen.getHours(),
					fechaExamen.getMinutes(),
					fechaExamen.getSeconds(), 
					00,
					ZoneId.of("America/Bogota"));
			zonaHor = fechaBogota.withZoneSameInstant(ZoneId.of(estudiante.getZonaHoraria())).toString();
		}catch(Exception e) {
			System.out.println("Ocurrio algo en formatoZonaHoraria " + e.getMessage());
			zonaHor = fechaExamen.toString();
		}
		agendado.setFechaExamen(zonaHor);
		return agendado;
	}

	@Override
	public ConsultaExamen consultarExamen(int id) {
		ConsultaExamen examenCompleto = new ConsultaExamen();
		Examen examen = examenRepository.findById(id);
		List<Pregunta> preguntas = preguntaRepository.findByIdExamen(id);		
		examenCompleto.setNombreExamen(examen.getDescripcion());
		
		List<ConsultaPreguntas> ConsultaPreguntas = new ArrayList<>();;
		ConsultaPreguntas tempPregunta;
		for(Pregunta temp : preguntas) {
			tempPregunta = new ConsultaPreguntas();
			tempPregunta.setIdPregunta(temp.getId());
			tempPregunta.setPregunta(temp.getPregunta());
			tempPregunta.setRespuestaUno(temp.getRespuestaUno());
			tempPregunta.setRespuestaDos(temp.getRespuestaDos());
			tempPregunta.setRespuestaTres(temp.getRespuestaTres());
			tempPregunta.setRespuestaCuatro(temp.getRespuestaCuatro());
			ConsultaPreguntas.add(tempPregunta);
		}			
		examenCompleto.setConsultaPreguntas(ConsultaPreguntas);		
		return examenCompleto;
	}
	
}
