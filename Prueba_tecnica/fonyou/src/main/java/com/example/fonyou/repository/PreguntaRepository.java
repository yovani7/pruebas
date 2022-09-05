package com.example.fonyou.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fonyou.entity.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
		
	public List<Pregunta> findByIdExamen(int idExamen);

}
