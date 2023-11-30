CREATE SCHEMA `bdagencia` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;

CREATE TABLE `bdagencia`.`hoteles` (
  `idhotel` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `categoria` INT NULL,
  `precio` DOUBLE NULL,
  `disponible` INT NULL,
  PRIMARY KEY (`idhotel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;

CREATE TABLE `bdagencia`.`vuelos` (
  `idvuelo` INT NOT NULL AUTO_INCREMENT,
  `comp` VARCHAR(45) NULL,
  `fechavuelo` DATE NULL,
  `precio` DOUBLE NULL,
  `plazasdisponibles` INT NULL,
  PRIMARY KEY (`idvuelos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;

CREATE TABLE `bdagencia`.`reservas` (
  `idreserva` INT NOT NULL AUTO_INCREMENT,
  `nombrecliente` VARCHAR(45) NULL,
  `dni` VARCHAR(45) NULL,
  `idhotel` INT NULL,
  `idvuelo` INT NULL,
  PRIMARY KEY (`idreserva`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;

INSERT INTO `bdagencia`.`hoteles` (`idhotel`, `nombre`, `categoria`, `precio`, `disponible`) VALUES ('1', 'Valencia', '5', '200', '1');
INSERT INTO `bdagencia`.`hoteles` (`idhotel`, `nombre`, `categoria`, `precio`, `disponible`) VALUES ('2', 'Benidorm', '3', '4000', '0');
INSERT INTO `bdagencia`.`hoteles` (`idhotel`, `nombre`, `categoria`, `precio`, `disponible`) VALUES ('3', 'MarinaD\'Or', '1', '1000', '0');
INSERT INTO `bdagencia`.`hoteles` (`idhotel`, `nombre`, `categoria`, `precio`, `disponible`) VALUES ('4', 'Barcelona', '2', '5000', '1');


INSERT INTO `bdagencia`.`vuelos` (`idvuelo`, `comp`, `fechavuelo`, `precio`, `plazasdisponibles`) VALUES ('1', 'Iberia', '2030-12-5', '100', '100');
INSERT INTO `bdagencia`.`vuelos` (`idvuelo`, `comp`, `fechavuelo`, `precio`, `plazasdisponibles`) VALUES ('2', 'Balearia', '2023-11-11', '20', '50');
INSERT INTO `bdagencia`.`vuelos` (`idvuelo`, `comp`, `fechavuelo`, `precio`, `plazasdisponibles`) VALUES ('3', 'Ryanair', '2025-6-25', '50', '20');
INSERT INTO `bdagencia`.`vuelos` (`idvuelo`, `comp`, `fechavuelo`, `precio`, `plazasdisponibles`) VALUES ('4', 'Ryanair', '2023-12-25', '600', '0');

INSERT INTO `bdagencia`.`reservas` (`idreserva`, `nombrecliente`, `dni`, `idhotel`, `idvuelo`) VALUES ('1', 'Apu', '264484Q', '1', '3');
INSERT INTO `bdagencia`.`reservas` (`idreserva`, `nombrecliente`, `dni`, `idhotel`, `idvuelo`) VALUES ('2', 'Homer', '48184R', '4', '2');
INSERT INTO `bdagencia`.`reservas` (`idreserva`, `nombrecliente`, `dni`, `idhotel`, `idvuelo`) VALUES ('3', 'Ramon', '1548161V', '3', '4');
INSERT INTO `bdagencia`.`reservas` (`idreserva`, `nombrecliente`, `dni`, `idhotel`, `idvuelo`) VALUES ('4', 'Nicolas', '5468185T', '2', '1');
