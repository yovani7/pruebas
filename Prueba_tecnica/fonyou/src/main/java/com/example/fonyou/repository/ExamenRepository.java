package com.example.fonyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fonyou.entity.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {
	
	public Examen findById(int id);

}
