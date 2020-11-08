-- portfolio.experience definition

CREATE TABLE `experience` (
  `uuid` varchar(255) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `line1` varchar(255) DEFAULT NULL,
  `line2` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `zip_code` int DEFAULT NULL,
  `date_begin` date DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `description` varchar(1500) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `society` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_view` int DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO portfolio.experience (uuid,city,line1,line2,phone,zip_code,date_begin,date_end,description,logo,society,name,order_view) VALUES
	 ('9ca7457e-cb37-4841-98fd-d5f6ad272ddf','Saint-Jean de luz','Centre d''affaire','ZI de Jalday',NULL,64500,'2000-03-27','2000-10-31','<p>
 <ul>
  <li>Développements d''évolutions des applications internes en <strong>Visual basic</strong>  </li>
  <li>Base de données <strong>Access</strong> </li>
 </ul>
</p>','logo_Olano.png','Olano Organisation','Analyste programmeur',NULL),
	 ('b0820051-1da3-4b55-9dae-f6afa59bd224','Anglet',' 6 Chemin de Jorlis',' ',NULL,64600,'2018-12-03','2019-06-26','<ul>
 <li>Développements évolutions/corrections </li>
 <li>Bases de données <strong>SQL Server</strong> </li>
</ul>','logo_BKSYSTEMES.svg','BK Systèmes','Ingénieur développement WinDev',NULL),
	 ('b4aacb63-36c8-4f99-bb2f-7b98f39769b1','Bayonne','6 chem Hayet',' ',NULL,64100,'2013-11-01','2018-11-30','<p>
 <ul>
  <li>Lead applications, automates, ERP & services web </li>
  <li>Langages/outils <strong>WinDev</strong>, <strong>WebDev</strong>, <strong>NodeJS</strong>, <strong>InnosSetup/Pascal objet</strong>, <strong>Bash</strong>, 
<strong>HTML5 & CSS3</strong> </li>
  <li>Bases de données <strong>HFSQL C/S</strong> &  <strong>MySQL</strong> </li>
 </ul>
</p>','logo_AMTRUST.png','AM TRUST IT','Concepteur Développeur',NULL),
	 ('d67912dc-2911-452a-a2f8-09bc81f7f2b1','Bidart','Technopole Izarbel','45, allée T. Monod ',NULL,64210,'2019-07-15','2020-03-17','<p>
 <ul>
  <li>Développements spécifiques clients </li>
  <li>Bases de données <strong>Oracle</strong> </li>
 </ul>
</p>','logo_odeis.jpg','RFI Informatique','Ingénieur développement WinDev',NULL),
	 ('d7969f0e-1799-431f-a621-7b490e4fd585','BIDART','Technopole Izarbel','Bat C',NULL,64210,'2008-07-01','2013-10-30','<ul>
 <li>Lead automates, ERP & services web <br> en <strong>WinDev</strong>, <strong>WebDev</strong> </li>
 <li>Bases de données <strong>HyperFileSQL C/S</strong>, <strong>MySQL</strong> </li>
</ul>','logo_ASP64_100x100.jpeg','ASP64','Concepteur développeur WinDev WebDev',NULL),
	 ('d9fc7a46-2fb3-4a2a-9167-9d54f7274f7d','BIRON','2 Allée DE L''INNOVATION',' ',NULL,64300,'2001-04-09','2008-04-30','<p>
 <ul>
  <li>Lead interfaces avec les logiciels RH et paie </li>
  <li>Bases de données <strong>HyperFileSQL</strong> </li>
 </ul>
</p>','logo_OCTIME.png','OCTIME SA','Analyste programmeur Windev WebDev',NULL);
