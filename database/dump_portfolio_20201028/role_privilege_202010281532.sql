-- portfolio.role_privilege definition

CREATE TABLE `role_privilege` (
  `role_uuid` varchar(255) NOT NULL,
  `privilege_uuid` varchar(255) NOT NULL,
  KEY `FKemvmxe35bodg99ajd23lqfn4b` (`privilege_uuid`),
  KEY `FKj4agt59s2mw6k8iyqf7ai0yxr` (`role_uuid`),
  CONSTRAINT `FKemvmxe35bodg99ajd23lqfn4b` FOREIGN KEY (`privilege_uuid`) REFERENCES `privilege` (`uuid`),
  CONSTRAINT `FKj4agt59s2mw6k8iyqf7ai0yxr` FOREIGN KEY (`role_uuid`) REFERENCES `role` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
