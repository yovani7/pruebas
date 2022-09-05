package com.example.fonyou.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private Integer edad;
	private String ciudad;
	private String zonaHoraria;
	
	public Estudiante() {  }
	
	public Estudiante(String nombre, Integer edad, String ciudad, String zonaHoraria) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setCiudad(ciudad);
		this.setZonaHoraria(zonaHoraria);
	}

	public Estudiante(Integer id, String nombre, Integer edad, String ciudad, String zonaHoraria) {
		this.setId(id);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setCiudad(ciudad);
		this.setZonaHoraria(zonaHoraria);
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}
	
}
