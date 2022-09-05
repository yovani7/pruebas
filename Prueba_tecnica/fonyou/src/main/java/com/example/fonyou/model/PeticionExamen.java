package com.example.fonyou.model;

public class PeticionExamen {
	private Integer idEstudiante;
	private Integer idExamen;
	private Integer idPregunta;
	private String respuesta;
	
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
	public Integer getIdPregunta() {
		return idPregunta;
	}
	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
