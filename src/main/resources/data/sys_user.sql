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

 Date: 13/10/2020 18:17:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `department_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'lijz', 1, NULL);
INSERT INTO `sys_user` VALUES (2, 'lucy', 1, NULL);
INSERT INTO `sys_user` VALUES (3, 'bear', 2, NULL);
INSERT INTO `sys_user` VALUES (4, 'mike', 1, NULL);
INSERT INTO `sys_user` VALUES (5, 'lisan', 1, NULL);
INSERT INTO `sys_user` VALUES (6, 'xb', 1, NULL);
INSERT INTO `sys_user` VALUES (7, 'duanwu', 2, NULL);
INSERT INTO `sys_user` VALUES (8, 'fenh', 1, NULL);
INSERT INTO `sys_user` VALUES (9, 'lj', 2, NULL);
INSERT INTO `sys_user` VALUES (10, 'gshen', 5, NULL);
INSERT INTO `sys_user` VALUES (11, 'lihui', 1, NULL);
INSERT INTO `sys_user` VALUES (12, '名称', 1, NULL);
INSERT INTO `sys_user` VALUES (13, '名称', 1, '2020-10-13 16:21:59');

SET FOREIGN_KEY_CHECKS = 1;
