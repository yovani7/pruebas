package com.example.fonyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.entity.Estudiante;
import com.example.fonyou.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiante(int id) {
		return estudianteRepository.findById(id);
	}

}
