/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-11-08 14:43:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `t_id` int(11) NOT NULL,
  `t_name` varchar(30) DEFAULT NULL,
  `t_age` int(10) DEFAULT NULL,
  `t_address` varchar(100) DEFAULT NULL,
  `t_pwd` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '28', '北京', 'abcde');
INSERT INTO `t_user` VALUES ('2', '小明', '25', '青岛', '12345');
INSERT INTO `t_user` VALUES ('3', 'Tom', '23', '沈阳', '66666');
INSERT INTO `t_user` VALUES ('4', 'Jerry', '24', '成都', '88888');
