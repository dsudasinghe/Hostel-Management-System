-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 06, 2020 at 01:37 PM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `fname` varchar(10) NOT NULL,
  `lname` varchar(10) NOT NULL,
  `id` varchar(10) NOT NULL,
  `uname` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`fname`, `lname`, `id`, `uname`, `password`, `email`) VALUES
('ravinath', 'hiranya', '121212', 'hir', '1111', 'hiranya'),
('lalindu', 'wenasara', '21005555', 'lalindu', '1234', 'lalindu@gmail.com');

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
(9, 21005555, 450, 1, 1, 1, 0),
(10, 21005555, 0, 1, 1, 0, 0),
(11, 21005555, 0, 1, 1, 0, 0),
(12, 21005555, 0, 1, 0, 1, 0),
(13, 21005555, 0, 1, 0, 1, 0),
(14, 21005555, 0, 1, 0, 1, 0),
(15, 21005555, 0, 1, 0, 1, 0),
(16, 21005555, 0, 0, 0, 1, 0),
(17, 21005555, 0, 0, 0, 1, 0),
(18, 21005555, 0, 0, 1, 1, 0),
(19, 21005555, 0, 0, 1, 1, 0),
(20, 21005555, 0, 0, 0, 1, 0),
(21, 21005555, 0, 0, 1, 1, 0),
(22, 21005555, 200, 0, 1, 1, 0),
(23, 21005555, 0, 0, 1, 1, 0),
(24, 21005555, 400, 0, 1, 1, 0),
(25, 21005555, 400, 0, 1, 1, 0),
(26, 21005555, 0, 0, 1, 1, 0),
(27, 21005555, 0, 0, 1, 1, 0),
(28, 21005555, 0, 1, 1, 0, 1),
(29, 21005555, 0, 1, 1, 0, 1),
(30, 21005555, 0, 1, 1, 0, 1),
(31, 21005555, 0, 1, 0, 0, 0),
(32, 21005555, 300, 1, 0, 1, 0);

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
-- Table structure for table `pricelist`
--

CREATE TABLE `pricelist` (
  `itemname` varchar(20) NOT NULL,
  `price` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pricelist`
--

INSERT INTO `pricelist` (`itemname`, `price`) VALUES
('001', 100),
('002', 15000),
('003', 200),
('004', 200),
('005', 80),
('006', 8000);

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `student_id` int(10) NOT NULL,
  `room_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`student_id`, `room_id`) VALUES
(222, 3),
(21005555, 2);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` int(5) NOT NULL,
  `type` tinyint(1) NOT NULL,
  `floor` varchar(10) NOT NULL,
  `numberOfmembers` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `type`, `floor`, `numberOfmembers`) VALUES
(1, 1, '1', 0),
(2, 0, '2', 1),
(3, 1, '2', 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `tel` int(11) NOT NULL,
  `faculty` varchar(3) NOT NULL,
  `moneyPaid` int(11) DEFAULT NULL,
  `paidOrNot` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `tel`, `faculty`, `moneyPaid`, `paidOrNot`) VALUES
(222, 'test2', 444, 'SOC', 228000, 1),
(445, 'maleesh', 55577755, 'SOC', 5555555, 0),
(12345, 'test', 123, 'SOC', 6555, 0),
(21005548, 'SPLD Sudasinghe', 712055296, 'SOC', 99, 0),
(21005555, 'SPLW Sudasinghe', 746982736, 'SOC', 5849000, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

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
-- Indexes for table `pricelist`
--
ALTER TABLE `pricelist`
  ADD PRIMARY KEY (`itemname`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`student_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`room_id`);

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
  MODIFY `order_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

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

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
