/*
Navicat MySQL Data Transfer

Source Server         : 杨波
Source Server Version : 50022
Source Host           : 127.0.0.1:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2017-03-17 19:53:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL auto_increment,
  `number` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `birthday` date default NULL,
  `grade_id` int(11) default NULL,
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', '啊啊啊', '女', '2017-03-15', '2');
INSERT INTO `student` VALUES ('14', '3', 'e', 'ç·', '2017-03-06', '2');
INSERT INTO `student` VALUES ('16', '5', 'z', 'ç·', '2017-03-11', '2');
INSERT INTO `student` VALUES ('24', '6', 'å»é¼', 'ç·', '2017-01-01', '1');
INSERT INTO `student` VALUES ('33', '6', '傻逼', '男', '2015-01-01', '1');
INSERT INTO `student` VALUES ('34', '7', 'åå', 'ç·', '2017-03-11', '2');
INSERT INTO `student` VALUES ('35', '7', 'åå', 'ç·', '2017-03-11', '2');
INSERT INTO `student` VALUES ('36', '8', 'è¯·æ±', 'ç·', '2017-03-11', '1');
INSERT INTO `student` VALUES ('37', '9', '啊啊', '男', '2017-03-11', '1');
INSERT INTO `student` VALUES ('38', '10', '得到', '男', '2017-03-17', '1');
INSERT INTO `student` VALUES ('39', '11', '请问而且', '女', '2017-03-07', '2');
INSERT INTO `student` VALUES ('40', '12', '发 是', '男', '2017-03-06', '3');
