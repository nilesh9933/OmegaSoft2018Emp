CREATE DATABASE  IF NOT EXISTS `empdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `empdb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: empdb
-- ------------------------------------------------------
-- Server version	5.0.24-community-nt

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
-- Not dumping tablespaces as no INFORMATION_SCHEMA.FILES table on this server
--

--
-- Table structure for table `epaperpost`
--

DROP TABLE IF EXISTS `epaperpost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `epaperpost` (
  `pId` int(11) NOT NULL auto_increment,
  `pTitle` varchar(255) character set utf8 default NULL,
  `pDes` varchar(1000) character set utf8 default NULL,
  `pPostDate` datetime default NULL,
  `pStartDate` datetime default NULL,
  `pEndDate` datetime default NULL,
  `pSharePath` varchar(1000) default NULL,
  `delInd` char(1) default NULL,
  `ipAddress` varchar(45) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  PRIMARY KEY  (`pId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventlog`
--

DROP TABLE IF EXISTS `eventlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventlog` (
  `eventId` int(11) NOT NULL auto_increment,
  `eventName` varchar(45) default NULL,
  `eventDateTime` datetime default NULL,
  `eventType` varchar(45) default NULL,
  `eventMessage` varchar(5000) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  `ipAddress` varchar(45) default NULL,
  PRIMARY KEY  (`eventId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `jobId` int(11) NOT NULL auto_increment,
  `jobTitle` varchar(200) character set utf8 default NULL,
  `jobDes` varchar(1000) character set utf8 default NULL,
  `jobType` varchar(45) default NULL,
  `jobStartDate` datetime default NULL,
  `jobEndDate` datetime default NULL,
  `jobLogoPath` varchar(255) default NULL,
  `delInd` char(1) default NULL,
  `ipAddress` varchar(45) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  PRIMARY KEY  (`jobId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `offers`
--

DROP TABLE IF EXISTS `offers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offers` (
  `couId` int(11) NOT NULL auto_increment,
  `couCode` varchar(45) default NULL,
  `couAmount` decimal(10,2) default NULL,
  `couStartDate` datetime default NULL,
  `couEndDate` datetime default NULL,
  `delInd` char(1) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  `ipAddress` varchar(45) default NULL,
  PRIMARY KEY  (`couId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `rolId` int(11) NOT NULL auto_increment,
  `rolName` varchar(50) default NULL,
  `rolDes` varchar(1000) default NULL,
  `delInd` char(1) default NULL,
  `updateUser` varchar(50) default NULL,
  `updateDate` datetime default NULL,
  PRIMARY KEY  (`rolId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `suboffers`
--

DROP TABLE IF EXISTS `suboffers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suboffers` (
  `subOffId` int(11) NOT NULL auto_increment,
  `subId` int(11) default NULL,
  `coupId` int(11) default NULL,
  PRIMARY KEY  (`subOffId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `subscriptions`
--

DROP TABLE IF EXISTS `subscriptions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscriptions` (
  `subId` int(11) NOT NULL auto_increment,
  `subName` varchar(45) default NULL,
  `subDes` varchar(1000) default NULL,
  `subStartDate` datetime default NULL,
  `subEndDate` datetime default NULL,
  `subAmount` decimal(10,2) default NULL,
  `subValidFor` int(11) default NULL,
  `subTimeDuration` varchar(45) default NULL,
  `delInd` char(1) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  `ipAddress` varchar(45) default NULL,
  PRIMARY KEY  (`subId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL,
  `userFirstName` varchar(45) default NULL,
  `userLastName` varchar(45) default NULL,
  `userEmail` varchar(45) NOT NULL,
  `userPassword` varchar(45) default NULL,
  `userContact` varchar(45) default NULL,
  `userMob` varchar(45) default NULL,
  `userAddress` varchar(255) default NULL,
  `userArea` varchar(45) default NULL,
  `userCity` varchar(45) default NULL,
  `userState` varchar(45) default NULL,
  `userCountry` varchar(45) default NULL,
  `userDob` datetime default NULL,
  `rolId` int(11) default NULL,
  `ipAddress` varchar(45) default NULL,
  `isActive` char(1) default NULL,
  `delInd` char(1) default NULL,
  `updateUser` varchar(45) default NULL,
  `updateDate` datetime default NULL,
  `userImagePath` varchar(500) default NULL,
  PRIMARY KEY  (`userEmail`,`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping routines for database 'empdb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-23  9:51:41
