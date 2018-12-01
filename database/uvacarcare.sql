-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2018 at 04:24 AM
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appoinment`
--

INSERT INTO `appoinment` (`appoinmentId`, `InvoiceNo`, `Name`, `Email`, `PhoneNo`, `Service`, `ServiceCenter`, `Date`, `Time`, `Message`, `Status`) VALUES
(1, '5279857700', 'Sudaraka', 'sudharakafb@gmail.com', '0713009095', 'Auto Car Wash with Vacuum', 'Badulla', '2018-11-26', '11am to 1pm', 'Tesla Model X5', 'Job Assigned'),
(2, '8739372511', 'Menaka', 'menaka@nanolabs.lk', '0713654974', 'Car Service', 'Bandarawela', '2018-11-28', '3pm to 5pm', 'Dodge SUV', 'Job Assigned'),
(3, '5238673156', 'Gayan', 'gayanrajitha1994@gmail.com', '0712354687', 'Auto Car Wash Only', 'Passara', '2018-11-30', '11am to 1pm', 'Toyota Axis', 'Job Assigned'),
(4, '3999155073', 'Gayan', 'gayanrajitha1994@gmail.com', '0712354687', 'Car Wash with Vacuum', 'Hali Ela', '2018-12-12', '5pm to 7pm', 'Toyota SUV', 'Rejected'),
(5, '8147311320', 'Sudaraka', 'sudharakafb@gmail.com', '0713009095', 'Auto Car Wash Only', 'Badulla', '2018-11-28', '11am to 1pm', 'Benz E3', 'Rejected'),
(6, '1565719114', 'Gayan', 'gayanrajitha1994@gmail.com', '0715645124', 'Car Vacuum Only', 'Bandarawela', '2018-11-30', '11am to 1pm', 'Mazda Rx8', 'Job Assigned'),
(7, '2609696311', 'Yasiru', 'sudharakafb@gmail.com', '0712392017', 'Auto Car Wash Only', 'Badulla', '2018-11-30', '9am to 11am', 'Tesla X5', 'New'),
(8, '0466266943', 'Sapuni', 'sudharakafb@gmail.com', '0715696317', 'Auto Car Wash with Vacuum', 'Bandarawela', '2018-12-11', '1pm to 3pm', 'BMW i8', 'New'),
(9, '6522329938', 'Sapuni', 'sudharakafb@gmail.com', '0715647893', 'Car Vacuum Only', 'Badulla', '2018-12-10', '7am to 9am', 'Lancer 2018', 'Approved'),
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
  `empId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`jobId`, `InvoiceNo`, `empId`) VALUES
(1, '5279857700', 1),
(2, '5238673156', 2),
(3, '8739372511', 1),
(4, '1565719114', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userId` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Gender` varchar(5) NOT NULL,
  `PhoneNo` int(10) NOT NULL,
  `NIC` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `userType` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userId`, `Name`, `Gender`, `PhoneNo`, `NIC`, `Email`, `Password`, `userType`) VALUES
(1, 'Ruwan', 'Male', 713005612, '926452056v', 'sudharakafb@gmail.com', '123456', 'Emp'),
(2, 'Sandaru', 'Male', 723654123, '902314562v', 'rajacfindia@gmail.com', 'abc', 'Emp'),
(3, 'Gamini', 'Male', 713005613, '896541232v', 'gayanrajitha1994@gmail.com', 'qwer', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appoinment`
--
ALTER TABLE `appoinment`
  ADD PRIMARY KEY (`appoinmentId`),
  ADD UNIQUE KEY `InvoiceNo` (`InvoiceNo`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`jobId`),
  ADD UNIQUE KEY `InvoiceNo` (`InvoiceNo`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userId`);

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
  MODIFY `jobId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `job`
--
ALTER TABLE `job`
  ADD CONSTRAINT `job_ibfk_1` FOREIGN KEY (`InvoiceNo`) REFERENCES `appoinment` (`InvoiceNo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
