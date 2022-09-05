package com.example.fonyou.model;

import java.util.List;

public class ConsultaExamen {
	private String nombreExamen;
	private List<ConsultaPreguntas> ConsultaPreguntas;
	
	public String getNombreExamen() {
		return nombreExamen;
	}
	public void setNombreExamen(String nombreExamen) {
		this.nombreExamen = nombreExamen;
	}
	public List<ConsultaPreguntas> getConsultaPreguntas() {
		return ConsultaPreguntas;
	}
	public void setConsultaPreguntas(List<ConsultaPreguntas> consultaPreguntas) {
		ConsultaPreguntas = consultaPreguntas;
	}

}
