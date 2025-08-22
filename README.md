**IMPORTANT**

Import csv files in root folder to sql workbench before starting the server.

Import only the attributes - id, title, continent, country_state, description, serves, cuisine, url, rating, total_time, prep_time, cook_timme.

*SQL query to create table*

CREATE TABLE `recipes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cusine` varchar(500) NOT NULL,
  `title` varchar(500) NOT NULL,
  `continent` varchar(500) DEFAULT NULL,
  `country_state` varchar(5) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `rating` float DEFAULT NULL,
  `total_time` int DEFAULT NULL,
  `prep_time` int DEFAULT NULL,
  `cook_time` int DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL,
  `serves` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7998 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
