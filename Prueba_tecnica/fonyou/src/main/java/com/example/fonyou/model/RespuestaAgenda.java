package com.example.fonyou.model;

import java.util.Date;
import java.util.List;

public class RespuestaAgenda {
	private String examen;
	private String ciudad;
	private Date fechaExamen;
	private List<AgendaEstudiante> agendaEstudiante;
	
	public String getExamen() {
		return examen;
	}
	public void setExamen(String examen) {
		this.examen = examen;
	}	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getFechaExamen() {
		return fechaExamen;
	}
	public void setFechaExamen(Date fechaExamen) {
		this.fechaExamen = fechaExamen;
	}
	public List<AgendaEstudiante> getAgendaEstudiante() {
		return agendaEstudiante;
	}
	public void setAgendaEstudiante(List<AgendaEstudiante> agendaEstudiante) {
		this.agendaEstudiante = agendaEstudiante;
	}

}
