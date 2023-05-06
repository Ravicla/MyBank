select * from tipoingreso;
select * from usuario;
select * from aporte;
select * from prestamo;
select * from cuota;

insert into tipoingreso (descripcion) values ('Ahorro'), ('Actividad'), ('Rifa'), ('Multa'), ('Otros');

INSERT INTO usuario(ci, nombre, apellido, correo, telefono, estatus, password) 
VALUES ('12345678', 'Ana', 'García', 'ana.garcia@gmail.com', '0424134567', 'Activo', '12345678'),
('23456789', 'Juan', 'Pérez', 'juanperez@hotmail.com', '0412345678', 'Inactivo', '23456789'),
('34567890', 'María', 'Rodríguez', 'maria.rodriguez@gmail.com', '0413456789', 'Activo', '34567890'),
('45678901', 'Carlos', 'Gómez', 'carlos.gomez@yahoo.com', '0426456790', 'Inactivo', '45678901'),
('56789012', 'Laura', 'Jiménez', 'laurajimenez@gmail.com', '0412568901', 'Activo', '56789012'),
('67890123', 'José', 'Martínez', 'jose.martinez@hotmail.com', '0446789012', 'Inactivo', '67890123'),
('78901234', 'Andrea', 'Sánchez', 'andrea.sanchez@yahoo.com', '0417890123', 'Activo', '78901234'),
('89012345', 'Alejandro', 'Herrera', 'alejandro.herrera@gmail.com', '0428901234', 'Inactivo', '89012345'),
('90123456', 'Patricia', 'Castro', 'patricia.castro@hotmail.com', '0412012345', 'Activo', '90123456'),
('01234567', 'Luis', 'Ramírez', 'luisramirez@yahoo.com', '0424012356', 'Inactivo', '01234567');

INSERT INTO aporte(fecha_aporte, valor_aporte, usuario_id, tipoIngreso_id) 
VALUES  ('2023-01-10', '3', '1', '1'),
('2023-02-05', '5', '2', '2'),
('2023-03-12', '2', '3', '3'),
('2023-04-15', '8', '4', '4'),
('2023-05-20', '6', '5', '5'),
('2023-01-22', '9', '6', '1'),
('2023-02-08', '1', '7', '2'),
('2023-03-18', '4', '8', '3'),
('2023-04-25', '7', '9', '4'),
('2023-05-30', '10', '10', '5'),
('2023-02-02', '4', '1', '2'),
('2023-02-15', '2', '2', '4'),
('2023-03-07', '7', '3', '1'),
('2023-04-14', '6', '4', '3'),
('2023-04-28', '3', '5', '5'),
('2023-05-05', '8', '6', '2'),
('2023-05-20', '1', '1', '1'),
('2023-05-22', '5', '1', '2'),
('2023-05-24', '9', '1', '3'),
('2023-05-26', '2', '1', '4'),
('2023-05-28', '7', '1', '5'),
('2023-05-30', '3', '1', '1');

insert into prestamo (fecha_prestamo, interes, valor_prestamo, tiempo_prestamo, usuario_id)
VALUES ('2023-01-15', 5, 100, 3, 1), 
('2023-02-12', 6, 200, 2, 2),
('2023-03-20', 7, 250, 4, 3),
('2023-04-18', 9, 400, 5, 4),
('2023-05-23', 8, 350, 3, 5),
('2023-01-28', 6, 150, 3, 6), 
('2023-02-16', 6, 250, 2, 7),
('2023-03-25', 9, 500, 4, 8),
('2023-04-22', 7, 300, 5, 9),
('2023-05-30', 9, 450, 4, 10);

insert into cuota (fecha_cuota, valor_capital, pago_capital, valor_interes, pago_interes, abono_capital, abono_interes, prestamo_id)
values('2022-03-01','90','0','4.50','1','30','1','1');

