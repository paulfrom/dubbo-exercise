/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : utf-8

 Date: 07/07/2017 11:16:06 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_demo`
-- ----------------------------
DROP TABLE IF EXISTS `t_demo`;
CREATE TABLE `t_demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `age` tinyint(3) unsigned NOT NULL,
  `money` decimal(10,2) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_demo`
-- ----------------------------
BEGIN;
INSERT INTO `t_demo` VALUES ('1', 'paul', '12', '12.32'), ('2', 'Amy', '12', '12.12'), ('3', 'andy', '32', '32.90'), ('4', 'andy', '32', '32.90'), ('5', 'andy', '32', '32.90');
COMMIT;

-- ----------------------------
--  Table structure for `t_other`
-- ----------------------------
DROP TABLE IF EXISTS `t_other`;
CREATE TABLE `t_other` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `other_name` varchar(32) NOT NULL,
  `other_thing` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_other`
-- ----------------------------
BEGIN;
INSERT INTO `t_other` VALUES ('1', 'other1', 'thing1'), ('2', 'other2', 'thing2'), ('3', 'other3', 'thing3');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
