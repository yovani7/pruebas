package com.example.fonyou.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="evaluacion")
public class Evaluacion {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;	
	private Integer idEstudiante;	
	private Integer idExamen;
	private Date fechaExamen;
	
	public Evaluacion() {  }

	public Evaluacion(Integer idEstudiante, Integer idExamen, Date fechaExamen) {
		this.setIdEstudiante(idEstudiante);
		this.setIdExamen(idExamen);
		this.setFechaExamen(fechaExamen);
	}
	
	public Evaluacion(Integer id, Integer idEstudiante, Integer idExamen, Date fechaExamen) {
		this.setId(id);
		this.setIdEstudiante(idEstudiante);
		this.setIdExamen(idExamen);
		this.setFechaExamen(fechaExamen);
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
	public Date getFechaExamen() {
		return fechaExamen;
	}
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}

}
