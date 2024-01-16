-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:43306
-- Generation Time: Sep 09, 2023 at 11:07 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `NAME` varchar(50) NOT NULL,
  `ADDRESS` varchar(50) NOT NULL,
  `PHONE` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`NAME`, `ADDRESS`, `PHONE`) VALUES
('Cong Ty Co Phan Duoc Pham 2/9', 'Quan 11', '02838687355'),
('Cong ty duoc pham Pharmedic ', 'Quan 1', '02839200300'),
('Cong ty Duoc pham Uc Chou ', 'Quan Phu Nhuan', '02838687355'),
('Cong ty TNHH Medicare', 'Quan 1', '01289078443'),
('Cong ty TNHH Rohto Mentholatum', 'Quan 8', '02382229322');

-- --------------------------------------------------------

--
-- Table structure for table `drugs`
--

CREATE TABLE `drugs` (
  `NAME` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `BARCODE` varchar(20) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `CODE` varchar(10) NOT NULL,
  `COST_PRICE` double NOT NULL,
  `SELLING_PRICE` double NOT NULL,
  `EXPIRY` varchar(20) NOT NULL,
  `COMPANY_NAME` varchar(50) NOT NULL,
  `PRODUCTION_DATE` date NOT NULL,
  `EXPIRATION_DATE` date NOT NULL,
  `PLACE` varchar(20) NOT NULL,
  `QUANTITY` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `drugs`
--

INSERT INTO `drugs` (`NAME`, `TYPE`, `BARCODE`, `DOSE`, `CODE`, `COST_PRICE`, `SELLING_PRICE`, `EXPIRY`, `COMPANY_NAME`, `PRODUCTION_DATE`, `EXPIRATION_DATE`, `PLACE`, `QUANTITY`) VALUES
('Levothyroxine', 'Depressants', '123450', '50mg', '1', 1, 10.5, 'Available for use', 'Cong ty duoc pham Pharmedic', '2023-03-03', '2025-03-03', 'A-Down', 40),
('Memantine', 'Hallucinogens', '123461', '20mg', '2', 1, 20, 'Available for use', 'Cong ty Duoc pham Uc Chou ', '2023-04-05', '2025-04-05', 'N-Right', 40),
('Donepezil', 'Stimulants', '123472', '50mg', '3', 1, 15, 'Available for use', 'Cong Ty Co Phan Duoc Pham 2/9', '2023-07-03', '2025-07-03', 'N-Right', 40),
('Eszopiclone	', 'Analgesics', '123483', '50mg', '4', 1, 20, 'Available for use', '?Cong ty TNHH Rohto Mentholatum', '2023-02-03', '2025-02-03', 'N-Right', 40);

-- --------------------------------------------------------

--
-- Table structure for table `expiry`
--

CREATE TABLE `expiry` (
  `PRODUCT_NAME` varchar(50) NOT NULL,
  `PRODUCT_CODE` varchar(20) NOT NULL,
  `DATE_OF_EXPIRY` varchar(10) NOT NULL,
  `QUANTITY_REMAIN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `history_sales`
--

CREATE TABLE `history_sales` (
  `USER_NAME` varchar(20) NOT NULL,
  `BARCODE` varchar(20) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `TYPE` varchar(10) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` double NOT NULL,
  `AMOUNT` double NOT NULL,
  `DATE` varchar(15) NOT NULL,
  `TIME` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `history_sales`
--

INSERT INTO `history_sales` (`USER_NAME`, `BARCODE`, `NAME`, `TYPE`, `DOSE`, `QUANTITY`, `PRICE`, `AMOUNT`, `DATE`, `TIME`) VALUES
('Tran Can Van', '123444', 'Breofin', 'Depressant', ' Free used', 2, 6, 12, '12-02-2022', '05:02:06'),
('Tran Can Van', '123445', 'Breofin', 'Bills', ' Free used', 2, 6, 12, '12-02-2022', '05:02:26'),
('Tran Can Van', '123446', 'Breofin', 'Bills', ' Free used', 4, 6, 24, '12-02-2022', '05:02:40'),
('Tran Can Van', '123447', 'Morfin', 'Injection', '1 (Day)', 2, 14, 28, '13-02-2022', '01:38:00'),
('Tran Can Van', '123448', 'Morfin', 'Injection', '1 (Day)', 2, 14, 28, '13-02-2022', '01:38:10'),
('Tran Can Van', '123449', 'Morfin', 'Injection', '1 (Day)', 7, 14, 98, '13-02-2022', '01:38:28'),
('Tran Can Van', '123450', 'Morfin', 'Injection', '1 (Day)', 1, 14, 14, '13-02-2022', '01:38:46'),
('Tran Can Van', '123451', 'Breofin', 'Bills', ' Free used', 2, 6, 12, '13-02-2022', '01:59:34'),
('Tran Can Van', '123452', 'Breofin', 'Bills', ' Free used', 5, 6, 30, '13-02-2022', '01:59:43'),
('Tran Can Van', '123453', 'Breofin', 'Bills', ' Free used', 1, 6, 6, '13-02-2022', '02:12:33'),
('Tran Can Van', '123200', 'Declofien', 'Injection', 'Free', 2, 14, 28, '17-02-2022', '09:55:43'),
('Tran Can Van', '123201', 'Declofien', 'Injection', 'Free', 2, 14, 28, '17-02-2022', '09:55:58'),
('Tran Can Van', '123202', 'Declofien', 'Injection', 'Free', 5, 14, 70, '17-02-2022', '09:56:11'),
('Cao Bich Chu', '123203', 'Declofien', 'Injection', 'Free', 2, 17, 34, '17-02-2022', '10:04:58'),
('Tran Can Van', '123204', 'Declofien', 'Injection', 'Free', 2, 17, 34, '17-02-2022', '10:05:15'),
('Cao Bich Chu', '123205', 'Declofien', 'Injection', 'Free', 5, 17, 85, '17-02-2022', '10:05:26'),
('Tran Can Van', '123206', 'Declofien', 'Injection', 'Free', 4, 20, 80, '18-02-2022', '11:16:08'),
('Tran Can Van', '123207', 'Declofien', 'Injection', 'Free', 4, 20, 80, '18-02-2022', '11:16:28'),
('Tran Can Van', '123208', 'AnyName', 'Drink', '2 Days', 4, 14, 56, '18-02-2022', '11:17:06'),
('Tran Can Van', '123209', 'AnyName', 'Drink', '2 Days', 4, 14, 56, '18-02-2022', '11:17:15'),
('Cao Bich Chu', '123210', 'AnyName', 'Drink', '2 Days', 7, 14, 98, '18-02-2022', '11:17:24'),
('Tran Can Van', '123211', 'AnyName', 'Drink', '2 Days', 6, 14, 84, '18-02-2022', '11:18:29'),
('Tran Can Van', '123212', 'AnyName', 'Drink', '2 Days', 2, 14, 28, '18-02-2022', '11:18:41'),
('Tran Can Van', '123213', 'AnyName', 'Drink', '2 Days', 2, 14, 28, '18-02-2022', '11:18:45'),
('Le Anh Tu', '123214', 'novafol', 'Bills', 'normal', 2, 40, 80, '14-04-2022', '04:50:32'),
('Cao Bich Chu', '123215', 'novafol', 'Bills', 'normal', 2, 40, 80, '14-04-2022', '04:50:53'),
('Tran Can Van', '123216', 'novafol', 'Bills', 'normal', 6, 40, 240, '14-04-2022', '04:51:01'),
('Cao Bich Chu', '123217', 'novafol', 'Bills', 'normal', 1, 40, 40, '03-05-2022', '03:33:30'),
('Tran Can Van', '123218', 'novafol', 'Bills', 'normal', 1, 40, 40, '03-05-2022', '03:33:36'),
('Cao Bich Chu', '123219', 'novafol', 'Bills', 'normal', 1, 40, 40, '03-05-2022', '03:33:41');

-- --------------------------------------------------------

--
-- Table structure for table `inbox`
--

CREATE TABLE `inbox` (
  `MESSAGE_FROM` varchar(20) NOT NULL,
  `MESSAGE_TO` varchar(20) NOT NULL,
  `MESSAGE_TEXT` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `inbox`
--

INSERT INTO `inbox` (`MESSAGE_FROM`, `MESSAGE_TO`, `MESSAGE_TEXT`) VALUES
('Tran Can Van', 'Le Anh Tu', 'Welcome sir'),
('Le Anh Tu', 'Tran Hong Quan', 'Welcome sir'),
('Tran Cao Van', 'Cao Bich Chu', 'Hay , Bich Chu '),
('Tran Hong Quan', 'Cao Bich Chu', 'Hay Bich'),
('Tran Can Van', 'Le Anh Tu', 'Welcome my home'),
('Cao Bich Chu', 'Le Anh Tu', 'Hello , Tu'),
('Cao Bich Chu', 'Tran Hong Quan', 'Quan , Please go and update\nthe drug roof '),
('Cao Bich Chu', 'Tran Can Van', 'Welcome'),
('Tran Hong Quan', 'Cao Bich Chu', 'This is your salary on the disk , \n3000 , close in 12  ; good luck'),
('Tran Hong Quan', 'Le Anh Tu', 'good job meet me in five'),
('Tran Hong Quan', 'Tran Can Van', 'Ok i will '),
('Tran Can Van', 'Tran hong Quan', 'ok, sent it'),
('Cao Bich Chu', 'Tran Hong QUan', 'haaaaaaaaaaaaaaaai'),
('Le Anh Tu', 'Cao Bich Chu', 'What is wrong ? '),
('Tran Hong Quan', 'Le Anh Tu', 'I am okay thanks ');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `NAME` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `DATE` varchar(20) NOT NULL,
  `TIME` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`NAME`, `TYPE`, `DATE`, `TIME`) VALUES
('Tran Can Van', 'Admin', '17-02-2022', '10:30:24'),
('Tran Can Van', 'Admin', '17-02-2022', '10:32:48'),
('Le Anh Tu', 'Employee', '17-02-2022', '10:32:56'),
('Tran Can Van', 'Admin', '17-02-2022', '10:33:10'),
('Le Anh Tu', 'Employee', '17-02-2022', '10:33:37'),
('Tran Can Van', 'Admin', '17-02-2022', '10:36:21'),
('Tran Can Van', 'Admin', '17-02-2022', '10:36:53'),
('Tran Can Van', 'Admin', '17-02-2022', '10:49:27'),
('Tran Can Van', 'Admin', '17-02-2022', '11:02:23'),
('Tran Can Van', 'Admin', '17-02-2022', '01:40:08'),
('Tran Can Van', 'Admin', '18-02-2022', '10:50:29'),
('Tran Can Van', 'Admin', '18-02-2022', '10:51:50'),
('Tran Can Van', 'Admin', '18-02-2022', '10:53:33'),
('Tran Can Van', 'Admin', '18-02-2022', '10:58:41'),
('Tran Can Van', 'Admin', '18-02-2022', '11:15:39'),
('Le Anh Tu', 'Employee', '18-02-2022', '11:18:19'),
('Tran Can Van', 'Admin', '18-02-2022', '11:23:25'),
('Le Anh Tu', 'Employee', '18-02-2022', '11:24:19'),
('Tran Can Van', 'Admin', '04-04-2022', '06:32:57'),
('Le Anh Tu', 'Employee', '04-04-2022', '06:39:00'),
('Tran Can Van', 'Admin', '13-04-2022', '02:57:26'),
('Tran Can Van', 'Admin', '13-04-2022', '03:06:11'),
('Tran Can Van', 'Admin', '13-04-2022', '03:08:31'),
('Tran Can Van', 'Admin', '13-04-2022', '03:09:40'),
('Tran Can Van', 'Admin', '13-04-2022', '03:13:24'),
('Tran Can Van', 'Admin', '13-04-2022', '05:04:26'),
('Tran Can Van', 'Admin', '13-04-2022', '05:07:20'),
('Tran Can Van', 'Admin', '13-04-2022', '05:10:11'),
('Tran Can Van', 'Admin', '13-04-2022', '05:21:53'),
('Tran Can Van', 'Admin', '14-04-2022', '05:11:57'),
('Tran Can Van', 'Admin', '14-04-2022', '05:13:44'),
('Tran Can Van', 'Admin', '14-04-2022', '05:17:42'),
('Tran Can Van', 'Admin', '14-04-2022', '05:19:38'),
('Tran Can Van', 'Admin', '14-04-2022', '05:22:00'),
('Tran Can Van', 'Admin', '14-04-2022', '05:28:37'),
('Tran Can Van', 'Admin', '14-04-2022', '05:30:48'),
('Tran Can Van', 'Admin', '14-04-2022', '05:35:00'),
('Tran Can Van', 'Admin', '14-04-2022', '05:39:54'),
('Tran Can Van', 'Admin', '14-04-2022', '05:41:53'),
('Tran Can Van', 'Admin', '14-04-2022', '05:44:29'),
('Tran Can Van', 'Admin', '14-04-2022', '05:47:08'),
('Tran Can Van', 'Admin', '14-04-2022', '05:48:24'),
('Tran Can Van', 'Admin', '14-04-2022', '05:49:36'),
('Tran Can Van', 'Admin', '14-04-2022', '05:51:28'),
('Tran Can Van', 'Admin', '14-04-2022', '05:53:15'),
('Tran Can Van', 'Admin', '14-04-2022', '06:22:53'),
('Tran Can Van', 'Admin', '14-04-2022', '06:30:59'),
('Tran Can Van', 'Admin', '14-04-2022', '02:32:24'),
('Tran Can Van', 'Admin', '14-04-2022', '02:40:18'),
('Tran Can Van', 'Admin', '14-04-2022', '02:43:43'),
('Tran Can Van', 'Admin', '14-04-2022', '02:46:41'),
('Tran Can Van', 'Admin', '14-04-2022', '02:48:26'),
('Tran Can Van', 'Admin', '14-04-2022', '02:49:19'),
('Tran Can Van', 'Employee', '14-04-2022', '02:52:01'),
('Tran Can Van', 'Admin', '14-04-2022', '02:58:36'),
('Tran Can Van', 'Admin', '14-04-2022', '03:14:22'),
('Tran Can Van', 'Admin', '14-04-2022', '03:17:23'),
('Tran Can Van', 'Admin', '14-04-2022', '03:19:28'),
('Tran Can Van', 'Admin', '14-04-2022', '03:27:34'),
('Tran Can Van', 'Admin', '14-04-2022', '04:49:24'),
('Le Anh Tu', 'Employee', '14-04-2022', '04:55:06'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:01:50'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:03:59'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:14:50'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:17:01'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:17:50'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:21:19'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:23:30'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:26:03'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:28:53'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:32:36'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:35:04'),
('Le Anh Tu', 'Employee', '14-04-2022', '05:37:17'),
('Tran Can Van', 'Admin', '14-04-2022', '07:19:33'),
('Le Anh Tu', 'Employee', '15-04-2022', '02:03:12'),
('Tran Can Van', 'Admin', '15-04-2022', '02:47:28'),
('Tran Can Van', 'Admin', '15-04-2022', '02:56:16'),
('Tran Can Van', 'Admin', '15-04-2022', '03:06:20'),
('Tran Can Van', 'Admin', '15-04-2022', '03:36:58'),
('Tran Can Van', 'Admin', '15-04-2022', '03:42:44'),
('Tran Can Van', 'Admin', '03-05-2022', '01:23:14'),
('Tran Can Van', 'Admin', '03-05-2022', '01:51:20'),
('Tran Can Van', 'Admin', '03-05-2022', '01:52:35'),
('Tran Can Van', 'Admin', '03-05-2022', '03:31:40'),
('Tran Can Van', 'Admin', '03-05-2022', '03:47:32'),
('Tran Can Van', 'Admin', '05-05-2022', '01:24:00'),
('Tran Can Van', 'Admin', '05-05-2022', '03:06:19'),
('Tran Can Van', 'Admin', '05-05-2022', '07:54:02'),
('Le Anh Tu', 'Employee', '05-05-2022', '07:55:52'),
('Tran Can Van', 'Admin', '05-05-2022', '08:01:50'),
('Tran Can Van', 'Admin', '05-05-2022', '08:02:44'),
('Tran Can Van', 'Admin', '05-05-2022', '08:05:37'),
('Tran Can Van', 'Admin', '05-05-2022', '08:07:37'),
('Le Anh Tu', 'Employee', '05-05-2022', '08:09:23'),
('Tran Can Van', 'Admin', '05-05-2022', '08:14:18'),
('Le Anh Tu', 'Employee', '05-05-2022', '08:15:44'),
('Tran Can Van', 'Admin', '05-05-2022', '08:16:15'),
('Tran Can Van', 'Admin', '06-05-2022', '09:51:33'),
('Le Anh Tu', 'Employee', '06-05-2022', '09:52:46'),
('Le Anh Tu', 'Employee', '06-05-2022', '09:54:33'),
('Tran Can Van', 'Admin', '07-05-2022', '04:44:39'),
('Tran Can Van', 'Admin', '07-05-2022', '10:02:15'),
('Tran Can Van', 'Admin', '07-05-2022', '10:12:11'),
('Tran Can Van', 'Admin', '27-05-2022', '03:53:36'),
('Tran Can Van', 'Admin', '27-05-2022', '03:54:05'),
('Tran Can Van', 'Admin', '27-05-2022', '04:05:04'),
('Le Anh Tu', 'Employee', '27-05-2022', '04:06:02'),
('Tran Can Van', 'Admin', '30-05-2022', '03:13:41'),
('Tran Can Van', 'Admin', '31-05-2022', '10:57:35'),
('Tran Can Van', 'Admin', '31-05-2022', '11:00:02'),
('Tran Can Van', 'Admin', '31-05-2022', '11:06:32'),
('Tran Can Van', 'Admin', '07-06-2022', '08:38:00'),
('Tran Can Van', 'Admin', '07-06-2022', '08:40:43'),
('Tran Can Van', 'Admin', '07-06-2022', '08:41:28'),
('Le Anh Tu', 'Employee', '19-09-2022', '06:10:07'),
('Tran Can Van', 'Admin', '07-10-2022', '04:39:50'),
('Tran Can Van', 'Admin', '07-10-2022', '04:40:39'),
('Tran Can Van', 'Admin', '21-11-2022', '09:06:10'),
('Tran Can Van', 'Admin', '21-11-2022', '09:15:39'),
('Le Anh Tu', 'Employee', '14-12-2022', '02:56:45'),
('Tran Can Van', 'Admin', '24-03-2023', '07:20:36'),
('Tran Can Van', 'Admin', '24-03-2023', '08:47:14'),
('Tran Can Van', 'Admin', '24-03-2023', '08:51:01'),
('Le Anh Tu', 'Employee', '24-03-2023', '08:52:17'),
('Tran Can Van', 'Admin', '24-03-2023', '08:52:50'),
('Tran Can Van', 'Admin', '07-09-2023', '10:16:06');

-- --------------------------------------------------------

--
-- Table structure for table `message_history`
--

CREATE TABLE `message_history` (
  `MESSAGE_FROM` varchar(20) NOT NULL,
  `MESSAGE_TO` varchar(20) NOT NULL,
  `MESSAGE_TEXT` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `BARCODE` varchar(20) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `COMPANY_NAME` varchar(20) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` double NOT NULL,
  `AMOUNT` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`BARCODE`, `NAME`, `TYPE`, `COMPANY_NAME`, `QUANTITY`, `PRICE`, `AMOUNT`) VALUES
('123444', 'Breofin', 'Depressant', 'Cong ty duoc pham Ph', 40, 2, 80);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `BARCODE` varchar(20) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `TYPE` varchar(10) NOT NULL,
  `DOSE` varchar(10) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` double NOT NULL,
  `AMOUNT` double NOT NULL,
  `DATE` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(50) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  `SALARY` double NOT NULL,
  `PASSWORD` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `NAME`, `DOB`, `ADDRESS`, `PHONE`, `SALARY`, `PASSWORD`) VALUES
(1, 'Tran Can Van', '23-12-1995', '125 Tran Hung Dao, P9, Quan Phu Nhuan, TpHCM', '01128284736', 10000000, '0000123'),
(2, 'Le Anh Tu', '3-2-1996', '52 Nguyen Thien Thuat, P8, Quan 10, TpHCM', '01290789432', 12000000, 'abcd123'),
(3, 'Tran Hong Quan', '3-2-1999', 'Binh Tan, P4, Q6, TpHCM', '01147893423', 11000000, 'caotan123'),
(4, 'Cao Bich Chu', '7-8-1996', '23/22 Lam Hung, P7, Quan 5, TpHCM', '011804368743', 10500000, 'bich2000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`NAME`);

--
-- Indexes for table `drugs`
--
ALTER TABLE `drugs`
  ADD PRIMARY KEY (`BARCODE`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`BARCODE`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
