package com.example.fonyou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.entity.Respuesta;
import com.example.fonyou.repository.RespuestaRepository;

@Service
public class RespuestaServiceImpl implements RespuestaService {
	
	@Autowired
	private RespuestaRepository respuestaRepository;

	@Override
	public Respuesta crearRespuesta(Respuesta respuesta) {
		return respuestaRepository.save(respuesta);
	}

	@Override
	public List<Respuesta> buscarPorEstudiante(int idEstudiante) {
		return respuestaRepository.findByIdEstudiante(idEstudiante);
	}

}
