package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
	
	public List<Pregunta> findById(long id);

}
