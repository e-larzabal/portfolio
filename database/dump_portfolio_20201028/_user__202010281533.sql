-- portfolio.`user` definition

CREATE TABLE `user` (
  `uuid` varchar(255) NOT NULL,
  `description` varchar(3000) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `account_non_expired` bit(1) DEFAULT NULL,
  `account_non_locked` bit(1) DEFAULT NULL,
  `credentials_non_expired` bit(1) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO portfolio.`user` (uuid,description,password,username,email,account_non_expired,account_non_locked,credentials_non_expired,enabled,first_name,last_name) VALUES
	 ('01d8f506-2bb5-4afd-a0a5-7e04e3690396',NULL,'$2a$10$bL5.YY72./PTN.yo7B1Y7e4lYllvEXYCFCEQzU0zRnzrn9jlRJoZW','admin','emmanuelle.larzabal64@gmail.com',1,1,1,1,'Emmanuelle','LARZABAL'),
	 ('2d33bba5-8919-4598-926b-ea17680108c7',NULL,'$2a$10$JhwZNEoyy2UAO8o0bZmlI.SVW/s1yW2Dd6fffYb.1hwuigh954iQm','user','emmanuelle.larzabal@gmail.com',1,1,1,1,'Maitane','JOAN');
