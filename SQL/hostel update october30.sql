-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2020 at 02:26 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostel`
--

-- --------------------------------------------------------

--
-- Table structure for table `orderinfo`
--

CREATE TABLE `orderinfo` (
  `order_no` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `payment` int(11) NOT NULL,
  `breakfast` tinyint(1) NOT NULL,
  `lunch` tinyint(1) NOT NULL,
  `dinner` tinyint(1) NOT NULL,
  `tea` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderinfo`
--

INSERT INTO `orderinfo` (`order_no`, `student_id`, `payment`, `breakfast`, `lunch`, `dinner`, `tea`) VALUES
(1, 21005555, 200, 0, 0, 1, 0),
(2, 21005555, 200, 0, 0, 1, 0),
(3, 222, 200, 0, 0, 1, 0),
(4, 21005555, 200, 0, 0, 1, 0),
(5, 21005555, 350, 0, 1, 1, 0),
(6, 21005555, 350, 0, 1, 1, 0),
(7, 21005555, 350, 0, 1, 1, 0),
(8, 21005555, 450, 1, 1, 1, 0),
(9, 21005555, 450, 1, 1, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `passing`
--

CREATE TABLE `passing` (
  `ID` int(11) NOT NULL,
  `Student_ID` varchar(10) NOT NULL,
  `Status` varchar(3) NOT NULL,
  `Time` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `passing`
--

INSERT INTO `passing` (`ID`, `Student_ID`, `Status`, `Time`) VALUES
(1, '21005548', 'Out', '2020/10/26 22:47:20'),
(2, '21005555', 'In', '2020/10/26 22:52:25');

-- --------------------------------------------------------

--
-- Table structure for table `paymenthistory`
--

CREATE TABLE `paymenthistory` (
  `paymentid` int(20) NOT NULL,
  `studentid` int(10) NOT NULL,
  `amount` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `paymenthistory`
--

INSERT INTO `paymenthistory` (`paymentid`, `studentid`, `amount`) VALUES
(1, 21005555, 1000),
(2, 21005555, 20000),
(3, 21005555, 2),
(4, 21005555, 1000),
(5, 21005555, 1000),
(6, 21005555, 1500),
(7, 21005555, 1500),
(8, 21005555, 15002),
(9, 21005555, 15002),
(10, 21005555, 20000),
(11, 21005555, 20000);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `tel` int(11) NOT NULL,
  `faculty` varchar(3) NOT NULL,
  `moneyPaid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `tel`, `faculty`, `moneyPaid`) VALUES
(222, 'test2', 444, 'SOC', 12000),
(12345, 'test', 123, 'SOC', 66),
(21005548, 'SPLD Sudasinghe', 712055296, 'SOC', 99),
(21005555, 'SPLW Sudasinghe', 746982736, 'SOC', 60003);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orderinfo`
--
ALTER TABLE `orderinfo`
  ADD PRIMARY KEY (`order_no`);

--
-- Indexes for table `passing`
--
ALTER TABLE `passing`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `paymenthistory`
--
ALTER TABLE `paymenthistory`
  ADD PRIMARY KEY (`paymentid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orderinfo`
--
ALTER TABLE `orderinfo`
  MODIFY `order_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `passing`
--
ALTER TABLE `passing`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `paymenthistory`
--
ALTER TABLE `paymenthistory`
  MODIFY `paymentid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
