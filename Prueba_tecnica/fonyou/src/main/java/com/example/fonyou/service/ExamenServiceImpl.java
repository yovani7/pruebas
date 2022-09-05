package com.example.fonyou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.entity.Examen;
import com.example.fonyou.repository.ExamenRepository;

@Service
public class ExamenServiceImpl implements ExamenService {
	
	@Autowired
	private ExamenRepository examenRepository;

	@Override
	public Examen crearExamen(Examen examen) {
		return examenRepository.save(examen);
	}

	@Override
	public Examen obtenerExamen(int id) {
		return examenRepository.findById(id);
	}

}
