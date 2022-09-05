package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Respuesta;

public interface RespuestaService {
	
	public Respuesta crearRespuesta(Respuesta respuesta);
	
	public List<Respuesta> buscarPorEstudiante(int idEstudiante);

}
