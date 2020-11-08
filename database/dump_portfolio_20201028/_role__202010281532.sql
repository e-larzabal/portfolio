-- portfolio.`role` definition

CREATE TABLE `role` (
  `uuid` varchar(255) NOT NULL,
  `description` varchar(3000) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO portfolio.`role` (uuid,description,name) VALUES
	 ('4a93e6ca-61fa-497e-887e-6a224b5d8cca','User','ROLE_USER'),
	 ('c697c7a7-5c80-456f-98df-274b6a578b04','Admin','ROLE_ADMIN');
