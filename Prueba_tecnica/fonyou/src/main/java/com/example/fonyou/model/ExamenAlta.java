package com.example.fonyou.model;

import java.util.List;

import com.example.fonyou.entity.Pregunta;

public class ExamenAlta {
	private String descripcion;
	private List<Pregunta> preguntas;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
		
}
