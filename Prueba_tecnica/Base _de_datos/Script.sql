CREATE DATABASE pruebaTecnica;
USE pruebaTecnica;

CREATE TABLE pregunta (
  id INTEGER UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  pregunta VARCHAR(500) NOT NULL,
  respuestaUno VARCHAR(500) NOT NULL,
  respuestaDos VARCHAR(500) NOT NULL,
  respuestaTres VARCHAR(500) NOT NULL,
  respuestaCuatro VARCHAR(500) NOT NULL,
  respuestaCorrecta VARCHAR(500) NOT NULL,
  porcentaje INTEGER NOT NULL,
  idExamen INTEGER NOT NULL
);

CREATE TABLE estudiante (
  id INTEGER UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(500) NOT NULL,
  edad INTEGER NOT NULL,
  ciudad VARCHAR(500) NOT NULL,
  zonaHoraria VARCHAR(500) NOT NULL
);

CREATE TABLE evaluacion (
  id INTEGER UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  idEstudiante INTEGER NOT NULL,
  idExamen INTEGER NOT NULL,
  fechaExamen DATE NOT NULL
);

CREATE TABLE examen (
  id INTEGER UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  descripcion VARCHAR(500) NOT NULL
);

CREATE TABLE respuesta (
  id INTEGER UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  idEstudiante INTEGER NOT NULL,
  idExamen INTEGER NOT NULL,
  idPregunta INTEGER NOT NULL,
  respuesta VARCHAR(500) NOT NULL,
  calificacion INTEGER NOT NULL
);
