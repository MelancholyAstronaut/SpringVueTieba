/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : tieba

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 21/10/2020 15:02:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tieba
-- ----------------------------
DROP TABLE IF EXISTS `tieba`;
CREATE TABLE `tieba`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '贴吧每一个id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贴吧名字',
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贴吧描述',
  `p_num` int(8) NULL DEFAULT NULL COMMENT '贴吧人数',
  `t_num` int(8) NOT NULL COMMENT '贴吧帖子数量',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '贴吧图',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '贴吧的链接',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tieba
-- ----------------------------
INSERT INTO `tieba` VALUES ('0', 'lck', '世界第二赛区', 88462, 40799, '/card_head/lck.jpg', '/tieba/lck');
INSERT INTO `tieba` VALUES ('1', 'lpl', '世界第一赛区', 40550, 28329, '/card_head/lpl.jpg', '/tieba/lpl');
INSERT INTO `tieba` VALUES ('2', 'dwg', '韩国dwg贴吧', 13815, 45910, '/card_head/dwg.jpg', '/tieba/dwg');
INSERT INTO `tieba` VALUES ('3', 'fnc', '欧洲豪强FNC', 27064, 57570, '/card_head/fnc.jpg', '/tieba/fnc');
INSERT INTO `tieba` VALUES ('4', 'jdg', '下等马赛区', 10385, 23658, '/card_head/jdg.jpg', '/tieba/jdg');
INSERT INTO `tieba` VALUES ('5', 'tl', 'teamLiquid战队', 78757, 52621, '/card_head/tl.jpg', '/tieba/tl');
INSERT INTO `tieba` VALUES ('6', 'lol', '英雄联盟官方贴吧', 99242, 96161, '/card_head/lol.jpg', '/tieba/lol');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name_uindex`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'luz', '123456');
INSERT INTO `user` VALUES (2, 'HLj9F9T3', '123456');
INSERT INTO `user` VALUES (3, 'admin', '123456');

SET FOREIGN_KEY_CHECKS = 1;
