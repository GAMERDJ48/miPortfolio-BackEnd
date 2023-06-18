/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.32 : Database - portfolio
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`portfolio` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `portfolio`;

/*Table structure for table `contacto` */

DROP TABLE IF EXISTS `contacto`;

CREATE TABLE `contacto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `url` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `contacto` */

insert  into `contacto`(`id`,`nombre`,`url`) values 
(1,'Linkedin','https://www.linkedin.com/in/franco-ruiz-64a24423b/'),
(2,'Gmail','mailto:francoruiz.48.2000@gmail.com'),
(3,'Instagram','https://www.instagram.com/francoruiz2000'),
(4,'Facebook','https://www.facebook.com/ruizfranco2000');

/*Table structure for table `experiencia` */

DROP TABLE IF EXISTS `experiencia`;

CREATE TABLE `experiencia` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `anio_desde` int NOT NULL,
  `anio_hasta` int DEFAULT NULL,
  `descripcion` longtext,
  `organizacion` varchar(100) DEFAULT NULL,
  `puesto` varchar(100) DEFAULT NULL,
  `url_imagen` longtext,
  `tipo_organizacion_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfik7oivhji5lfiy21nbufb0e8` (`tipo_organizacion_id`),
  CONSTRAINT `FKfik7oivhji5lfiy21nbufb0e8` FOREIGN KEY (`tipo_organizacion_id`) REFERENCES `tipoorganizacion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `experiencia` */

insert  into `experiencia`(`id`,`anio_desde`,`anio_hasta`,`descripcion`,`organizacion`,`puesto`,`url_imagen`,`tipo_organizacion_id`) values 
(1,2023,NULL,'Soy miembro de AIESEC en Mendoza, el cual es una asociación civil internacional sin fines de lucro con la misión del desarrollo de liderazgo en los jovenes. Esta ubicada en 110 paises y se especializa en intercambios internacionales de voluntariado y laborales. ','AIESEC','Miembro del equipo de alianzas estrategicas','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpKGP2IeyZ9AZ548WmeHzrXIYa2SLoRsg7UNO-XMo6CCRppVo-vzupCaYRYxufuI609xk&usqp=CAU',4),
(2,2022,NULL,'MILLCAYAC, kiosco en Maipú, referencias 2615326569, Eugenia','Kiosco MILLCAYAC','Atención al cliente','',1),
(3,2021,2022,'Fue un trabajo que hice como programador independiente donde diseñe y desarrolle un software de control de máquinas cosechadoras para la empresa Martins Domingos. El software incluye control de: combustible, stock, facturas, remitos,cosechas, vehículos, etc. ','Martins Domingos','Programador Independiente','',1);

/*Table structure for table `formacion` */

DROP TABLE IF EXISTS `formacion`;

CREATE TABLE `formacion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `anio_desde` int NOT NULL,
  `anio_hasta` int DEFAULT NULL,
  `descripcion` longtext,
  `especialidad` varchar(100) DEFAULT NULL,
  `organizacion` varchar(100) DEFAULT NULL,
  `url_imagen` longtext,
  `tipo_organizacion_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqmnbyeursjw8gm6ti5sq1vdnb` (`tipo_organizacion_id`),
  CONSTRAINT `FKqmnbyeursjw8gm6ti5sq1vdnb` FOREIGN KEY (`tipo_organizacion_id`) REFERENCES `tipoorganizacion` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `formacion` */

insert  into `formacion`(`id`,`anio_desde`,`anio_hasta`,`descripcion`,`especialidad`,`organizacion`,`url_imagen`,`tipo_organizacion_id`) values 
(1,2019,NULL,'Ingeniería en Sistemas de información(cursando el ultimo año, fecha tentativa de finalizado 2024). ','Ingenieria en Sistemas','Universidad Tecnologica Nacional - Facultad Regional Mendoza','https://utn.edu.ar/images/logo-utn.png',2),
(2,2020,2022,'Realize hasta 4to año de Ingles en AMICANA, Institución de Ingles. Puedo decir que tengo un nivel intermedio de ingles. ','Ingles','AMICANA','http://www.amicana.com/images/logo.jpg',1);

/*Table structure for table `habilidad` */

DROP TABLE IF EXISTS `habilidad`;

CREATE TABLE `habilidad` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nivel_habilidad` int NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `habilidad` */

