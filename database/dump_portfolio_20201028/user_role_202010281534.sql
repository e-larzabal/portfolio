-- portfolio.user_role definition

CREATE TABLE `user_role` (
  `user_uuid` varchar(255) NOT NULL,
  `role_uuid` varchar(255) NOT NULL,
  KEY `FKt00adlkiqmt75ku44u130jkgg` (`role_uuid`),
  KEY `FKbs2mgns04479x7r0retwb15nm` (`user_uuid`),
  CONSTRAINT `FKbs2mgns04479x7r0retwb15nm` FOREIGN KEY (`user_uuid`) REFERENCES `user` (`uuid`),
  CONSTRAINT `FKt00adlkiqmt75ku44u130jkgg` FOREIGN KEY (`role_uuid`) REFERENCES `role` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO portfolio.user_role (user_uuid,role_uuid) VALUES
	 ('01d8f506-2bb5-4afd-a0a5-7e04e3690396','c697c7a7-5c80-456f-98df-274b6a578b04'),
	 ('2d33bba5-8919-4598-926b-ea17680108c7','4a93e6ca-61fa-497e-887e-6a224b5d8cca');
