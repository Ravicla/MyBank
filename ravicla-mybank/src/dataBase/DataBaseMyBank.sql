CREATE DATABASE myBank;

-- Table myBank.usuario

CREATE TABLE IF NOT EXISTS myBank.usuario (
usuario_id INT NOT NULL AUTO_INCREMENT,
ci VARCHAR(20) NOT NULL,
nombre VARCHAR(30) NOT NULL,
apellido VARCHAR(30) NOT NULL,
correo VARCHAR(50) NOT NULL,
telefono VARCHAR(10) NOT NULL,
estatus CHAR(10) NULL DEFAULT NULL,
password VARCHAR(10) NOT NULL,
PRIMARY KEY (usuario_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb3;
-- Relación entre la tabla usuario y la tabla prestamo
ALTER TABLE `myBank`.`prestamo`
ADD CONSTRAINT `usuario_prestamo_fk`
FOREIGN KEY (`usuario_id`) REFERENCES `myBank`.`usuario` (`usuario_id`)
ON DELETE CASCADE ON UPDATE CASCADE;
-- Relación entre la tabla usuario y la tabla aporte
ALTER TABLE `myBank`.`aporte`
ADD CONSTRAINT `usuario_aporte_fk`
FOREIGN KEY (`usuario_id`)
REFERENCES `myBank`.`usuario` (`usuario_id`)
ON DELETE CASCADE ON UPDATE CASCADE;

-- Table myBank.tipoingreso
CREATE TABLE IF NOT EXISTS myBank.tipoingreso (
tipoIngreso_id INT NOT NULL AUTO_INCREMENT,
descripcion VARCHAR(50) NOT NULL,
PRIMARY KEY (tipoIngreso_id)
)
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb3;
-- Relación entre la tabla tipoingreso y la tabla aporte
ALTER TABLE `myBank`.`aporte`
ADD CONSTRAINT `tipoingreso_aporte_fk`
FOREIGN KEY (`tipoIngreso_id`)
REFERENCES `myBank`.`tipoingreso` (`tipoIngreso_id`)
ON DELETE CASCADE
ON UPDATE CASCADE;

-- Table myBank.aporte
CREATE TABLE IF NOT EXISTS myBank.aporte (
aporte_id INT NOT NULL AUTO_INCREMENT,
fecha_aporte TIMESTAMP NOT NULL,
valor_aporte INT NOT NULL,
usuario_id INT NOT NULL,
tipoIngreso_id INT NOT NULL,
PRIMARY KEY (aporte_id)
)
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb3;


-- Table myBank.prestamo
CREATE TABLE IF NOT EXISTS myBank.prestamo (
prestamo_id INT NOT NULL AUTO_INCREMENT,
fecha_prestamo TIMESTAMP NOT NULL,
interes INT NOT NULL,
valor_prestamo DECIMAL(10,2) NOT NULL,
tiempo_prestamo INT NOT NULL,
usuario_id INT NOT NULL,
PRIMARY KEY (prestamo_id)
)
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb3;
-- Relación entre la tabla prestamo y la tabla cuota
ALTER TABLE `myBank`.`cuota`
ADD CONSTRAINT `prestamo_cuota_fk`
FOREIGN KEY (`prestamo_id`)
REFERENCES `myBank`.`prestamo` (`prestamo_id`)
ON DELETE CASCADE
ON UPDATE CASCADE;

-- Table myBank.cuota
CREATE TABLE IF NOT EXISTS myBank.cuota (
cuota_id INT NOT NULL AUTO_INCREMENT,
fecha_cuota TIMESTAMP NOT NULL,
valor_capital DECIMAL(10,2) NOT NULL,
pago_capital TINYINT(1) NOT NULL,
valor_interes DECIMAL(10,2) NOT NULL,
pago_interes TINYINT(1) NOT NULL,
abono_capital DECIMAL(10,2) NOT NULL,
abono_interes DECIMAL(10,2) NOT NULL,
prestamo_id INT NOT NULL,
PRIMARY KEY (cuota_id)
)
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8mb3;

