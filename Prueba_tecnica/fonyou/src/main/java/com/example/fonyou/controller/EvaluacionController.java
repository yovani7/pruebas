package com.example.fonyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.fonyou.entity.Evaluacion;
import com.example.fonyou.service.EvaluacionService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/evaluaciones")
public class EvaluacionController {
	
	@Autowired
	private EvaluacionService evaluacionService;
	
	@PostMapping (value = Constantes.MAPPING_ALTA)
    public ResponseEntity<Evaluacion> altaEvaluacion(@RequestBody Evaluacion evaluacion){
		Evaluacion altaEvaluacion = evaluacionService.crearEvaluacion(evaluacion);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaEvaluacion);
    }
	
	@GetMapping (value = Constantes.MAPPING_BUSCAR)
    public ResponseEntity<List<Evaluacion>> listaEvaluaciones(@RequestParam(name = "idEstudiante") int idEstudiante){
		List<Evaluacion> evaluaciones = evaluacionService.buscarPorEstudiante(idEstudiante);
		if(evaluaciones.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(evaluaciones);
    }

}
