package com.example.fonyou.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fonyou.entity.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {
	
	public List<Respuesta> findByIdEstudiante(int idEstudiante);

}
