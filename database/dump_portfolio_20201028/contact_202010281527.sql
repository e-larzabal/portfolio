-- portfolio.contact definition

CREATE TABLE `contact` (
  `uuid` varchar(255) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `line1` varchar(255) DEFAULT NULL,
  `line2` varchar(255) DEFAULT NULL,
  `zip_code` int DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `github_link` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `linked_in_link` varchar(255) DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `description` varchar(1500) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO portfolio.contact (uuid,city,line1,line2,zip_code,birth_date,first_name,github_link,last_name,linked_in_link,profession,phone,email,description) VALUES
	 ('e29e2dd5-2812-4a7c-b15d-30962ed4a8ff','ASCAIN','105, Chemin de Lekumberia','Maison Iduzkiari Begira',64310,'1971-07-05','Emmanuelle','https://github.com/e-larzabal','LARZABAL','https://www.linkedin.com/in/emmanuelle-larzabal/','Concepteur Développeur Web Java','+33(0)6 84 23 73 11','emmanuelle.larzabal64@gmail.com','<p>
<div>
Concepteur développeur en informatique de gestion depuis 20 ans, dans diverses sociétés éditrices de logiciels et dans différents secteurs d''activité, j''ai décidé de me reconvertir pour donner un nouvel élan à ma carrière professionnelle.
</div>
<br>
<div>
Pour cela, j''ai suivi une formation intensive, de 3 mois, sur sélection de pré-requis à la <em>Wild Code School</em> : <strong>Concepteur Développeur web et web mobile JAVA JEE</strong>. 
</div>
<br>
<div>
Cette formation forme à de nouvelles compétences mais forme également à l''autonomie dans l''apprentissage pour évoluer ensuite dans son poste tout au long de sa carrière.
</div>
<br>
<div>
Je suis à présent à l''écoute de toute opportunité sur la côte Basque et plus loin si le télétravail est possible.
</div>
</p>');
