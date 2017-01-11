/*
Navicat MySQL Data Transfer

Source Server         : 10.10.4.223_3306
Source Server Version : 50534
Source Host           : 10.10.4.223:3306
Source Database       : postdoctors

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2015-07-18 22:01:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `arti_id` int(11) NOT NULL AUTO_INCREMENT,
  `arti_colmId` int(11) NOT NULL,
  `arti_title` varchar(55) NOT NULL,
  `arti_content` text COMMENT '内容',
  `arti_author` varchar(45) DEFAULT NULL,
  `arti_date` datetime DEFAULT NULL,
  `arti_state` tinyint(1) DEFAULT '1' COMMENT '如果为true则消息发布，否则不显示',
  PRIMARY KEY (`arti_id`),
  KEY `fk_article_columnss` (`arti_colmId`),
  CONSTRAINT `fk_article_columnss` FOREIGN KEY (`arti_colmId`) REFERENCES `columnss` (`colm_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='文章';

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', '1', '中华', '说的方法反反复复反复', '十分大方', '2015-07-18 21:33:36', '1');
INSERT INTO `article` VALUES ('2', '1', '故乡', '故乡对我们', '鲁迅', '2015-07-18 21:32:59', '1');

-- ----------------------------
-- Table structure for attachments
-- ----------------------------
DROP TABLE IF EXISTS `attachments`;
CREATE TABLE `attachments` (
  `atta_id` int(11) NOT NULL AUTO_INCREMENT,
  `atta_artiId` int(11) NOT NULL,
  `atta_name` varchar(225) NOT NULL,
  `atta_path` varchar(225) NOT NULL,
  `atta_servername` varchar(255) NOT NULL,
  `atta_type` varchar(45) DEFAULT NULL,
  `atta_note` text,
  PRIMARY KEY (`atta_id`),
  KEY `fk_attachments_article1` (`atta_artiId`),
  CONSTRAINT `fk_attachments_article1` FOREIGN KEY (`atta_artiId`) REFERENCES `article` (`arti_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='附件';

-- ----------------------------
-- Records of attachments
-- ----------------------------

-- ----------------------------
-- Table structure for columnss
-- ----------------------------
DROP TABLE IF EXISTS `columnss`;
CREATE TABLE `columnss` (
  `colm_id` int(11) NOT NULL AUTO_INCREMENT,
  `colm_name` varchar(45) NOT NULL COMMENT '栏目名称',
  `colm_type` int(11) DEFAULT NULL COMMENT '如果为1则，该栏目下只有一篇文章，如果为2则下面可以有多篇文章',
  `colm_note` text COMMENT '名称备注',
  PRIMARY KEY (`colm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='栏目表';

-- ----------------------------
-- Records of columnss
-- ----------------------------
INSERT INTO `columnss` VALUES ('1', '通知公告', '2', '通知公告');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `user_password` varchar(45) NOT NULL,
  `user_loginname` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
