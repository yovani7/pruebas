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

import com.example.fonyou.entity.Estudiante;
import com.example.fonyou.service.EstudianteService;
import com.example.fonyou.utils.Constantes;

@RestController
@RequestMapping (value = Constantes.POINT + "/estudiantes")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@PostMapping (value = Constantes.MAPPING_ALTA)
    public ResponseEntity<Estudiante> altaEstudiante(@RequestBody Estudiante estudiante){
		Estudiante altaEstudiante = estudianteService.crearEstudiante(estudiante);
		return ResponseEntity.status(HttpStatus.CREATED).body(altaEstudiante);
    }
	
	@GetMapping (value = Constantes.MAPPING_BUSCAR)
    public ResponseEntity<Estudiante> listaExamenes(@RequestParam(name = "id") int id){
		Estudiante estudiante = estudianteService.obtenerEstudiante(id);
		if(estudiante == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(estudiante);
    }

}
