-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: i_mum_zone
-- ------------------------------------------------------
-- Server version	5.6.37-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_user`
--

DROP TABLE IF EXISTS `admin_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(45) DEFAULT NULL,
  `LAST_NAME` varchar(45) DEFAULT NULL,
  `OTHER_NAME` varchar(45) DEFAULT NULL,
  `LOGIN_ID` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `DATED_CREATED` datetime DEFAULT NULL,
  `LAST_LOGIN_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_user`
--

LOCK TABLES `admin_user` WRITE;
/*!40000 ALTER TABLE `admin_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `application_user`
--

DROP TABLE IF EXISTS `application_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `APPROVED_BY` varchar(255) DEFAULT NULL,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `DATE_APPROVED` datetime DEFAULT NULL,
  `DATE_CREATED` datetime DEFAULT NULL,
  `DATE_LAST_LOGON` datetime DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `FIRST_LOGIN` bit(1) DEFAULT NULL,
  `SESSION_ID` varchar(255) DEFAULT NULL,
  `STATUS` bit(1) DEFAULT NULL,
  `USER_FIRST_NAME` varchar(255) DEFAULT NULL,
  `USER_LAST_NAME` varchar(255) DEFAULT NULL,
  `USER_LOGIN_NAME` varchar(255) DEFAULT NULL,
  `USER_PASSWORD` varchar(255) DEFAULT NULL,
  `USER_TYPE` varchar(255) DEFAULT NULL,
  `USER_UNIQUE_REFERENCE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application_user`
--

LOCK TABLES `application_user` WRITE;
/*!40000 ALTER TABLE `application_user` DISABLE KEYS */;
INSERT INTO `application_user` VALUES (41,NULL,NULL,NULL,'2017-11-02 09:58:38','2018-02-08 15:59:51','admin@nucleus.com','\0','9o5c9051c7qnqsbf52emk3o6im','','Admin','Admin','admin@nucleus.com','3d4f2bf07d','NUCLEUS_ADMIN',0),(45,NULL,NULL,NULL,'2017-11-06 22:00:42','2018-02-09 11:25:09','wale@youngsoul.ng','\0','nhd9n2cq93tnuee0kd9v99t5c8','','AVON HMO',NULL,'wale@youngsoul.ng','08803c928c','HMO',13),(46,NULL,NULL,NULL,'2017-11-06 22:56:39','2018-02-11 08:58:21','info@premierhospital.com','\0','jfj6rbvctlo2gkctt0a1lrhqjb','','PREMIER HOSPITAL',NULL,'info@premierhospital.com','08803c928c','HOSPITAL',32),(47,NULL,NULL,NULL,'2017-11-06 22:57:48','2017-11-06 22:57:48','info@jraphahospital','','3j9tqdrptv3f745323b2oobo3g','','JRAPHA HOSPITAL',NULL,'info@jraphahospital','3d4f2bf07d','HOSPITAL',33),(48,NULL,NULL,NULL,'2017-11-06 23:07:35','2017-11-07 00:30:55','info@avonmedicalcentre.com','','phlvsmflus3pqerqsjaaqr5k66','','AVON MEDICAL CLINIC',NULL,'info@avonmedicalcentre.com','3d4f2bf07d','HOSPITAL',34),(49,NULL,NULL,NULL,'2017-11-06 23:09:49','2017-11-06 23:09:49','info@citizenhospital.com','','3987oe568l98pfa8mb9tcdmsrb','','CITIZEN Hospital',NULL,'info@citizenhospital.com','3d4f2bf07d','HOSPITAL',35),(50,NULL,NULL,NULL,'2017-11-06 23:11:28','2017-11-12 19:07:33','info@ekohospital.com','\0','k0ib6tveupsdptg3snk3tl8ju','','Eko Hospital',NULL,'info@ekohospital.com','3d4f2bf07d','HOSPITAL',36),(51,NULL,NULL,NULL,'2017-11-06 23:15:21','2017-11-06 23:15:21','info@kupamedicalcentre.com','','tgqrt2r7vbvii7bglrmei0r7b9','','KUPA Medical Centre',NULL,'info@kupamedicalcentre.com','3d4f2bf07d','HOSPITAL',37),(52,NULL,NULL,NULL,'2017-11-06 23:17:15','2017-11-06 23:17:15','info@goldcross.com','','n5dbhe4353ij6eiiqq06r3pum0','','Gold Cross Hospital',NULL,'info@goldcross.com','3d4f2bf07d','HOSPITAL',38),(53,NULL,NULL,NULL,'2017-11-06 23:24:40','2017-11-06 23:24:40','info@sheriffclinic.com','','6nr6u48cmahjdrgn50e5a8q6m6','','SHERIFF CLINIC',NULL,'info@sheriffclinic.com','3d4f2bf07d','HOSPITAL',39),(54,NULL,NULL,NULL,'2017-11-07 13:36:13','2017-11-08 14:32:58','feminiyi2002@yahoo.com','','gjmq83cnh180bdmn4jgrv99jva','','MANSARD',NULL,'feminiyi2002@yahoo.com','3d4f2bf07d','HMO',14),(55,NULL,NULL,NULL,'2017-11-07 13:44:58',NULL,'feminiyi2002@yahoo.com','',NULL,'','Ifeoluwa Hospitals',NULL,'feminiyi2002@yahoo.com','3d4f2bf07d','HOSPITAL',40),(56,NULL,NULL,NULL,'2017-11-08 17:18:11','2017-11-21 21:30:30','kayodeodeyinde@gmail.com','\0','ufn9s8cokmuvb2f8t9ie4dtmm5','','olukayode HMO',NULL,'kayodeodeyinde@gmail.com','3d4f2bf07d','HMO',15),(57,NULL,NULL,NULL,'2017-11-21 21:21:59',NULL,'info@marienhospital.com','',NULL,'','marien hospital',NULL,'info@marienhospital.com','b4363bafa6','HOSPITAL',41),(58,NULL,NULL,NULL,'2017-11-22 04:15:47',NULL,'oche.omale@gmail.com','',NULL,'','Test 1 HMO',NULL,'oche.omale@gmail.com','87377f6865','HMO',16),(64,NULL,NULL,NULL,'2017-11-22 05:40:38',NULL,'oche.omale@yahoo.co.uk','',NULL,'','Test 1 Hospital',NULL,'oche.omale@yahoo.co.uk','1504dcf203','HOSPITAL',47),(65,NULL,NULL,NULL,'2017-11-22 12:01:50','2018-02-11 08:56:58','olutobihassan@gmail.com','\0','e4sp7a0h05jh86ljfkob5goovg','','OLAWALE','AHMED','olutobihassan@gmail.com','08803c928c','BENEFICIARY',10),(66,NULL,NULL,NULL,'2017-12-07 11:38:06',NULL,'x@x.com','',NULL,'','xxx','Admin','x@x.com','5f932c54b9','HOSPITAL',48),(67,NULL,NULL,NULL,'2018-01-19 21:27:51',NULL,'shile@litmuslottery.com','',NULL,'','IDEAL HOSPITAL','Admin','shile@litmuslottery.com','806497c4e7','HOSPITAL',49),(68,NULL,NULL,NULL,'2018-01-19 21:32:39','2018-01-19 21:41:18','shile@litmusluxury.com','\0','dsogr52m5m6lr8uopigr5on3lg','','ideal hospitals','Admin','shile@litmusluxury.com','b07d3e5326','HOSPITAL',50),(69,NULL,NULL,NULL,'2018-01-22 07:08:27',NULL,'info@UHI.com','',NULL,'','UNITED HEALTHCARE INTENATIONAL','Admin','info@UHI.com','d70c8f0b51','HMO',17),(70,NULL,NULL,NULL,'2018-02-08 15:48:30',NULL,'info@zenithmedicare.com','',NULL,'','Zenith Medicare','Admin','info@zenithmedicare.com','fb6598934f','HMO',18),(71,NULL,NULL,NULL,'2018-02-08 19:39:29',NULL,'info@stnicholas.com','',NULL,'','ST NICHOLAS','Admin','info@stnicholas.com','600b5e4f36','HOSPITAL',51);
/*!40000 ALTER TABLE `application_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `audit_trail`
--

DROP TABLE IF EXISTS `audit_trail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audit_trail` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADMIN_USERS_STAFF_ID` varchar(255) NOT NULL,
  `OPERATION` varchar(255) NOT NULL,
  `SOURCE_IP` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `TRAIL_DATE` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audit_trail`
--

LOCK TABLES `audit_trail` WRITE;
/*!40000 ALTER TABLE `audit_trail` DISABLE KEYS */;
/*!40000 ALTER TABLE `audit_trail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `child_profile`
--

DROP TABLE IF EXISTS `child_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `child_profile` (
  `ID` int(20) NOT NULL,
  `FIRST_NAME` varchar(45) NOT NULL,
  `LAST_NAME` varchar(45) NOT NULL,
  `OTHER_NAME` varchar(45) DEFAULT NULL,
  `GENDER` varchar(45) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `HEIGHT` double NOT NULL,
  `WEIGHT` double NOT NULL,
  `DATE_CREATED` datetime NOT NULL,
  `IMAGE` varchar(45) DEFAULT NULL,
  `USER_ID` int(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `user_child_profile_idx` (`USER_ID`),
  CONSTRAINT `USER_CHILD_PROFILE` FOREIGN KEY (`USER_ID`) REFERENCES `zone_user` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `child_profile`
--

LOCK TABLES `child_profile` WRITE;
/*!40000 ALTER TABLE `child_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `child_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `child_story`
--

DROP TABLE IF EXISTS `child_story`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `child_story` (
  `ID` int(20) NOT NULL,
  `CHILD_PROFILE_ID` int(20) NOT NULL,
  `STORY_ID` varchar(50) NOT NULL,
  `STORY_PERIOD` varchar(25) NOT NULL,
  `HEIGHT` double NOT NULL,
  `WEIGHT` double NOT NULL,
  `RECENT_PICTURE` longblob,
  `DATE_STORY_CREATED` datetime NOT NULL,
  `STORY_DESCRIPTION` varchar(250) DEFAULT NULL,
  `LINKED_STORY_ID` varchar(45) DEFAULT NULL,
  `HEIGHT_STATUS` varchar(15) DEFAULT NULL,
  `AGE_GROUP` varchar(15) DEFAULT NULL,
  `WEIGHT_STATUS` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `child_profile_story_idx` (`CHILD_PROFILE_ID`),
  CONSTRAINT `CHILD_PROFILE_STORY` FOREIGN KEY (`CHILD_PROFILE_ID`) REFERENCES `child_profile` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `child_story`
--

LOCK TABLES `child_story` WRITE;
/*!40000 ALTER TABLE `child_story` DISABLE KEYS */;
/*!40000 ALTER TABLE `child_story` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `function_type`
--

DROP TABLE IF EXISTS `function_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `function_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADVANCED` bit(1) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `function_type`
--

LOCK TABLES `function_type` WRITE;
/*!40000 ALTER TABLE `function_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `function_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `functions`
--

DROP TABLE IF EXISTS `functions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `functions` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CREATION_DATE` datetime NOT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `MASK` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `FUNCTION_TYPE` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKi149bk5kb8t7avpot77msbj7q` (`FUNCTION_TYPE`),
  CONSTRAINT `FKi149bk5kb8t7avpot77msbj7q` FOREIGN KEY (`FUNCTION_TYPE`) REFERENCES `function_type` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `functions`
--

LOCK TABLES `functions` WRITE;
/*!40000 ALTER TABLE `functions` DISABLE KEYS */;
/*!40000 ALTER TABLE `functions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  `FK_STATE` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK25txcpom4j5q4p4du6pmwx1h2` (`FK_STATE`),
  CONSTRAINT `FK25txcpom4j5q4p4du6pmwx1h2` FOREIGN KEY (`FK_STATE`) REFERENCES `state` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=875 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (101,'Aba North',1),(102,'Aba South',1),(103,'Arochukwu',1),(104,'Bende',1),(105,'Ikwuano',1),(106,'Isiala Ngwa North',1),(107,'Isiala Ngwa South',1),(108,'Isuikwuato',1),(109,'Obi Ngwa',1),(110,'Ohafia',1),(111,'Osisioma',1),(112,'Ugwunagbo',1),(113,'Ukwa East',1),(114,'Ukwa West',1),(115,'Umuahia North',1),(116,'Umuahia South',1),(117,'Umu Nneochi',1),(118,'Demsa',2),(119,'Fufure',2),(120,'Ganye',2),(121,'Gayuk',2),(122,'Gombi',2),(123,'Grie',2),(124,'Hong',2),(125,'Jada',2),(126,'Lamurde',2),(127,'Madagali',2),(128,'Maiha',2),(129,'Mayo Belwa',2),(130,'Michika',2),(131,'Mubi North',2),(132,'Mubi South',2),(133,'Numan',2),(134,'Shelleng',2),(135,'Song',2),(136,'Toungo',2),(137,'Yola North',2),(138,'Yola South',2),(139,'Abak',3),(140,'Eastern Obolo',3),(141,'Eket',3),(142,'Esit Eket',3),(143,'Essien Udim',3),(144,'Etim Ekpo',3),(145,'Etinan',3),(146,'Ibeno',3),(147,'Ibesikpo Asutan',3),(148,'Ibiono-Ibom',3),(149,'Ika',3),(150,'Ikono',3),(151,'Ikot Abasi',3),(152,'Ikot Ekpene',3),(153,'Ini',3),(154,'Itu',3),(155,'Mbo',3),(156,'Mkpat-Enin',3),(157,'Nsit-Atai',3),(158,'Nsit-Ibom',3),(159,'Nsit-Ubium',3),(160,'Obot Akara',3),(161,'Okobo',3),(162,'Onna',3),(163,'Oron',3),(164,'Oruk Anam',3),(165,'Udung-Uko',3),(166,'Ukanafun',3),(167,'Uruan',3),(168,'Urue-Offong/Oruko',3),(169,'Uyo',3),(170,'Aguata',4),(171,'Anambra East',4),(172,'Anambra West',4),(173,'Anaocha',4),(174,'Awka North',4),(175,'Awka South',4),(176,'Ayamelum',4),(177,'Dunukofia',4),(178,'Ekwusigo',4),(179,'Idemili North',4),(180,'Idemili South',4),(181,'Ihiala',4),(182,'Njikoka',4),(183,'Nnewi North',4),(184,'Nnewi South',4),(185,'Ogbaru',4),(186,'Onitsha North',4),(187,'Onitsha South',4),(188,'Orumba North',4),(189,'Orumba South',4),(190,'Oyi',4),(191,'Alkaleri',5),(192,'Bauchi',5),(193,'Bogoro',5),(194,'Damban',5),(195,'Darazo',5),(196,'Dass',5),(197,'Gamawa',5),(198,'Ganjuwa',5),(199,'Giade',5),(200,'Itas/Gadau',5),(201,'Jama\'are',5),(202,'Katagum',5),(203,'Kirfi',5),(204,'Misau',5),(205,'Ningi',5),(206,'Shira',5),(207,'Tafawa Balewa',5),(208,'Toro',5),(209,'Warji',5),(210,'Zaki',5),(211,'Brass',6),(212,'Ekeremor',6),(213,'Kolokuma/Opokuma',6),(214,'Nembe',6),(215,'Ogbia',6),(216,'Sagbama',6),(217,'Southern Ijaw',6),(218,'Yenagoa',6),(219,'Agatu',7),(220,'Apa',7),(221,'Ado',7),(222,'Buruku',7),(223,'Gboko',7),(224,'Guma',7),(225,'Gwer East',7),(226,'Gwer West',7),(227,'Katsina-Ala',7),(228,'Konshisha',7),(229,'Kwande',7),(230,'Logo',7),(231,'Makurdi',7),(232,'Obi',7),(233,'Ogbadibo',7),(234,'Ohimini',7),(235,'Oju',7),(236,'Okpokwu',7),(237,'Oturkpo',7),(238,'Tarka',7),(239,'Ukum',7),(240,'Ushongo',7),(241,'Vandeikya',7),(242,'Abadam',8),(243,'Askira/Uba',8),(244,'Bama',8),(245,'Bayo',8),(246,'Biu',8),(247,'Chibok',8),(248,'Damboa',8),(249,'Dikwa',8),(250,'Gubio',8),(251,'Guzamala',8),(252,'Gwoza',8),(253,'Hawul',8),(254,'Jere',8),(255,'Kaga',8),(256,'Kala/Balge',8),(257,'Konduga',8),(258,'Kukawa',8),(259,'Kwaya Kusar',8),(260,'Mafa',8),(261,'Magumeri',8),(262,'Maiduguri',8),(263,'Marte',8),(264,'Mobbar',8),(265,'Monguno',8),(266,'Ngala',8),(267,'Nganzai',8),(268,'Shani',8),(269,'Abi',9),(270,'Akamkpa',9),(271,'Akpabuyo',9),(272,'Bakassi',9),(273,'Bekwarra',9),(274,'Biase',9),(275,'Boki',9),(276,'Calabar Municipal',9),(277,'Calabar South',9),(278,'Etung',9),(279,'Ikom',9),(280,'Obanliku',9),(281,'Obubra',9),(282,'Obudu',9),(283,'Odukpani',9),(284,'Ogoja',9),(285,'Yakuur',9),(286,'Yala',9),(287,'Aniocha North',10),(288,'Aniocha South',10),(289,'Bomadi',10),(290,'Burutu',10),(291,'Ethiope East',10),(292,'Ethiope West',10),(293,'Ika North East',10),(294,'Ika South',10),(295,'Isoko North',10),(296,'Isoko South',10),(297,'Ndokwa East',10),(298,'Ndokwa West',10),(299,'Okpe',10),(300,'Oshimili North',10),(301,'Oshimili South',10),(302,'Patani',10),(303,'Sapele',10),(304,'Udu',10),(305,'Ughelli North',10),(306,'Ughelli South',10),(307,'Ukwuani',10),(308,'Uvwie',10),(309,'Warri North',10),(310,'Warri South',10),(311,'Warri South West',10),(312,'Abakaliki',11),(313,'Afikpo North',11),(314,'Afikpo South',11),(315,'Ebonyi',11),(316,'Ezza North',11),(317,'Ezza South',11),(318,'Ikwo',11),(319,'Ishielu',11),(320,'Ivo',11),(321,'Izzi',11),(322,'Ohaozara',11),(323,'Ohaukwu',11),(324,'Onicha',11),(325,'Akoko-Edo',12),(326,'Egor',12),(327,'Esan Central',12),(328,'Esan North-East',12),(329,'Esan South-East',12),(330,'Esan West',12),(331,'Etsako Central',12),(332,'Etsako East',12),(333,'Etsako West',12),(334,'Igueben',12),(335,'Ikpoba Okha',12),(336,'Orhionmwon',12),(337,'Oredo',12),(338,'Ovia North-East',12),(339,'Ovia South-West',12),(340,'Owan East',12),(341,'Owan West',12),(342,'Uhunmwonde',12),(343,'Ado Ekiti',13),(344,'Efon',13),(345,'Ekiti East',13),(346,'Ekiti South-West',13),(347,'Ekiti West',13),(348,'Emure',13),(349,'Gbonyin',13),(350,'Ido Osi',13),(351,'Ijero',13),(352,'Ikere',13),(353,'Ikole',13),(354,'Ilejemeje',13),(355,'Irepodun/Ifelodun',13),(356,'Ise/Orun',13),(357,'Moba',13),(358,'Oye',13),(359,'Aninri',14),(360,'Awgu',14),(361,'Enugu East',14),(362,'Enugu North',14),(363,'Enugu South',14),(364,'Ezeagu',14),(365,'Igbo Etiti',14),(366,'Igbo Eze North',14),(367,'Igbo Eze South',14),(368,'Isi Uzo',14),(369,'Nkanu East',14),(370,'Nkanu West',14),(371,'Nsukka',14),(372,'Oji River',14),(373,'Udenu',14),(374,'Udi',14),(375,'Uzo Uwani',14),(376,'Abaji',15),(377,'Bwari',15),(378,'Gwagwalada',15),(379,'Kuje',15),(380,'Kwali',15),(381,'Municipal Area Council',15),(382,'Akko',16),(383,'Balanga',16),(384,'Billiri',16),(385,'Dukku',16),(386,'Funakaye',16),(387,'Gombe',16),(388,'Kaltungo',16),(389,'Kwami',16),(390,'Nafada',16),(391,'Shongom',16),(392,'Yamaltu/Deba',16),(393,'Aboh Mbaise',17),(394,'Ahiazu Mbaise',17),(395,'Ehime Mbano',17),(396,'Ezinihitte',17),(397,'Ideato North',17),(398,'Ideato South',17),(399,'Ihitte/Uboma',17),(400,'Ikeduru',17),(401,'Isiala Mbano',17),(402,'Isu',17),(403,'Mbaitoli',17),(404,'Ngor Okpala',17),(405,'Njaba',17),(406,'Nkwerre',17),(407,'Nwangele',17),(408,'Obowo',17),(409,'Oguta',17),(410,'Ohaji/Egbema',17),(411,'Okigwe',17),(412,'Orlu',17),(413,'Orsu',17),(414,'Oru East',17),(415,'Oru West',17),(416,'Owerri Municipal',17),(417,'Owerri North',17),(418,'Owerri West',17),(419,'Unuimo',17),(420,'Auyo',18),(421,'Babura',18),(422,'Biriniwa',18),(423,'Birnin Kudu',18),(424,'Buji',18),(425,'Dutse',18),(426,'Gagarawa',18),(427,'Garki',18),(428,'Gumel',18),(429,'Guri',18),(430,'Gwaram',18),(431,'Gwiwa',18),(432,'Hadejia',18),(433,'Jahun',18),(434,'Kafin Hausa',18),(435,'Kazaure',18),(436,'Kiri Kasama',18),(437,'Kiyawa',18),(438,'Kaugama',18),(439,'Maigatari',18),(440,'Malam Madori',18),(441,'Miga',18),(442,'Ringim',18),(443,'Roni',18),(444,'Sule Tankarkar',18),(445,'Taura',18),(446,'Yankwashi',18),(447,'Birnin Gwari',19),(448,'Chikun',19),(449,'Giwa',19),(450,'Igabi',19),(451,'Ikara',19),(452,'Jaba',19),(453,'Jema\'a',19),(454,'Kachia',19),(455,'Kaduna North',19),(456,'Kaduna South',19),(457,'Kagarko',19),(458,'Kajuru',19),(459,'Kaura',19),(460,'Kauru',19),(461,'Kubau',19),(462,'Kudan',19),(463,'Lere',19),(464,'Makarfi',19),(465,'Sabon Gari',19),(466,'Sanga',19),(467,'Soba',19),(468,'Zangon Kataf',19),(469,'Zaria',19),(470,'Ajingi',20),(471,'Albasu',20),(472,'Bagwai',20),(473,'Bebeji',20),(474,'Bichi',20),(475,'Bunkure',20),(476,'Dala',20),(477,'Dambatta',20),(478,'Dawakin Kudu',20),(479,'Dawakin Tofa',20),(480,'Doguwa',20),(481,'Fagge',20),(482,'Gabasawa',20),(483,'Garko',20),(484,'Garun Mallam',20),(485,'Gaya',20),(486,'Gezawa',20),(487,'Gwale',20),(488,'Gwarzo',20),(489,'Kabo',20),(490,'Kano Municipal',20),(491,'Karaye',20),(492,'Kibiya',20),(493,'Kiru',20),(494,'Kumbotso',20),(495,'Kunchi',20),(496,'Kura',20),(497,'Madobi',20),(498,'Makoda',20),(499,'Minjibir',20),(500,'Nasarawa',20),(501,'Rano',20),(502,'Rimin Gado',20),(503,'Rogo',20),(504,'Shanono',20),(505,'Sumaila',20),(506,'Takai',20),(507,'Tarauni',20),(508,'Tofa',20),(509,'Tsanyawa',20),(510,'Tudun Wada',20),(511,'Ungogo',20),(512,'Warawa',20),(513,'Wudil',20),(514,'Bakori',21),(515,'Batagarawa',21),(516,'Batsari',21),(517,'Baure',21),(518,'Bindawa',21),(519,'Charanchi',21),(520,'Dandume',21),(521,'Danja',21),(522,'Dan Musa',21),(523,'Daura',21),(524,'Dutsi',21),(525,'Dutsin Ma',21),(526,'Faskari',21),(527,'Funtua',21),(528,'Ingawa',21),(529,'Jibia',21),(530,'Kafur',21),(531,'Kaita',21),(532,'Kankara',21),(533,'Kankia',21),(534,'Katsina',21),(535,'Kurfi',21),(536,'Kusada',21),(537,'Mai\'Adua',21),(538,'Malumfashi',21),(539,'Mani',21),(540,'Mashi',21),(541,'Matazu',21),(542,'Musawa',21),(543,'Rimi',21),(544,'Sabuwa',21),(545,'Safana',21),(546,'Sandamu',21),(547,'Zango',21),(548,'Aleiro',22),(549,'Arewa Dandi',22),(550,'Argungu',22),(551,'Augie',22),(552,'Bagudo',22),(553,'Birnin Kebbi',22),(554,'Bunza',22),(555,'Dandi',22),(556,'Fakai',22),(557,'Gwandu',22),(558,'Jega',22),(559,'Kalgo',22),(560,'Koko/Besse',22),(561,'Maiyama',22),(562,'Ngaski',22),(563,'Sakaba',22),(564,'Shanga',22),(565,'Suru',22),(566,'Wasagu/Danko',22),(567,'Yauri',22),(568,'Zuru',22),(569,'Adavi',23),(570,'Ajaokuta',23),(571,'Ankpa',23),(572,'Bassa',23),(573,'Dekina',23),(574,'Ibaji',23),(575,'Idah',23),(576,'Igalamela Odolu',23),(577,'Ijumu',23),(578,'Kabba/Bunu',23),(579,'Kogi',23),(580,'Lokoja',23),(581,'Mopa Muro',23),(582,'Ofu',23),(583,'Ogori/Magongo',23),(584,'Okehi',23),(585,'Okene',23),(586,'Olamaboro',23),(587,'Omala',23),(588,'Yagba East',23),(589,'Yagba West',23),(590,'Asa',24),(591,'Baruten',24),(592,'Edu',24),(593,'Ekiti',24),(594,'Ifelodun',24),(595,'Ilorin East',24),(596,'Ilorin South',24),(597,'Ilorin West',24),(598,'Irepodun',24),(599,'Isin',24),(600,'Kaiama',24),(601,'Moro',24),(602,'Offa',24),(603,'Oke Ero',24),(604,'Oyun',24),(605,'Pategi',24),(606,'Agege',25),(607,'Ajeromi-Ifelodun',25),(608,'Alimosho',25),(609,'Amuwo-Odofin',25),(610,'Apapa',25),(611,'Badagry',25),(612,'Epe',25),(613,'Eti Osa',25),(614,'Ibeju-Lekki',25),(615,'Ifako-Ijaiye',25),(616,'Ikeja',25),(617,'Ikorodu',25),(618,'Kosofe',25),(619,'Lagos Island',25),(620,'Lagos Mainland',25),(621,'Mushin',25),(622,'Ojo',25),(623,'Oshodi-Isolo',25),(624,'Shomolu',25),(625,'Surulere',25),(626,'Akwanga',26),(627,'Awe',26),(628,'Doma',26),(629,'Karu',26),(630,'Keana',26),(631,'Keffi',26),(632,'Kokona',26),(633,'Lafia',26),(634,'Nasarawa',26),(635,'Nasarawa Egon',26),(636,'Obi',26),(637,'Toto',26),(638,'Wamba',26),(639,'Agaie',27),(640,'Agwara',27),(641,'Bida',27),(642,'Borgu',27),(643,'Bosso',27),(644,'Chanchaga',27),(645,'Edati',27),(646,'Gbako',27),(647,'Gurara',27),(648,'Katcha',27),(649,'Kontagora',27),(650,'Lapai',27),(651,'Lavun',27),(652,'Magama',27),(653,'Mariga',27),(654,'Mashegu',27),(655,'Mokwa',27),(656,'Moya',27),(657,'Paikoro',27),(658,'Rafi',27),(659,'Rijau',27),(660,'Shiroro',27),(661,'Suleja',27),(662,'Tafa',27),(663,'Wushishi',27),(664,'Abeokuta North',28),(665,'Abeokuta South',28),(666,'Ado-Odo/Ota',28),(667,'Egbado North',28),(668,'Egbado South',28),(669,'Ewekoro',28),(670,'Ifo',28),(671,'Ijebu East',28),(672,'Ijebu North',28),(673,'Ijebu North East',28),(674,'Ijebu Ode',28),(675,'Ikenne',28),(676,'Imeko Afon',28),(677,'Ipokia',28),(678,'Obafemi Owode',28),(679,'Odeda',28),(680,'Odogbolu',28),(681,'Ogun Waterside',28),(682,'Remo North',28),(683,'Shagamu',28),(684,'Akoko North-East',29),(685,'Akoko North-West',29),(686,'Akoko South-West',29),(687,'Akoko South-East',29),(688,'Akure North',29),(689,'Akure South',29),(690,'Ese Odo',29),(691,'Idanre',29),(692,'Ifedore',29),(693,'Ilaje',29),(694,'Ile Oluji/Okeigbo',29),(695,'Irele',29),(696,'Odigbo',29),(697,'Okitipupa',29),(698,'Ondo East',29),(699,'Ondo West',29),(700,'Ose',29),(701,'Owo',29),(702,'Atakunmosa East',30),(703,'Atakunmosa West',30),(704,'Aiyedaade',30),(705,'Aiyedire',30),(706,'Boluwaduro',30),(707,'Boripe',30),(708,'Ede North',30),(709,'Ede South',30),(710,'Ife Central',30),(711,'Ife East',30),(712,'Ife North',30),(713,'Ife South',30),(714,'Egbedore',30),(715,'Ejigbo',30),(716,'Ifedayo',30),(717,'Ifelodun',30),(718,'Ila',30),(719,'Ilesa East',30),(720,'Ilesa West',30),(721,'Irepodun',30),(722,'Irewole',30),(723,'Isokan',30),(724,'Iwo',30),(725,'Obokun',30),(726,'Odo Otin',30),(727,'Ola Oluwa',30),(728,'Olorunda',30),(729,'Oriade',30),(730,'Orolu',30),(731,'Osogbo',30),(732,'Afijio',31),(733,'Akinyele',31),(734,'Atiba',31),(735,'Atisbo',31),(736,'Egbeda',31),(737,'Ibadan North',31),(738,'Ibadan North-East',31),(739,'Ibadan North-West',31),(740,'Ibadan South-East',31),(741,'Ibadan South-West',31),(742,'Ibarapa Central',31),(743,'Ibarapa East',31),(744,'Ibarapa North',31),(745,'Ido',31),(746,'Irepo',31),(747,'Iseyin',31),(748,'Itesiwaju',31),(749,'Iwajowa',31),(750,'Kajola',31),(751,'Lagelu',31),(752,'Ogbomosho North',31),(753,'Ogbomosho South',31),(754,'Ogo Oluwa',31),(755,'Olorunsogo',31),(756,'Oluyole',31),(757,'Ona Ara',31),(758,'Orelope',31),(759,'Ori Ire',31),(760,'Oyo',31),(761,'Oyo East',31),(762,'Saki East',31),(763,'Saki West',31),(764,'Surulere',31),(765,'Bokkos',32),(766,'Barkin Ladi',32),(767,'Bassa',32),(768,'Jos East',32),(769,'Jos North',32),(770,'Jos South',32),(771,'Kanam',32),(772,'Kanke',32),(773,'Langtang South',32),(774,'Langtang North',32),(775,'Mangu',32),(776,'Mikang',32),(777,'Pankshin',32),(778,'Qua\'an Pan',32),(779,'Riyom',32),(780,'Shendam',32),(781,'Wase',32),(782,'Abua/Odual',33),(783,'Ahoada East',33),(784,'Ahoada West',33),(785,'Akuku-Toru',33),(786,'Andoni',33),(787,'Asari-Toru',33),(788,'Bonny',33),(789,'Degema',33),(790,'Eleme',33),(791,'Emuoha',33),(792,'Etche',33),(793,'Gokana',33),(794,'Ikwerre',33),(795,'Khana',33),(796,'Obio/Akpor',33),(797,'Ogba/Egbema/Ndoni',33),(798,'Ogu/Bolo',33),(799,'Okrika',33),(800,'Omuma',33),(801,'Opobo/Nkoro',33),(802,'Oyigbo',33),(803,'Port Harcourt',33),(804,'Tai',33),(805,'Binji',34),(806,'Bodinga',34),(807,'Dange Shuni',34),(808,'Gada',34),(809,'Goronyo',34),(810,'Gudu',34),(811,'Gwadabawa',34),(812,'Illela',34),(813,'Isa',34),(814,'Kebbe',34),(815,'Kware',34),(816,'Rabah',34),(817,'Sabon Birni',34),(818,'Shagari',34),(819,'Silame',34),(820,'Sokoto North',34),(821,'Sokoto South',34),(822,'Tambuwal',34),(823,'Tangaza',34),(824,'Tureta',34),(825,'Wamako',34),(826,'Wurno',34),(827,'Yabo',34),(828,'Ardo Kola',35),(829,'Bali',35),(830,'Donga',35),(831,'Gashaka',35),(832,'Gassol',35),(833,'Ibi',35),(834,'Jalingo',35),(835,'Karim Lamido',35),(836,'Kumi',35),(837,'Lau',35),(838,'Sardauna',35),(839,'Takum',35),(840,'Ussa',35),(841,'Wukari',35),(842,'Yorro',35),(843,'Zing',35),(844,'Bade',36),(845,'Bursari',36),(846,'Damaturu',36),(847,'Fika',36),(848,'Fune',36),(849,'Geidam',36),(850,'Gujba',36),(851,'Gulani',36),(852,'Jakusko',36),(853,'Karasuwa',36),(854,'Machina',36),(855,'Nangere',36),(856,'Nguru',36),(857,'Potiskum',36),(858,'Tarmuwa',36),(859,'Yunusari',36),(860,'Yusufari',36),(861,'Anka',37),(862,'Bakura',37),(863,'Birnin Magaji/Kiyaw',37),(864,'Bukkuyum',37),(865,'Bungudu',37),(866,'Gummi',37),(867,'Gusau',37),(868,'Kaura Namoda',37),(869,'Maradun',37),(870,'Maru',37),(871,'Shinkafi',37),(872,'Talata Mafara',37),(873,'Chafe',37),(874,'Zurmi',37);
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ICON_IMAGE` varchar(255) DEFAULT NULL,
  `MENU_DESCRIPTION` varchar(255) DEFAULT NULL,
  `MENU_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region_profile`
--

DROP TABLE IF EXISTS `region_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region_profile` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CONTINENT` varchar(45) NOT NULL,
  `COUNTRY` varchar(40) DEFAULT NULL,
  `STATE` varchar(40) DEFAULT NULL,
  `AGE_GROUP` varchar(25) DEFAULT NULL,
  `HEIGHT` varchar(15) DEFAULT NULL,
  `WEIGHT` varchar(45) DEFAULT NULL,
  `TRIBE` varchar(45) DEFAULT NULL,
  `HEIGHT_STATUS` varchar(15) DEFAULT NULL,
  `WEIGHT_STATUS` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region_profile`
--

LOCK TABLES `region_profile` WRITE;
/*!40000 ALTER TABLE `region_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `region_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_DESCRIPTION` varchar(255) DEFAULT NULL,
  `ROLE_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `state` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'Abia State'),(2,'Adamawa State'),(3,'Akwa Ibom State'),(4,'Anambra State'),(5,'Bauchi State'),(6,'Bayelsa State'),(7,'Benue State'),(8,'Borno State'),(9,'Cross River State'),(10,'Delta State'),(11,'Ebonyi State'),(12,'Edo State'),(13,'Ekiti State'),(14,'Enugu State'),(15,'Abuja (FCT)'),(16,'Gombe State'),(17,'Imo State'),(18,'Jigawa State'),(19,'Kaduna State'),(20,'Kano State'),(21,'Katsina State'),(22,'Kebbi State'),(23,'Kogi State'),(24,'Kwara State'),(25,'Lagos State'),(26,'Nasarawa State'),(27,'Niger State'),(28,'Ogun State'),(29,'Ondo State'),(30,'Osun State'),(31,'Oyo State'),(32,'Plateau State'),(33,'Rivers State'),(34,'Sokoto State'),(35,'Taraba State'),(36,'Yobe State'),(37,'Zamfara State');
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_menu`
--

DROP TABLE IF EXISTS `sub_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sub_menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ICON_IMAGE_NAME` varchar(255) DEFAULT NULL,
  `PAGE_LINK` varchar(255) DEFAULT NULL,
  `SUB_MENU_DESCRIPTION` varchar(255) DEFAULT NULL,
  `SUB_MENU_NAME` varchar(255) DEFAULT NULL,
  `MENU_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKa2xwwfu8gt0t1qrka0cvutvvo` (`MENU_ID`),
  CONSTRAINT `FKa2xwwfu8gt0t1qrka0cvutvvo` FOREIGN KEY (`MENU_ID`) REFERENCES `menu` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_menu`
--

LOCK TABLES `sub_menu` WRITE;
/*!40000 ALTER TABLE `sub_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_menu_function`
--

DROP TABLE IF EXISTS `sub_menu_function`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sub_menu_function` (
  `SUB_MENU_ID` int(11) NOT NULL,
  `FUNCTION_ID` bigint(20) NOT NULL,
  KEY `FKb6wiyup1c3t2suakm0ett2coa` (`FUNCTION_ID`),
  KEY `FKowxy1d1bfkmmvcg2aexqb474q` (`SUB_MENU_ID`),
  CONSTRAINT `FKb6wiyup1c3t2suakm0ett2coa` FOREIGN KEY (`FUNCTION_ID`) REFERENCES `functions` (`ID`),
  CONSTRAINT `FKowxy1d1bfkmmvcg2aexqb474q` FOREIGN KEY (`SUB_MENU_ID`) REFERENCES `sub_menu` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_menu_function`
--

LOCK TABLES `sub_menu_function` WRITE;
/*!40000 ALTER TABLE `sub_menu_function` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_menu_function` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_menu_role`
--

DROP TABLE IF EXISTS `sub_menu_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sub_menu_role` (
  `SUB_MENU_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  KEY `FKj6yx8pggcn1jmhf5vrfa55c3c` (`ROLE_ID`),
  KEY `FKifufn4m6gbuhwbjlejhcoqx9a` (`SUB_MENU_ID`),
  CONSTRAINT `FKifufn4m6gbuhwbjlejhcoqx9a` FOREIGN KEY (`SUB_MENU_ID`) REFERENCES `sub_menu` (`ID`),
  CONSTRAINT `FKj6yx8pggcn1jmhf5vrfa55c3c` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_menu_role`
--

LOCK TABLES `sub_menu_role` WRITE;
/*!40000 ALTER TABLE `sub_menu_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_menu_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  KEY `FKt7e7djp752sqn6w22i6ocqy6q` (`ROLE_ID`),
  KEY `FKd3wm0wi7xoh28n6gkdy8o2t78` (`USER_ID`),
  CONSTRAINT `FKd3wm0wi7xoh28n6gkdy8o2t78` FOREIGN KEY (`USER_ID`) REFERENCES `application_user` (`ID`),
  CONSTRAINT `FKt7e7djp752sqn6w22i6ocqy6q` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zone_user`
--

DROP TABLE IF EXISTS `zone_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zone_user` (
  `ID` int(20) NOT NULL,
  `FIRST_NAME` varchar(45) NOT NULL,
  `LAST_NAME` varchar(45) NOT NULL,
  `OTHER_NAME` varchar(45) DEFAULT NULL,
  `DATE_REGISTERED` datetime NOT NULL,
  `GENDER` varchar(15) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `COUNTRY_OF_RESIDENCE` varchar(45) NOT NULL,
  `STATE_OF_RESIDENCE` varchar(45) NOT NULL,
  `LOGIN_ID` varchar(45) DEFAULT NULL,
  `LOGIN_PASSWORD` varchar(45) DEFAULT NULL,
  `LAST_LOGIN_DATE` datetime DEFAULT NULL,
  `COUNTRY_OF_ORIGIN` varchar(45) NOT NULL,
  `STATE_OF_ORIGIN` varchar(45) NOT NULL,
  `TRIBE` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zone_user`
--

LOCK TABLES `zone_user` WRITE;
/*!40000 ALTER TABLE `zone_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `zone_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-04 12:46:49
