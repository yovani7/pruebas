package com.example.fonyou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl implements PreguntaService {
	
	@Autowired
	private PreguntaRepository preguntaRepository;

	@Override
	public Pregunta crearPregunta(Pregunta pregunta) {
		return preguntaRepository.save(pregunta);
	}

	@Override
	public List<Pregunta> buscarPorExamen(int idExamen) {
		return preguntaRepository.findByIdExamen(idExamen);
	}

}
