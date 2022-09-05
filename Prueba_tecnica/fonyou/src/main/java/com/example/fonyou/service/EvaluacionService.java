package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Evaluacion;

public interface EvaluacionService {
	
	public Evaluacion crearEvaluacion(Evaluacion evaluacion);
	
	public List<Evaluacion> buscarPorEstudiante(int idEstudiante);

}
