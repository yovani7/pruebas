package com.example.fonyou.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descripcion;
	
	public Examen() {  }
	
	public Examen(String descripcion) {
		this.setDescripcion(descripcion);
	}

	public Examen(Integer id, String descripcion) {
		this.setId(id);
		this.setDescripcion(descripcion);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
