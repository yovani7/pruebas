package com.example.fonyou.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fonyou.entity.Evaluacion;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
	
	public List<Evaluacion> findByIdEstudiante(int idEstudiante);

}
