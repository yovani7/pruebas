package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_pregunta")
public class Pregunta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String pregunta;
	private String respuestaUno;
	private String respuestaDos;
	private String respuestaTres;
	private String respuestaCuatro;
	private String respuestaCorrecta;
	private long porcentaje;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuestaUno() {
		return respuestaUno;
	}
	public void setRespuestaUno(String respuestaUno) {
		this.respuestaUno = respuestaUno;
	}
	public String getRespuestaDos() {
		return respuestaDos;
	}
	public void setRespuestaDos(String respuestaDos) {
		this.respuestaDos = respuestaDos;
	}
	public String getRespuestaTres() {
		return respuestaTres;
	}
	public void setRespuestaTres(String respuestaTres) {
		this.respuestaTres = respuestaTres;
	}
	public String getRespuestaCuatro() {
		return respuestaCuatro;
	}
	public void setRespuestaCuatro(String respuestaCuatro) {
		this.respuestaCuatro = respuestaCuatro;
	}
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public long getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(long porcentaje) {
		this.porcentaje = porcentaje;
	}		
	
}
