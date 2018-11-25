-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2018 at 01:37 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uvacarcare`
--

-- --------------------------------------------------------

--
-- Table structure for table `appoinment`
--

CREATE TABLE `appoinment` (
  `appoinmentId` int(11) NOT NULL,
  `InvoiceNo` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `PhoneNo` varchar(10) NOT NULL,
  `Service` varchar(30) NOT NULL,
  `ServiceCenter` varchar(30) NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(100) NOT NULL,
  `Message` varchar(50) NOT NULL,
  `Status` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appoinment`
--

INSERT INTO `appoinment` (`appoinmentId`, `InvoiceNo`, `Name`, `Email`, `PhoneNo`, `Service`, `ServiceCenter`, `Date`, `Time`, `Message`, `Status`) VALUES
(1, '5279857700', 'Sudaraka', 'sudharakafb@gmail.com', '0713009095', 'Auto Car Wash with Vacuum', 'Badulla', '2018-11-26', '11am to 1pm', 'Tesla Model X5', 'New'),
(2, '8739372511', 'Menaka', 'menaka@nanolabs.lk', '0713654974', 'Car Service', 'Bandarawela', '2018-11-28', '3pm to 5pm', 'Dodge SUV', 'New'),
(3, '5238673156', 'Gayan', 'gayanrajitha1994@gmail.com', '0712354687', 'Auto Car Wash Only', 'Passara', '2018-11-30', '11am to 1pm', 'Toyota Axis', 'New'),
(4, '3999155073', 'Gayan', 'gayanrajitha1994@gmail.com', '0712354687', 'Car Wash with Vacuum', 'Hali Ela', '2018-12-12', '5pm to 7pm', 'Toyota SUV', 'New'),
(5, '8147311320', 'Sudaraka', 'sudharakafb@gmail.com', '0713009095', 'Auto Car Wash Only', 'Badulla', '2018-11-28', '11am to 1pm', 'Benz E3', 'New'),
(6, '1565719114', 'Gayan', 'gayanrajitha1994@gmail.com', '0715645124', 'Car Vacuum Only', 'Bandarawela', '2018-11-30', '11am to 1pm', 'Mazda Rx8', 'New'),
(7, '2609696311', 'Yasiru', 'sudharakafb@gmail.com', '0712392017', 'Auto Car Wash Only', 'Badulla', '2018-11-30', '9am to 11am', 'Tesla X5', 'New'),
(8, '0466266943', 'Sapuni', 'sudharakafb@gmail.com', '0715696317', 'Auto Car Wash with Vacuum', 'Bandarawela', '2018-12-11', '1pm to 3pm', 'BMW i8', 'New'),
(9, '6522329938', 'Sapuni', 'sudharakafb@gmail.com', '0715647893', 'Car Vacuum Only', 'Badulla', '2018-12-10', '7am to 9am', 'Lancer 2018', 'New'),
(10, '4188512558', 'Namal Rajapaksha', 'namal@gmail.com', '0775689412', 'Car Wash with Vacuum', 'Hali Ela', '2018-11-30', '7am to 9am', 'Lamborghini', 'New');

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `InvoiceNo` varchar(30) NOT NULL,
  `BillID` varchar(30) NOT NULL,
  `Amount` decimal(10,0) NOT NULL,
  `Date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `jobId` int(11) NOT NULL,
  `InvoiceNo` varchar(30) NOT NULL,
  `EmpName` varchar(30) NOT NULL,
  `Status` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UserType` varchar(30) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Gender` varchar(5) NOT NULL,
  `PhoneNo` int(10) NOT NULL,
  `NIC` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appoinment`
--
ALTER TABLE `appoinment`
  ADD PRIMARY KEY (`appoinmentId`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`jobId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appoinment`
--
ALTER TABLE `appoinment`
  MODIFY `appoinmentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
  MODIFY `jobId` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
