-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 15, 2019 at 05:27 PM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finalpro`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Order_ID` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `TP_No` int(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  PRIMARY KEY (`Order_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Order_ID`, `Name`, `TP_No`, `Address`) VALUES
('750142', 'maliya', 767563588, 'nitt'),
('641936', 'mdfhdf', 232342, 'dfdf'),
('9474', 'asd', 234234, 'asd'),
('975159', 'Pumu', 13123123, 'kikik'),
('554816', 'sasas', 1212312, 'asda'),
('578963', 'qqw', 123, 'fref'),
('783154', 'Asanka', 768576876, 'Kiridiwela'),
('414832', 'hjaf', 23423, 'af'),
('241513', 'hgsd', 34235, 'sdg'),
('666560', 'asanka', 78968765, 'kiridiwela'),
('848296', 'efef', 2342, 'dv'),
('828698', 'hirushan', 12312414, 'afaf'),
('677134', 'mmmm', 34234234, 'sdgasdg'),
('608090', 'jh', 1231231, 'sdv'),
('7374', 'fwfw', 121212, 'wefwe'),
('30165', 'asd', 123123, 'asd'),
('573555', 'sdf', 234343434, 'df'),
('842014', 'F', 234, '23'),
('149563', 'AE', 323232, 'G'),
('875390', 'hgjy', 4354344, 'hjf'),
('787691', 'cjfgjj', 575457, 'jfgjf'),
('827366', 'asd', 123123, 'asd'),
('458191', 'dafa', 12124, 'adad'),
('284106', 'assd', 12312, 'sg'),
('33596', 'sdfd', 123123123, 'dvasdv'),
('132970', 'sf', 2314134, 'df'),
('917814', 'ghfhg', 5, 'gkhj'),
('165090', 'sdDv', 121244, 'DV'),
('15424', 'sdf', 2323, 'ds'),
('857050', 'sdv', 2343, 'ZDV'),
('970803', 'dzfb', 235235, 'fbzd'),
('886480', 'sdgsdg', 2352, 'sdg'),
('957803', 'sds', 121212, 'sds'),
('122719', 'ahagf', 23423, 'arggr'),
('424005', 'ssss', 12312312, 'asd'),
('29345', 'ffdf', 6544556, 'mbvg'),
('422631', 'dvsdvsd', 1121212, 'das'),
('948198', 'bkhdf', 72263, 'sbhs'),
('673429', 'sffw', 123456, 'weff'),
('784794', 'f', 123123, 'fqef'),
('873760', 'Ff', 21131231, 'dfs'),
('866830', 'adfdf', 123123, 'fdfsdf'),
('27091', 'faef', 1231, 'afaf'),
('80345', 'sasasa', 123123, 'saasf'),
('889800', 'sgsg', 23235, 'sdgsd');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `username`, `password`) VALUES
(9, 'sarath', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `order_de`
--

DROP TABLE IF EXISTS `order_de`;
CREATE TABLE IF NOT EXISTS `order_de` (
  `Order_ID` varchar(20) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Quantity` int(20) DEFAULT NULL,
  `Unit_Price` double(10,2) DEFAULT NULL,
  `Amount` double(20,2) DEFAULT NULL,
  `Order_Date` date DEFAULT NULL,
  `Order_Time` time DEFAULT NULL,
  `Cost` double(10,2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_de`
--

INSERT INTO `order_de` (`Order_ID`, `Description`, `Quantity`, `Unit_Price`, `Amount`, `Order_Date`, `Order_Time`, `Cost`) VALUES
('857050', '4X6Print(Media)', 5, 20.00, 100.00, '2019-09-07', '00:38:53', 50.00),
('857050', '5X7Laminating(Gloss)', 3, 25.00, 75.00, '2019-09-07', '00:38:53', 60.00),
('970803', '4X6Print(Media)', 2, 20.00, 40.00, '2019-09-07', '07:11:47', 20.00),
('886480', '4X6Print(Media)', 4, 20.00, 80.00, '2019-09-07', '07:22:45', 40.00),
('957803', '4X6Print(Media)', 2, 20.00, 40.00, '2019-09-07', '07:29:01', 20.00),
('957803', '20X24Print(Media)', 2, 1750.00, 3500.00, '2019-09-07', '07:29:01', 3000.00),
('122719', '4X6Print(Media)', 3, 20.00, 60.00, '2019-09-07', '09:33:59', 30.00),
('122719', '16X24Print(Media)', 3, 1400.00, 4200.00, '2019-09-07', '09:33:59', 3000.00),
('424005', '4X6Print(Media)', 2, 20.00, 40.00, '2019-10-05', '04:18:48', 20.00),
('424005', '6X9Print(Media)', 4, 60.00, 240.00, '2019-10-05', '04:18:48', 180.00),
('29345', '10X12Print(Media)', 3, 140.00, 420.00, '2019-10-07', '11:03:07', 300.00),
('29345', '4X6Print(Media)', 6, 20.00, 120.00, '2019-10-07', '11:03:07', 60.00),
('948198', '4X6Print(Media)', 2, 20.00, 40.00, '2019-10-08', '09:46:36', 20.00),
('948198', '6X9Print(Media)', 1, 60.00, 60.00, '2019-10-08', '09:46:36', 45.00),
('673429', '4X6Print(Media)', 3, 20.00, 60.00, '2019-10-14', '06:36:52', 30.00),
('866830', '4X6Print(Media)', 2, 20.00, 40.00, '2019-10-14', '06:53:38', 20.00),
('866830', '4X6Print(Media)', 4, 20.00, 80.00, '2019-10-14', '06:53:38', 40.00),
('27091', '6X8Print(Media)', 2, 20.00, 40.00, '2019-10-15', '09:45:45', 20.00),
('80345', '4X6Print(Media)', 2, 20.00, 40.00, '2019-10-15', '07:41:27', 20.00);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `Key_ID` varchar(20) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Cost` double(20,2) DEFAULT NULL,
  `Sale_Price` double(20,2) DEFAULT NULL,
  PRIMARY KEY (`Key_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Key_ID`, `Description`, `Cost`, `Sale_Price`) VALUES
('PM4X6', '4X6Print(Media)', 10.00, 20.00),
('PM4X8', '4X8Print(Media)', 25.00, 50.00),
('PM5X7', '5X7Print(Media)', 25.00, 50.00),
('PM6X8', '6X8Print(Media)', 45.00, 60.00),
('PM6X9', '6X9Print(Media)', 45.00, 60.00),
('PM8X8', '8X8Print(Media)', 60.00, 80.00),
('PM8X10', '8X10Print(Media)', 65.00, 85.00),
('PM8X12', '8X12Print(Media)', 75.00, 100.00),
('PM10X12', '10X12Print(Media)', 100.00, 140.00),
('PM10X15', '10X15Print(Media)', 110.00, 150.00),
('PM12X18', '12X18Print(Media)', 270.00, 350.00),
('PM16X20', '16X20Print(Media)', 900.00, 1300.00),
('PM16X24', '16X24Print(Media)', 1000.00, 1400.00),
('PM20X24', '20X24Print(Media)', 1500.00, 1750.00),
('PM20X30', '20X30Print(Media)', 1750.00, 2000.00),
('PS4X6', '4X6Print(Studio)', 10.00, 50.00),
('PS4X8', '4X8Print(Studio)', 25.00, 60.00),
('PS5X7', '5X7Print(Studio)', 25.00, 60.00),
('PS6X8', '6X8Print(Studio)', 45.00, 90.00),
('PS6X9', '6X9Print(Studio)', 45.00, 90.00),
('PS8X8', '8X8Print(Studio)', 60.00, 120.00),
('PS8X10', '8X10Print(Studio)', 65.00, 130.00),
('PS8X12', '8X12Print(Studio)', 75.00, 150.00),
('PS10X12', '10X12Print(Studio)', 100.00, 200.00),
('PS10X15', '10X15Print(Studio)', 110.00, 220.00),
('PS12X18', '12X18Print(Studio)', 270.00, 500.00),
('PS16X20', '16X20Print(Studio)', 900.00, 1400.00),
('PS16X24', '16X24Print(Studio)', 1000.00, 1500.00),
('PS20X24', '20X24Print(Studio)', 1500.00, 2000.00),
('PS20X30', '20X30Print(Studio)', 1750.00, 2500.00),
('LG4X6', '4X6Laminating(Gloss)', 10.00, 15.00),
('LG4X8', '4X8Laminating(Gloss)', 15.00, 20.00),
('LG5X7', '5X7Laminating(Gloss)', 20.00, 25.00),
('LG6X8', '6X8Laminating(Gloss)', 30.00, 40.00),
('LG6X9', '6X9Laminating(Gloss)', 35.00, 45.00),
('LG8X8', '8X8Laminating(Gloss)', 40.00, 45.00),
('LG8X10', '8X10Laminating(Gloss)', 45.00, 50.00),
('LG8X12', '8X12Laminating(Gloss)', 50.00, 60.00),
('LG10X12', '10X12Laminating(Gloss)', 60.00, 70.00),
('LG10X15', '10X15Laminating(Gloss)', 75.00, 100.00),
('LG12X18', '12X18Laminating(Gloss)', 100.00, 130.00),
('LC4X6', '4X6Laminating(Cold)', 25.00, 40.00),
('LC4X8', '4X8Laminating(Cold)', 30.00, 45.00),
('LC5X7', '5X7Laminating(Cold)', 35.00, 50.00),
('LC6X8', '6X8Laminating(Cold)', 40.00, 60.00),
('LC6X9', '6X9Laminating(Cold)', 40.00, 60.00),
('LC8X8', '8X8Laminating(Cold)', 45.00, 65.00),
('LC8X10', '8X10Laminating(Cold)', 50.00, 70.00),
('LC8X12', '8X12Laminating(Cold)', 55.00, 70.00),
('LC10X12', '10X12Laminating(Cold)', 65.00, 80.00),
('LC10X15', '10X15Laminating(Cold)', 75.00, 100.00),
('LC12X18', '12X18Laminating(Cold)', 100.00, 125.00),
('LC16X20', '16X20Laminating(Cold)', 220.00, 240.00),
('LC20X24', '20X24Laminating(Cold)', 300.00, 350.00),
('LC20X30', '20X30Laminating(Cold)', 350.00, 400.00),
('LH4X6', '4X6Laminating(Gloss)', 10.00, 15.00),
('LH4X8', '4X8Laminating(Gloss)', 15.00, 20.00),
('LH5X7', '5X7Laminating(Gloss)', 20.00, 25.00),
('LH6X8', '6X8Laminating(Gloss)', 30.00, 40.00),
('LH6X9', '6X9Laminating(Gloss)', 35.00, 45.00),
('LH8X8', '8X8Laminating(Gloss)', 40.00, 45.00),
('LH8X10', '8X10Laminating(Gloss)', 45.00, 50.00),
('LH8X12', '8X12Laminating(Gloss)', 50.00, 60.00),
('LH10X12', '10X12Laminating(Gloss)', 60.00, 70.00),
('LH10X15', '10X15Laminating(Gloss)', 75.00, 100.00),
('LH12X18', '12X18Laminating(Gloss)', 100.00, 130.00),
('F4X6', '4X6Frame(N)', 110.00, 150.00),
('F4X8', '4X8Frame(N)', 125.00, 175.00),
('F5X7', '5X7Frame(N)', 150.00, 200.00),
('F6X8', '6X8Frame(N)', 200.00, 250.00),
('F6X9', '6X9Frame(N)', 200.00, 250.00),
('F8X8', '8X8Frame(N)', 230.00, 260.00),
('F8X10', '8X10Frame(N)', 240.00, 275.00),
('F8X12', '8X12Frame(N)', 250.00, 300.00),
('F10X12', '10X12Frame(N)', 265.00, 325.00),
('F10X15', '10X15Frame(N)', 295.00, 350.00),
('F12X18', '12X18Frame(N)', 360.00, 750.00),
('F16X20', '16X20Frame(N)', 1000.00, 1500.00),
('F20X24', '20X24Frame(N)', 1400.00, 1800.00),
('F20X30', '20X30Frame(N)', 2300.00, 3000.00);

-- --------------------------------------------------------

--
-- Table structure for table `weddings`
--

DROP TABLE IF EXISTS `weddings`;
CREATE TABLE IF NOT EXISTS `weddings` (
  `Wedding_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Customer_name` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Package` varchar(50) NOT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Wedding_date` date DEFAULT NULL,
  `Homecomming_date` date DEFAULT NULL,
  `Shooting_time` varchar(50) DEFAULT NULL,
  `Poruwa_time` varchar(50) DEFAULT NULL,
  `Address` varchar(200) NOT NULL,
  `Telephone` int(15) NOT NULL,
  `Homecomming_location` varchar(50) NOT NULL,
  `Homecomming_shootingtime` varchar(50) NOT NULL,
  PRIMARY KEY (`Wedding_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weddings`
--

INSERT INTO `weddings` (`Wedding_ID`, `Customer_name`, `Location`, `Package`, `Type`, `Wedding_date`, `Homecomming_date`, `Shooting_time`, `Poruwa_time`, `Address`, `Telephone`, `Homecomming_location`, `Homecomming_shootingtime`) VALUES
(1, 'chamo', 'dfdf', 'Package 2', 'Videography', '2019-08-09', '2019-08-08', '123', '123', 'asd', 123123, 'wef', '232'),
(2, 'asanka', 'asasd', 'Package 2', 'Photography ', '2019-08-15', '2019-08-15', '34', '34', 'ahada', 2343423, 'hdfs', '345'),
(3, 'sam', 'ass', 'Package 2', 'Photography Videography ', '2019-10-10', '2019-10-31', '21', '12', 'saasasas', 72723433, 'ggfadf', '12'),
(4, 'bukushi', 'sadad', 'Package 1', 'Photography ', '2019-10-11', '2019-10-10', '123', '123', 'asa', 123123123, 'ewff', '232');

-- --------------------------------------------------------

--
-- Table structure for table `wedding_pay`
--

DROP TABLE IF EXISTS `wedding_pay`;
CREATE TABLE IF NOT EXISTS `wedding_pay` (
  `Wedding_ID` int(10) NOT NULL AUTO_INCREMENT,
  `Total` double(10,2) NOT NULL,
  `Advance` double(10,2) NOT NULL,
  PRIMARY KEY (`Wedding_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wedding_pay`
--

INSERT INTO `wedding_pay` (`Wedding_ID`, `Total`, `Advance`) VALUES
(1, 12000.00, 10000.00),
(2, 12000.00, 1200.00),
(3, 1200000.00, 300000.00),
(4, 2323232.00, 32323.00),
(5, 1000.00, 100.00);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
