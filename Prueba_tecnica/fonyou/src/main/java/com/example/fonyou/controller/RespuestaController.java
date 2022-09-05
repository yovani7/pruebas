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

import com.example.fonyou.entity.Respuesta;
import com.example.fonyou.service.RespuestaService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/respuestas")
public class RespuestaController {
	
	@Autowired
	private RespuestaService respuestaService;
	
	@PostMapping (value = Constantes.MAPPING_ALTA)
    public ResponseEntity<Respuesta> altaRespuesta(@RequestBody Respuesta respuesta){
		Respuesta altaRespuesta = respuestaService.crearRespuesta(respuesta);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaRespuesta);
    }
	
	@GetMapping (value = Constantes.MAPPING_BUSCAR)
    public ResponseEntity<List<Respuesta>> listaRespuestas(@RequestParam(name = "idEstudiante") int idEstudiante){
		List<Respuesta> Respuestas = respuestaService.buscarPorEstudiante(idEstudiante);
		if(Respuestas.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(Respuestas);
    }

}
