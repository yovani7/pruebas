package com.example.fonyou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.entity.Evaluacion;
import com.example.fonyou.repository.EvaluacionRepository;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {
	
	@Autowired
	private EvaluacionRepository evaluacionRepository;

	@Override
	public Evaluacion crearEvaluacion(Evaluacion evaluacion) {
		return evaluacionRepository.save(evaluacion);
	}

	@Override
	public List<Evaluacion> buscarPorEstudiante(int idEstudiante) {
		return evaluacionRepository.findByIdEstudiante(idEstudiante);
	}

}
