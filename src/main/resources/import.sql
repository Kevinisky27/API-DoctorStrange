-- Pacientes --
insert into patient (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad) values ('Kevin', 'Alexander', 'Lima','Recinos', 20);
insert into patient (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad) values ('Federico', 'Mora', 'Morales','Lucero', 25);
insert into patient (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad) values ('Jacob', 'Arbenz', 'Castillo','Cordoba', 60);
insert into patient (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad) values ('Carlos', 'Federico', 'Hernandez','Juarez', 36);
insert into patient (primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad) values ('Mia', 'Roxana', 'Kalifa','Hernandez', 18);


-- Polizas --
insert into appointment (id_patient, estado_poliza, inicio_poliza, fin_poliza) values (1,'Activa', '2020-03-26','2025-03-26');



-- Citas --
insert into appointment (id_poliza, fecha_cita, hora_cita, estado_cita, observacion_cita) values (1,'2022-08-10', '15:00:00', 'PENDIENTE', 'El paciente muestra mejoria.');