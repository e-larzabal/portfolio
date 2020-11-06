-- portfolio.privilege definition

CREATE TABLE `privilege` (
  `uuid` varchar(255) NOT NULL,
  `description` varchar(3000) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO portfolio.privilege (uuid,description,name) VALUES
	 ('0b305984-7d6f-47d4-8309-a608675181b0',NULL,'WRITE_PRIVILEGE'),
	 ('c9a23ca8-6f10-40ba-9005-e0dadcde7ff7',NULL,'READ_PRIVILEGE');
