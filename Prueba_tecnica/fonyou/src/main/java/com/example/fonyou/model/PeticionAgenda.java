package com.example.fonyou.model;

import java.util.Date;
import java.util.List;

public class PeticionAgenda {		
	private int idExamen;
	private Date fechaExamen;
	private List<Integer> idEstudiante;
	
	public int getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}
	public Date getFechaExamen() {
		return fechaExamen;
	}
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	public List<Integer> getIdEstudiante() {
		return idEstudiante;
	}
	public void setIdEstudiante(List<Integer> idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
}
