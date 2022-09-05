package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Pregunta;

public interface PreguntaService {
	
	public Pregunta crearPregunta(Pregunta pregunta);
	
	public List<Pregunta> buscarPorExamen(int idExamen);
	
}
