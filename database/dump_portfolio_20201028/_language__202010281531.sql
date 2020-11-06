-- portfolio.`language` definition

CREATE TABLE `language` (
  `uuid` varchar(255) NOT NULL,
  `description` varchar(1500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `level` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `order_view` int DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO portfolio.`language` (uuid,description,`level`,name,logo,order_view) VALUES
	 ('15c27250-1c63-4566-91d1-177132866edf','AGL DevOps N°1 en France','EXPERT','Windev & Webdev','language_WLangage.jpeg',2),
	 ('593a6d8a-d204-459b-a6d1-7b00a4388cbb','CSS est un langage qui décrit le style d''un document HTML. CSS décrit comment les éléments HTML doivent être affichés.','DEBUTANT','CSS3','language_CSS3.jpeg',4),
	 ('989abd04-73ff-4fa1-b910-1eb66c725c3e','Java est un langage de programmation à usage général, évolué et orienté objet dont la syntaxe est proche du C. Ses caractéristiques ainsi que la richesse de son écosystème et de sa communauté lui ont permis d''être très largement utilisé pour le développement d''applications de types très disparates. Java est notamment largement utilisé pour le développement d''applications d''entreprises et mobiles.','DEBUTANT','JAVA 11','language_JAVA.jpeg',1),
	 ('b2a3b215-0bb5-48da-9062-e6597589ec04','SQL (sigle de Structured Query Language, en français langage de requête structurée) est un langage informatique normalisé servant à exploiter des bases de données relationnelles. La partie langage de manipulation des données de SQL permet de rechercher, d''ajouter, de modifier ou de supprimer des données dans les bases de données relationnelles.','AVANCE','SQL','language_SQL.jpeg',6),
	 ('b2e71f10-ded6-424a-897b-70be679a8494','Le HyperText Markup Language, généralement abrégé HTML ou dans sa dernière version HTML5, est le langage de balisage conçu pour représenter les pages web.','DEBUTANT','HTML5','language_HTML5.jpeg',3),
	 ('b578a6da-a79b-4fa8-9d08-cdff450374b3','JavaScript est un langage de programmation de scripts principalement employé dans les pages web intéractives mais aussi pour les serveurs avec l''utilisation (par exemple) de Node.js ou de Deno. Il s''exécute à l''aide d''un programme spécial appelé "Moteur Javascript".','DEBUTANT','JavaScript','language_Javascript.jpeg',5),
	 ('f32ba56d-3f39-41b8-b28a-11a088cf2ac0','GNU Bash ou simplement Bash est un shell Unix et un langage de commande.','DEBUTANT','BASH','language_Bash.jpeg',7);
