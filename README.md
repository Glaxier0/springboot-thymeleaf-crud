# SpringBoot-Thymeleaf_CRUD
Postgresql database used in this project.

DATABASE SCRIPT:


CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` INTEGER,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews','leslie@mail.com'),
	(2,'Emma','Baumgarten','emma@mail.com'),
	(3,'Avani','Gupta','avani@mail.com'),
	(4,'Yuri','Petrov','yuri@mail.com'),
	(5,'Juan','Vega','juan@mail.com');

