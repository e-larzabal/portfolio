-- portfolio.token definition

CREATE TABLE `token` (
  `uuid` varchar(255) NOT NULL,
  `description` varchar(3000) DEFAULT NULL,
  `expiry_date` datetime DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `user_uuid` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FK4n4w2sa4c2lwxjga1h8rm85fx` (`user_uuid`),
  CONSTRAINT `FK4n4w2sa4c2lwxjga1h8rm85fx` FOREIGN KEY (`user_uuid`) REFERENCES `user` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
