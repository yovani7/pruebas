package com.example.fonyou.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta")
public class Respuesta {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idEstudiante;
	private Integer idExamen;
	private Integer idPregunta;
	private String respuesta;
	private Integer calificacion;
	
	public Respuesta() {  }

	public Respuesta(Integer idEstudiante, Integer idExamen, Integer idPregunta, String respuesta, Integer calificacion) {
		this.setIdEstudiante(idEstudiante);
		this.setIdExamen(idExamen);
		this.setIdPregunta(idPregunta);
		this.setRespuesta(respuesta);
		this.setCalificacion(calificacion);
	}
	
	public Respuesta(Integer id, Integer idEstudiante, Integer idExamen, Integer idPregunta, String respuesta, Integer calificacion) {
		this.setId(id);
		this.setIdEstudiante(idEstudiante);
		this.setIdExamen(idExamen);
		this.setIdPregunta(idPregunta);
		this.setRespuesta(respuesta);
		this.setCalificacion(calificacion);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
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
	public Integer getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}
	
}
