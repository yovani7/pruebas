DROP TABLE IF EXISTS tbl_pregunta;

CREATE TABLE tbl_pregunta (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  pregunta VARCHAR(100) NOT NULL,
  respuestaUno VARCHAR(50) NOT NULL,
  respuestaDos VARCHAR(50) NOT NULL,
  respuestaTres VARCHAR(50) NOT NULL,
  respuestaCuatro VARCHAR(50) NOT NULL,
  respuestaCorrecta VARCHAR(50) NOT NULL,
  porcentaje DOUBLE
);

--DELETE FROM tbl_pregunta;
INSERT INTO tbl_pregunta (id, pregunta, respuestaUno, respuestaDos, respuestaTres, respuestaCuatro, respuestaCorrecta, porcentaje) VALUES (1, 'dos mas dos', 'uno', 'dos', 'tres', 'cuatro', 'dos', 50);
INSERT INTO tbl_pregunta (id, pregunta, respuestaUno, respuestaDos, respuestaTres, respuestaCuatro, respuestaCorrecta, porcentaje) VALUES (2, 'dos mas uno', 'uno', 'dos', 'tres', 'cuatro', 'uno', 25);
INSERT INTO tbl_pregunta (id, pregunta, respuestaUno, respuestaDos, respuestaTres, respuestaCuatro, respuestaCorrecta, porcentaje) VALUES (3, 'dos mas tres', 'uno', 'dos', 'tres', 'cuatro', 'tres', 25);