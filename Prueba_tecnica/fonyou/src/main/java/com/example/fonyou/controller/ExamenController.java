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

import com.example.fonyou.entity.Examen;
import com.example.fonyou.service.ExamenService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/examenes")
public class ExamenController {
	
	@Autowired
	private ExamenService examenService;
	
	@PostMapping (value = Constantes.MAPPING_ALTA)
    public ResponseEntity<Examen> altaExamen(@RequestBody Examen examen){
		Examen altaExamen = examenService.crearExamen(examen);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaExamen);
    }
	
	@GetMapping (value = Constantes.MAPPING_BUSCAR)
    public ResponseEntity<Examen> listaExamenes(@RequestParam(name = "id") int id){
		Examen Examen = examenService.obtenerExamen(id);
		if(Examen == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(Examen);
    }

}
