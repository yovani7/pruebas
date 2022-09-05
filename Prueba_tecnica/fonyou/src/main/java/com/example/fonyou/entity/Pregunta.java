package com.example.fonyou.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pregunta")
public class Pregunta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String pregunta;
	private String respuestaUno;
	private String respuestaDos;
	private String respuestaTres;
	private String respuestaCuatro;
	private String respuestaCorrecta;
	private Integer porcentaje;
	private Integer idExamen;
	
	public Pregunta() {  }
		
	public Pregunta(String pregunta, String respuestaUno, String respuestaDos, String respuestaTres,
			String respuestaCuatro, String respuestaCorrecta, Integer porcentaje, Integer idExamen) {
		this.setPregunta(pregunta);
		this.setRespuestaUno(respuestaUno);
		this.setRespuestaDos(respuestaDos);
		this.setRespuestaTres(respuestaTres);
		this.setRespuestaCuatro(respuestaCuatro);
		this.setRespuestaCorrecta(respuestaCorrecta);
		this.setPorcentaje(porcentaje);
		this.setIdExamen(idExamen);
	}
	
	public Pregunta(Integer id, String pregunta, String respuestaUno, String respuestaDos, String respuestaTres,
			String respuestaCuatro, String respuestaCorrecta, Integer porcentaje, Integer idExamen) {
		this.setId(id);
		this.setPregunta(pregunta);
		this.setRespuestaUno(respuestaUno);
		this.setRespuestaDos(respuestaDos);
		this.setRespuestaTres(respuestaTres);
		this.setRespuestaCuatro(respuestaCuatro);
		this.setRespuestaCorrecta(respuestaCorrecta);
		this.setPorcentaje(porcentaje);
		this.setIdExamen(idExamen);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}
	public Integer getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Integer idExamen) {
		this.idExamen = idExamen;
	}
	
}
