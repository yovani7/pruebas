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

import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.service.PreguntaService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/preguntas")
public class PreguntaController {
	
	@Autowired
	private PreguntaService preguntaService;
	
	@PostMapping (value = Constantes.MAPPING_ALTA)
    public ResponseEntity<Pregunta> altaPregunta(@RequestBody Pregunta pregunta){
		Pregunta altaPregunta = preguntaService.crearPregunta(pregunta);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaPregunta);
    }
	
	@GetMapping (value = Constantes.MAPPING_BUSCAR)
    public ResponseEntity<List<Pregunta>> listaPreguntas(@RequestParam(name = "idExamen") int idExamen){
		List<Pregunta> preguntas = preguntaService.buscarPorExamen(idExamen);
		if(preguntas.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(preguntas);
    }

}
