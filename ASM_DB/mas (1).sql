-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 18, 2018 at 02:48 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mas`
--

-- --------------------------------------------------------

--
-- Table structure for table `engassignment`
--

CREATE TABLE IF NOT EXISTS `engassignment` (
  `userId` int(11) DEFAULT NULL,
  `jobId` int(11) DEFAULT NULL,
  `assDate` datetime DEFAULT NULL,
  `esttimeTaken` varchar(50) DEFAULT NULL,
  `isAvailable` char(1) DEFAULT NULL,
  `jobStatus` varchar(50) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE IF NOT EXISTS `inventory` (
  `proId` int(11) DEFAULT NULL,
  `proQty` varchar(50) DEFAULT NULL,
  `instock` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE IF NOT EXISTS `job` (
`jobId` int(11) NOT NULL,
  `vin` varchar(50) NOT NULL DEFAULT '',
  `vinKm` varchar(50) DEFAULT NULL,
  `serDate` datetime DEFAULT NULL,
  `delDate` datetime DEFAULT NULL,
  `jobDes` varchar(1000) DEFAULT NULL,
  `estAmt` decimal(10,2) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
`eventId` int(11) NOT NULL,
  `eventName` varchar(50) DEFAULT NULL,
  `eventDate` datetime DEFAULT NULL,
  `errorMessage` varchar(20000) DEFAULT NULL,
  `eventType` varchar(100) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `offerandcoupon`
--

CREATE TABLE IF NOT EXISTS `offerandcoupon` (
`offId` int(11) NOT NULL,
  `offCode` varchar(50) DEFAULT NULL,
  `offStartDate` datetime DEFAULT NULL,
  `offEndDate` datetime DEFAULT NULL,
  `offDes` varchar(2000) DEFAULT NULL,
  `offType` varchar(50) DEFAULT NULL,
  `offAmt` decimal(10,2) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `prodtype`
--

CREATE TABLE IF NOT EXISTS `prodtype` (
`proTypeId` int(11) NOT NULL,
  `proType` varchar(50) DEFAULT NULL,
  `proTypeDes` varchar(2000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
`proId` int(11) NOT NULL,
  `proName` varchar(50) DEFAULT NULL,
  `proDes` varchar(1000) DEFAULT NULL,
  `proPurDate` datetime DEFAULT NULL,
  `proPurRate` decimal(10,2) DEFAULT NULL,
  `proSaleRate` decimal(10,2) DEFAULT NULL,
  `proManDate` datetime DEFAULT NULL,
  `proExpDate` datetime DEFAULT NULL,
  `proManComp` varchar(50) DEFAULT NULL,
  `proWarrPeriod` varchar(50) DEFAULT NULL,
  `proTypeId` int(11) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
`rolId` int(11) NOT NULL,
  `rolName` varchar(50) NOT NULL,
  `rolDes` varchar(1000) NOT NULL,
  `delInd` char(1) NOT NULL,
  `updateUser` varchar(50) NOT NULL,
  `updateDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `userId` int(11) NOT NULL,
  `userFirstName` varchar(50) DEFAULT NULL,
  `userLastName` varchar(50) DEFAULT NULL,
  `userEmail` varchar(50) DEFAULT NULL,
  `userDob` datetime DEFAULT NULL,
  `userContact` varchar(50) DEFAULT NULL,
  `userMob` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `rolId` int(11) DEFAULT NULL,
  `userPan` varchar(50) DEFAULT NULL,
  `userAdhar` varchar(50) DEFAULT NULL,
  `userWorkExp` varchar(50) DEFAULT NULL,
  `userAddress` varchar(50) DEFAULT NULL,
  `userJoiningDate` datetime DEFAULT NULL,
  `userResignDate` datetime DEFAULT NULL,
  `isActive` char(1) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vehicleservice`
--

CREATE TABLE IF NOT EXISTS `vehicleservice` (
  `jobId` int(11) DEFAULT NULL,
  `vin` varchar(50) DEFAULT NULL,
  `proId` int(11) DEFAULT NULL,
  `serCharge` decimal(10,2) DEFAULT NULL,
  `misCharge` decimal(10,2) DEFAULT NULL,
  `extraCharge` decimal(10,2) DEFAULT NULL,
  `cgstAmt` decimal(10,2) DEFAULT NULL,
  `sgstAmt` decimal(10,2) DEFAULT NULL,
  `disAmt` decimal(10,2) DEFAULT NULL,
  `totalAmt` decimal(10,2) DEFAULT NULL,
  `isPiad` char(1) DEFAULT NULL,
  `payMode` varchar(50) DEFAULT NULL,
  `patTransId` varchar(1000) DEFAULT NULL,
  `patDate` datetime DEFAULT NULL,
  `nextSerDate` datetime DEFAULT NULL,
  `nextSerKm` varchar(50) DEFAULT NULL,
  `delInd` char(1) DEFAULT NULL,
  `updateUser` varchar(50) DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `job`
--
ALTER TABLE `job`
 ADD PRIMARY KEY (`jobId`,`vin`);

--
-- Indexes for table `log`
--
ALTER TABLE `log`
 ADD PRIMARY KEY (`eventId`);

--
-- Indexes for table `offerandcoupon`
--
ALTER TABLE `offerandcoupon`
 ADD PRIMARY KEY (`offId`);

--
-- Indexes for table `prodtype`
--
ALTER TABLE `prodtype`
 ADD PRIMARY KEY (`proTypeId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
 ADD PRIMARY KEY (`proId`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
 ADD PRIMARY KEY (`rolId`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
MODIFY `jobId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `log`
--
ALTER TABLE `log`
MODIFY `eventId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `offerandcoupon`
--
ALTER TABLE `offerandcoupon`
MODIFY `offId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `prodtype`
--
ALTER TABLE `prodtype`
MODIFY `proTypeId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
MODIFY `proId` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
MODIFY `rolId` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
