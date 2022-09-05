package com.example.fonyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.example.fonyou.entity.Estudiante;
import com.example.fonyou.entity.Examen;
import com.example.fonyou.model.ConsultaExamen;
import com.example.fonyou.model.ExamenAlta;
import com.example.fonyou.model.PeticionAgenda;
import com.example.fonyou.model.RespuestaAgenda;
import com.example.fonyou.model.RespuestasEstudiante;
import com.example.fonyou.service.PruebaService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/pruebas")
public class PruebaController {
	
	@Autowired
	private PruebaService pruebaService;
	
	@PostMapping (value = "/crearexamen")
    public ResponseEntity<Examen> crearExamen(@RequestBody ExamenAlta examenAlta) throws HttpClientErrorException {
		Examen response = pruebaService.crearExamen(examenAlta);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	
	@PostMapping (value = "/crearestudiante")
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante){
		Estudiante response = pruebaService.crearEstudiante(estudiante);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	
	@PostMapping (value = "/agendarevaluacion")
    public ResponseEntity<RespuestaAgenda> altaEvaluacion(@RequestBody PeticionAgenda peticionAgenda){
		RespuestaAgenda altaEvaluacion = pruebaService.crearEvaluacion(peticionAgenda);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaEvaluacion);
    }
	
	@PostMapping (value = "/responderexamen")
    public ResponseEntity<String> responderexamen(@RequestBody RespuestasEstudiante respuesta){
		String response = pruebaService.crearRespuesta(respuesta);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
	
	@GetMapping (value = "/consultarexamen")
    public ResponseEntity<ConsultaExamen> consultarexamen(@RequestParam(name = "id") int id){
		ConsultaExamen response = pruebaService.consultarExamen(id);
		if(response.getNombreExamen().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(response);
    }

}
