-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8111
-- Generation Time: Feb 05, 2022 at 04:19 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employeemanagement_construction_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Name` varchar(150) NOT NULL,
  `Father_Name` varchar(150) NOT NULL,
  `Age` varchar(150) NOT NULL,
  `DOB` varchar(150) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Phone` varchar(150) NOT NULL,
  `Email_Id` varchar(150) NOT NULL,
  `Education` varchar(150) NOT NULL,
  `Job_Post` varchar(150) NOT NULL,
  `Salary` varchar(150) NOT NULL,
  `Emp_id` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Name`, `Father_Name`, `Age`, `DOB`, `Address`, `Phone`, `Email_Id`, `Education`, `Job_Post`, `Salary`, `Emp_id`) VALUES
('Rabia Khalid Umar', 'Khalid Umar', '20', '23/12/2000', 'Scheme 1', '045985696', 'rabiakhalid@gmail.com', 'BSSE', 'Manager', '90000', '1'),
('', '', '', '', '', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(150) NOT NULL,
  `password` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('rabia', 'rabia');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
