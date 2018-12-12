USE appangular;

CREATE TABLE `appangular`.`users` (
  `idusers` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `primer_nombre` VARCHAR(45) NOT NULL,
  `segundo_nombre` VARCHAR(45) NULL,
  `primer_apellido` VARCHAR(45) NOT NULL,
  `segundo_apellido` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `direccion` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`idusers`))
COMMENT = 'tabla de usuarios';
