/*
 Navicat Premium Data Transfer

 Source Server         : huawei-docker
 Source Server Type    : MySQL
 Source Server Version : 100506
 Source Host           : 124.70.40.210:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 100506
 File Encoding         : 65001

 Date: 13/10/2020 18:17:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `order` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '财务', 1);
INSERT INTO `department` VALUES (2, '需求', 2);
INSERT INTO `department` VALUES (3, '销售', 3);
INSERT INTO `department` VALUES (4, '研发', 4);
INSERT INTO `department` VALUES (5, '人士', 5);

SET FOREIGN_KEY_CHECKS = 1;
