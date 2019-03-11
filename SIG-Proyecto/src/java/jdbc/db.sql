CREATE TABLE `NJhyvd1ujn`.`Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `nameUsuarios` VARCHAR(45) NOT NULL,
  `passwordUsuarios` VARCHAR(45)NOT NULL,
  PRIMARY KEY (`idUsuarios`),
  UNIQUE INDEX `nameUsuarios_UNIQUE` (`nameUsuarios` ASC) VISIBLE);

CREATE TABLE `NJhyvd1ujn`.`Ubicaciones` (
  `idUbicaciones` INT NOT NULL AUTO_INCREMENT,
  `nameUbicaciones` VARCHAR(45) NOT NULL,
  `detalleUbicaciones` VARCHAR(255) NOT NULL,
  `eventosUbicaciones` VARCHAR(255) NULL,
  `coordenadasUbicaciones` VARCHAR(45) NOT NULL,
  `codigoUsuarios` INT NOT NULL,
  PRIMARY KEY (`idUbicaciones`),
  UNIQUE INDEX `idUbicaciones_UNIQUE` (`idUbicaciones` ASC) VISIBLE,
  UNIQUE INDEX `nameUbicaciones_UNIQUE` (`nameUbicaciones` ASC) VISIBLE,
  UNIQUE INDEX `coordenadasUbicaciones_UNIQUE` (`coordenadasUbicaciones` ASC) VISIBLE,
  INDEX `fk_Ubicaciones_codigoUsuarios_idx` (`codigoUsuarios` ASC) VISIBLE,
  CONSTRAINT `fk_Ubicaciones_codigoUsuarios`
    FOREIGN KEY (`codigoUsuarios`)
    REFERENCES `NJhyvd1ujn`.`Usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
insert into Usuarios (nameUsuarios, passwordUsuarios) values ('luigi','1234');

insert into Ubicaciones(nameUbicaciones, detalleUbicaciones, eventosUbicaciones, coordenadasUbicaciones, codigoUsuarios)
values ('Estadio dennis Martinez','Estadio nacional de baseball Dennis Martinez Capacidad 15,000 Personas','No eventos','12.149603, -86.283036','1');

select * from Ubicaciones;

update Ubicaciones set eventosUbicaciones = 'Partido de baseball, NICARAGUA vs Puerto Rico'
where idUbicaciones = 1 and codigoUsuarios = 1;

delete from Ubicaciones where idUbicaciones = 1 and codigoUsuarios = 1;