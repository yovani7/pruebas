package com.example.fonyou.service;

import org.springframework.web.client.HttpClientErrorException;

import com.example.fonyou.entity.Estudiante;
import com.example.fonyou.entity.Examen;
import com.example.fonyou.model.ConsultaExamen;
import com.example.fonyou.model.ExamenAlta;
import com.example.fonyou.model.PeticionAgenda;
import com.example.fonyou.model.RespuestaAgenda;
import com.example.fonyou.model.RespuestasEstudiante;

public interface PruebaService {
	
	public Examen crearExamen(ExamenAlta examenAlta) throws HttpClientErrorException;
	
	public Estudiante crearEstudiante(Estudiante estudiante);
	
	public RespuestaAgenda crearEvaluacion(PeticionAgenda evaluacion);
	
	public String crearRespuesta(RespuestasEstudiante respuesta);
	
	public ConsultaExamen consultarExamen(int id);

}
