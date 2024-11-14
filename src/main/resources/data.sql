-- Inserción de datos en la tabla Personaje
INSERT INTO personajes (nombre, raza, alianza) VALUES 
( 'Aragorn', 'Humano', 'La Comunidad del Anillo'),
( 'Gandalf', 'Maia', 'La Comunidad del Anillo'),
( 'Frodo', 'Hobbit', 'La Comunidad del Anillo'),
( 'Sauron', 'Maia', 'Mordor'),
( 'Legolas', 'Elfo', 'La Comunidad del Anillo'),
( 'Bilbo', 'Hobbit', 'Aventurero');

-- Inserción de datos en la tabla Artefacto
INSERT INTO artefactos (nombre, tipo) VALUES 
('Anillo Único', 'Anillo'),
('Espada Andúril', 'Espada'),
('Báculo de Gandalf', 'Báculo'),
('Dardo', 'Espada corta'),
('Manto Élfico', 'Armadura');

-- Inserción de datos en la tabla Posesion
INSERT INTO posesiones (personaje_id, artefacto_id, fechaInicio, fechaFin) VALUES 
( 3, 1, '3018-09-23', '3021-09-29'),  -- Frodo posee el Anillo Único
( 6, 1, '2941-01-01', '3001-09-22'),  -- Bilbo posee el Anillo Único
( 1, 2, '3019-03-15', NULL),          -- Aragorn posee la Espada Andúril (sin fecha fin, aún la posee)
( 2, 3, '3018-12-25', NULL),          -- Gandalf posee su báculo (sin fecha fin)
( 6, 4, '2941-01-01', '3001-09-22'),  -- Bilbo posee Dardo hasta que se lo pasa a Frodo
( 3, 4, '3001-09-22', '3021-09-29'),  -- Frodo posee Dardo
( 5, 5, '3018-10-25', NULL);          -- Legolas posee el Manto Élfico