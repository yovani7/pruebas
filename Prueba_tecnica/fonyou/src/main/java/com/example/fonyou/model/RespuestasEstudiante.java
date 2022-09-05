package com.example.fonyou.model;

import java.util.List;

public class RespuestasEstudiante {
	private Integer idEstudiante;
	private Integer idExamen;
	private List<PreguntaRespuesta> respuestas;
	
	public Integer getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	public Integer getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}
	public List<PreguntaRespuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List<PreguntaRespuesta> respuestas) {
		this.respuestas = respuestas;
	}

}
