package com.example.demo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.entity.Pregunta;
import com.example.demo.repository.PreguntaRepository;

@DataJpaTest
public class PreguntaRepositoryMockTest {
	
	@Autowired
	private PreguntaRepository preguntaRepository;
	
	@Test
	public void whenFindById_thenReturnListPreguntas() {
		List<Pregunta> founds = preguntaRepository.findById(1);
		
	}

}
