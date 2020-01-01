/*
 Navicat Premium Data Transfer

 Source Server         : web
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 01/01/2020 17:09:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `gamename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, NULL, 'www.cf.com');

-- ----------------------------
-- Table structure for games
-- ----------------------------
DROP TABLE IF EXISTS `games`;
CREATE TABLE `games`  (
  `g_id` int(11) NOT NULL AUTO_INCREMENT,
  `gamename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `download_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `strategy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `video` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`g_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of games
-- ----------------------------
INSERT INTO `games` VALUES (1, '英雄联盟', 'www.lol.com', '《英雄联盟》(简称LOL)是由美国拳头游戏(Riot Games)开发、中国大陆地区腾讯游戏代理运营的英雄对战MOBA竞技网游。\r\n游戏里拥有数百个个性英雄，并拥有排位系统、符文系统等特色养成系统。\r\n《英雄联盟》还致力于推动全球电子竞技的发展，除了联动各赛区发展职业联赛、打造电竞体系之外，每年还会举办“季中冠军赛”“全球总决赛”“All Star全明星赛”三大世界级赛事，获得了亿万玩家的喜爱，形成了自己独有的电子竞技文化。', 'web1.jpg', '《英雄联盟》(简称LOL)是由美国拳头游戏(Riot Games)开发、中国大陆地区腾讯游戏代理运营的英雄对战MOBA竞技网游。\r\n游戏里拥有数百个个性英雄，并拥有排位系统、符文系统等特色养成系统。\r\n《英雄联盟》还致力于推动全球电子竞技的发展，除了联动各赛区发展职业联赛、打造电竞体系之外，每年还会举办“季中冠军赛”“全球总决赛”“All Star全明星赛”三大世界级赛事，获得了亿万玩家的喜爱，形成了自己独有的电子竞技文化。', '2019-12-30-02_05_55_2019-12-30-02_11_33_v.mp4');
INSERT INTO `games` VALUES (2, 'cf', 'www.cf.com', '《穿越火线：枪战王者》是一款由韩国Smilegate研发商及腾讯游戏打造发布的第一人称射击类手游。该游戏于2015年9月21日在国服进行了首测， [1]  并于2017年4月18日在韩服正式上线。 [2] \r\n《穿越火线：枪战王者》与端游一脉相承，保留了端游原汁原味的玩法和手感。在世界观上，主线同样为保卫者和潜伏者的斗争；在玩法模式上，完美复刻了爆破模式、个人竞技、团队竞技、特殊战等经典玩法，同时也根据手游的特点，特别推出了剧情闯关、单人挑战等移动端特有玩法。 [1]', 'web2.jpg', '《穿越火线：枪战王者》是一款由韩国Smilegate研发商及腾讯游戏打造发布的第一人称射击类手游。该游戏于2015年9月21日在国服进行了首测， [1]  并于2017年4月18日在韩服正式上线。 [2] \r\n《穿越火线：枪战王者》与端游一脉相承，保留了端游原汁原味的玩法和手感。在世界观上，主线同样为保卫者和潜伏者的斗争；在玩法模式上，完美复刻了爆破模式、个人竞技、团队竞技、特殊战等经典玩法，同时也根据手游的特点，特别推出了剧情闯关、单人挑战等移动端特有玩法。 [1]', '2019-12-30-02_05_55_2019-12-30-02_11_33_v.mp4');
INSERT INTO `games` VALUES (3, 'dnf', 'www.dnf.com', 'a伐沙士大夫撒地方撒地方的说法', '/posters/1577768838543web4.jpg', '就是乱按技能', '141');
INSERT INTO `games` VALUES (4, 'csgo', 'www.csgo.com', '垃圾游戏', '/posters/157777093471017-38-41-5075170-skull-wallpapers.jpg', '请点击右键', '222');
INSERT INTO `games` VALUES (5, 'csgo', 'www.csgo.com', '垃圾游戏', '/posters/157786369035917-38-41-5075170-skull-wallpapers.jpg', '请点击右键', '222');
INSERT INTO `games` VALUES (6, 'csgo', 'www.csgo.com', '垃圾游戏', '/posters/157786370058817-38-41-5075170-skull-wallpapers.jpg', '请点击右键', '222');
INSERT INTO `games` VALUES (7, '111', 'www.csgosss.com', '游戏', '/posters/1577864144370web3.jpg', '115415415', '222');

-- ----------------------------
-- Table structure for strategy
-- ----------------------------
DROP TABLE IF EXISTS `strategy`;
CREATE TABLE `strategy`  (
  `strategy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of strategy
-- ----------------------------
INSERT INTO `strategy` VALUES ('《英雄联盟》(简称LOL)是由美国拳头游戏(Riot Games)开发、中国大陆地区腾讯游戏代理运营的英雄对战MOBA竞技网游。\r\n游戏里拥有数百个个性英雄，并拥有排位系统、符文系统等特色养成系统。\r\n《英雄联盟》还致力于推动全球电子竞技的发展，除了联动各赛区发展职业联赛、打造电竞体系之外，每年还会举办“季中冠军赛”“全球总决赛”“All Star全明星赛”三大世界级赛事，获得了亿万玩家的喜爱，形成了自己独有的电子竞技文化。');

-- ----------------------------
-- Table structure for summary
-- ----------------------------
DROP TABLE IF EXISTS `summary`;
CREATE TABLE `summary`  (
  `summary_id` int(11) NOT NULL AUTO_INCREMENT,
  `summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`summary_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of summary
-- ----------------------------
INSERT INTO `summary` VALUES (1, '《英雄联盟》(简称LOL)是由美国拳头游戏(Riot Games)开发、中国大陆地区腾讯游戏代理运营的英雄对战MOBA竞技网游。\r\n游戏里拥有数百个个性英雄，并拥有排位系统、符文系统等特色养成系统。\r\n《英雄联盟》还致力于推动全球电子竞技的发展，除了联动各赛区发展职业联赛、打造电竞体系之外，每年还会举办“季中冠军赛”“全球总决赛”“All Star全明星赛”三大世界级赛事，获得了亿万玩家的喜爱，形成了自己独有的电子竞技文化。');

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser`  (
  `u_id` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avater` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES (1, '1234', 'qwe', '张三', '18', '男', NULL);
INSERT INTO `sysuser` VALUES (2, '5678', '14456', '桂花', '56', '女', NULL);
INSERT INTO `sysuser` VALUES (3, '7777', '7894', '猛男', '151', '女', NULL);
INSERT INTO `sysuser` VALUES (4, 'test02', 'test01', '张飞', '120', '男', NULL);
INSERT INTO `sysuser` VALUES (NULL, 'test01', 'test01', '张飞', '120', '男', NULL);
INSERT INTO `sysuser` VALUES (NULL, 'test04', 'test05', '刘备', '14200000', '变态', NULL);
INSERT INTO `sysuser` VALUES (NULL, 't888', 'tjuhbgbhygvbhygbhnhbuj05', '计划', '14200000', '变态', NULL);
INSERT INTO `sysuser` VALUES (NULL, 't88', 'tjuhbgbhygvbhygbhnhbuj05', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '', '', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '1234', 'qe', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '2888', 't4bhnbuj05', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '7777', '7894', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '1234', 'qwe', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'test02', 'test01', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 't888', 'tjuhbgbhygvbhygbhnhbuj05', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '1234', 'qe', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '555', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '555', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '5545', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ijuhjuj5', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ijuhjuj5', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ijuhju111j5', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ijuhju111j5', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ijuhju44111j5', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '7777555', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, '7777555', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ssssssss', '11', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'ssssssss', '555', NULL, '0', NULL, NULL);
INSERT INTO `sysuser` VALUES (NULL, 'leirong', '141242', NULL, '0', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
