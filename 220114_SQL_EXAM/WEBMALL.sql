-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.6.5-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- webmall 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `webmall` /*!40100 DEFAULT CHARACTER SET utf8mb3 */;
USE `webmall`;

-- 테이블 webmall.customer_info 구조 내보내기
CREATE TABLE IF NOT EXISTS `customer_info` (
  `cust_id` varchar(10) NOT NULL,
  `cust_pw` varchar(10) DEFAULT NULL,
  `cust_name` varchar(15) DEFAULT NULL,
  `cust_tel_no` varchar(13) DEFAULT NULL,
  `cust_addr` varchar(100) DEFAULT NULL,
  `cust_gender` char(1) DEFAULT NULL,
  `cust_email` varchar(30) DEFAULT NULL,
  `cust_join_date` date DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 테이블 데이터 webmall.customer_info:~10 rows (대략적) 내보내기
/*!40000 ALTER TABLE `customer_info` DISABLE KEYS */;
INSERT IGNORE INTO `customer_info` (`cust_id`, `cust_pw`, `cust_name`, `cust_tel_no`, `cust_addr`, `cust_gender`, `cust_email`, `cust_join_date`) VALUES
	('W199509', '950910', '주세인', '01026102291', '서울시 양천구', 'F', 'sein@gmail.com', '2022-01-14'),
	('W363739', '19871104', '고객170', '1011111280', '용인시', 'F', 'scust170@sfnb.co.kr', '2021-10-07'),
	('W365779', '19990201', '고객171', '1011111281', '수원시', 'M', 'scust171@sfnb.co.kr', '2021-12-16'),
	('W366551', '19850727', '고객172', '1011111282', '진주시', 'F', 'scust172@sfnb.co.kr', '2021-10-23'),
	('W366641', '19940922', '고객173', '1011111283', '서울시', 'F', 'scust173@sfnb.co.kr', '2021-01-07'),
	('W367946', '19901127', '고객174', '1011111284', '거제시', 'M', 'scust174@sfnb.co.kr', '2021-07-14'),
	('W368037', '19840609', '고객175', '1011111285', '부산광역시', 'M', 'scust175@sfnb.co.kr', '2021-09-16'),
	('W370526', '19950720', '고객176', '1011111286', '광주광역시', 'F', 'scust176@sfnb.co.kr', '2021-11-14'),
	('W370765', '19890306', '고객177', '1011111287', '강릉시', 'F', 'scust177@sfnb.co.kr', '2021-08-12'),
	('W371982', '19920622', '고객178', '1011111288', '부천시', 'M', 'scust178@sfnb.co.kr', '2021-01-16');
/*!40000 ALTER TABLE `customer_info` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