insert  into `habilidad`(`id`,`nivel_habilidad`,`nombre`) values 
(1,73,'Java'),
(2,35,'Python'),
(3,53,'Spring'),
(4,45,'Bootstrap'),
(5,61,'Thymeleaf'),
(6,40,'HTML'),
(7,55,'Ingles');

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(100) DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `url_banner` longtext,
  `url_foto` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona` */

insert  into `persona`(`id`,`apellido`,`descripcion`,`fecha_nacimiento`,`nombre`,`telefono`,`url_banner`,`url_foto`) values 
(1,'Ruiz','Soy alumno de 5to año de Ingeniería en Sistemas en la Universidad Tecnológica Nacional y deseo desempeñarme a nivel profesional, Me desempeño en programación, soy receptivo a las nuevas ideas y las pongo en practica. Además me adapto muy bien a los cambios emergentes','2000-02-19','Franco','2616619199','https://images.pexels.com/photos/1447092/pexels-photo-1447092.png?cs=srgb&dl=pexels-thanhhoa-tran-1447092.jpg&fm=jpg','https://media.licdn.com/dms/image/D4D03AQHS4I_BfT5afA/profile-displayphoto-shrink_100_100/0/1675897086739?e=1689206400&v=beta&t=EaGeDinJJACjWemAT1hrjrqnBQjlJbjsSsVhvLkk7eE'),
(2,'Ruiz','Soy alumno de 5to año de Ingeniería en Sistemas en la Universidad Tecnológica Nacional y deseo desempeñarme a nivel profesional, Me desempeño en programación, soy receptivo a las nuevas ideas y las pongo en practica. Además me adapto muy bien a los cambios emergentes','2000-02-19','Franco','2616619199','https://images.pexels.com/photos/1447092/pexels-photo-1447092.png?cs=srgb&dl=pexels-thanhhoa-tran-1447092.jpg&fm=jpg','https://media.licdn.com/dms/image/D4D03AQHS4I_BfT5afA/profile-displayphoto-shrink_100_100/0/1675897086739?e=1689206400&v=beta&t=EaGeDinJJACjWemAT1hrjrqnBQjlJbjsSsVhvLkk7eE');

/*Table structure for table `persona_contactos` */

DROP TABLE IF EXISTS `persona_contactos`;

CREATE TABLE `persona_contactos` (
  `persona_id` bigint NOT NULL,
  `contactos_id` bigint NOT NULL,
  UNIQUE KEY `UK_d09cqltex11ycm1hauogmwpvr` (`contactos_id`),
  KEY `FKbikpqkeeva80hjq3jj3151akc` (`persona_id`),
  CONSTRAINT `FK4ec97xvrj6dxpfuseejb1kdfs` FOREIGN KEY (`contactos_id`) REFERENCES `contacto` (`id`),
  CONSTRAINT `FKbikpqkeeva80hjq3jj3151akc` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona_contactos` */

insert  into `persona_contactos`(`persona_id`,`contactos_id`) values 
(2,1),
(2,2),
(2,3),
(2,4);

/*Table structure for table `persona_experiencias` */

DROP TABLE IF EXISTS `persona_experiencias`;

CREATE TABLE `persona_experiencias` (
  `persona_id` bigint NOT NULL,
  `experiencias_id` bigint NOT NULL,
  UNIQUE KEY `UK_opau9bdobomaxulnkmmx905rw` (`experiencias_id`),
  KEY `FK505cgyaprhhq9c0mj2385ep39` (`persona_id`),
  CONSTRAINT `FK505cgyaprhhq9c0mj2385ep39` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `FKoiilajr94gddma2k7kdmljefl` FOREIGN KEY (`experiencias_id`) REFERENCES `experiencia` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona_experiencias` */

insert  into `persona_experiencias`(`persona_id`,`experiencias_id`) values 
(2,1),
(2,2),
(2,3);

/*Table structure for table `persona_formacion` */

DROP TABLE IF EXISTS `persona_formacion`;

CREATE TABLE `persona_formacion` (
  `persona_id` bigint NOT NULL,
  `formacion_id` bigint NOT NULL,
  UNIQUE KEY `UK_306t80ou7pcp8uvnnku07wy6c` (`formacion_id`),
  KEY `FKhvjed9rvw2tbvyba7bwvxn7xr` (`persona_id`),
  CONSTRAINT `FKhvjed9rvw2tbvyba7bwvxn7xr` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `FKthkyrxirfb1ovcapu48bnpm32` FOREIGN KEY (`formacion_id`) REFERENCES `formacion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona_formacion` */

insert  into `persona_formacion`(`persona_id`,`formacion_id`) values 
(2,1),
(2,2);

/*Table structure for table `persona_habilidades` */

DROP TABLE IF EXISTS `persona_habilidades`;

CREATE TABLE `persona_habilidades` (
  `persona_id` bigint NOT NULL,
  `habilidades_id` bigint NOT NULL,
  KEY `FK9kuij5gcn4k5yk0oo5yic055c` (`habilidades_id`),
  KEY `FKapphx0apgaabqwoxdmieo65sl` (`persona_id`),
  CONSTRAINT `FK9kuij5gcn4k5yk0oo5yic055c` FOREIGN KEY (`habilidades_id`) REFERENCES `habilidad` (`id`),
  CONSTRAINT `FKapphx0apgaabqwoxdmieo65sl` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona_habilidades` */

insert  into `persona_habilidades`(`persona_id`,`habilidades_id`) values 
(2,1),
(2,2),
(2,3),
(2,4),
(2,5),
(2,6),
(2,7);

/*Table structure for table `persona_proyectos` */

DROP TABLE IF EXISTS `persona_proyectos`;

CREATE TABLE `persona_proyectos` (
  `persona_id` bigint NOT NULL,
  `proyectos_id` bigint NOT NULL,
  UNIQUE KEY `UK_bow55nkr2gii0vg08t3ex3l59` (`proyectos_id`),
  KEY `FK318a7k9m9hdd80xbfqv50g9il` (`persona_id`),
  CONSTRAINT `FK318a7k9m9hdd80xbfqv50g9il` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`id`),
  CONSTRAINT `FKgwholmyc4tlkft7gq4yds93ma` FOREIGN KEY (`proyectos_id`) REFERENCES `proyecto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `persona_proyectos` */

insert  into `persona_proyectos`(`persona_id`,`proyectos_id`) values 
(2,1),
(2,2);

/*Table structure for table `proyecto` */

DROP TABLE IF EXISTS `proyecto`;

CREATE TABLE `proyecto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `anio_desde` int NOT NULL,
  `anio_hasta` int DEFAULT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `url_back` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `proyecto` */

insert  into `proyecto`(`id`,`anio_desde`,`anio_hasta`,`descripcion`,`titulo`,`url`,`url_back`) values 
(1,2022,NULL,'Se realizo una aplicacion web donde mostramos nuestro CV o mejor dicho es nuestro portfolio. Esta app tiene secciones de: contactos (redes sociales); Experiencias que hayamos tenido cualquier organización; Formación Academica; Habilidades; Proyectos de programación.','Portfolio Web con #YoProgramo','',''),
(2,2022,2023,'Proyecto que realize como programador independiente en Martins Domingos. Por razones de confidencialidad, no me puedo brindar el GitHub del software.','Sistema de Control de Stock y Facturación de Maquinas Cosechadoras (SCSF)','','');

/*Table structure for table `proyecto_tecnologias` */

DROP TABLE IF EXISTS `proyecto_tecnologias`;

CREATE TABLE `proyecto_tecnologias` (
  `proyecto_id` bigint NOT NULL,
  `tecnologia` varchar(255) DEFAULT NULL,
  KEY `FK8b8gf1vphye9o5v9nsnoerbgr` (`proyecto_id`),
  CONSTRAINT `FK8b8gf1vphye9o5v9nsnoerbgr` FOREIGN KEY (`proyecto_id`) REFERENCES `proyecto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `proyecto_tecnologias` */

insert  into `proyecto_tecnologias`(`proyecto_id`,`tecnologia`) values 
(2,'Java'),
(2,'Spring'),
(2,'Angular'),
(2,'Bootstrap'),
(1,'Java'),
(1,'Spring'),
(1,'Thymeleaf'),
(1,'Bootstrap');

/*Table structure for table `tipoorganizacion` */

DROP TABLE IF EXISTS `tipoorganizacion`;

CREATE TABLE `tipoorganizacion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `tipoorganizacion` */

insert  into `tipoorganizacion`(`id`,`nombre`) values 
(1,'Empresa'),
(2,'Universidad'),
(3,'Escuela Secundaria'),
(4,'ONG');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `usuario` */

insert  into `usuario`(`id`,`password`,`username`) values 
(1,'admin','admin');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
