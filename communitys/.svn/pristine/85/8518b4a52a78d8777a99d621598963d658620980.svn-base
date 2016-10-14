/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : db_community

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-10-12 18:57:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_account`
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL COMMENT '账号',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `name` varchar(20) DEFAULT NULL COMMENT '学生姓名',
  `academy` varchar(20) DEFAULT NULL COMMENT '学院的名称',
  `id_number` varchar(20) DEFAULT NULL COMMENT '学号',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `role` enum('一般学生','社团管理员','社联管理员','场地管理员') DEFAULT NULL,
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  `place_role` enum('未授权','已授权') DEFAULT '未授权' COMMENT '场地申请权限',
  `status` tinyint(4) DEFAULT NULL COMMENT '0-已删除，1-未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('6', 'shelian', 'root', '社联管理员', '软件学院', '2014012152', '110', '社联管理员', '审核通过', '已授权', '1');
INSERT INTO `t_account` VALUES ('7', 'lanqiu', 'root', '篮球社管理员', '软件学院', '2014012153', '110', '社团管理员', '审核通过', '已授权', '1');
INSERT INTO `t_account` VALUES ('8', 'yumaoqiu', 'root', '羽毛球社管理员', '软件学院', '2014012154', '110', '社团管理员', '审核通过', '已授权', '1');
INSERT INTO `t_account` VALUES ('9', 'wuxiaoyang', 'root', '吴晓阳', '软件学院', '2014012155', '110', '社团管理员', '审核通过', '未授权', '1');
INSERT INTO `t_account` VALUES ('13', 'guofengrui', 'root', '郭丰瑞', '软件', '2014012152', '110', '一般学生', '审核通过', '已授权', '1');
INSERT INTO `t_account` VALUES ('14', 'zhuyuehan', 'root', '朱岳涵', '软件', '2013011011', '110110110', '社联管理员', '审核通过', '未授权', '1');
INSERT INTO `t_account` VALUES ('15', 'changdi', 'root', '场地管理员', '', '', '', '场地管理员', '审核通过', '已授权', '1');
INSERT INTO `t_account` VALUES ('17', 'jinfangxin', 'root', '金方鑫', '软件学院', '2014012159', '110', '社团管理员', '审核通过', '未授权', '1');
INSERT INTO `t_account` VALUES ('18', 'gaolaoshi', 'root', '高老师', '软件学院', '20111', '110', '社团管理员', '审核通过', '未授权', '1');

-- ----------------------------
-- Table structure for `t_activity_apply`
-- ----------------------------
DROP TABLE IF EXISTS `t_activity_apply`;
CREATE TABLE `t_activity_apply` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) DEFAULT NULL COMMENT '活动名称',
  `holder` varchar(10) DEFAULT NULL COMMENT '活动发起者',
  `content` text COMMENT '活动内容',
  `time` varchar(20) DEFAULT NULL COMMENT '活动时间',
  `time_start` varchar(20) DEFAULT NULL COMMENT '活动开始时间',
  `account_id` int(50) NOT NULL COMMENT '账号Id',
  `type` enum('未审核','审核未审批','审核已审批','审核不通过') NOT NULL DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_activity_apply
-- ----------------------------
INSERT INTO `t_activity_apply` VALUES ('18', '羽毛球', '羽毛球协会', '<p><img alt=\"u=4080200953,2377494573&amp;fm=116&amp;gp=0.png\" src=\"ueditor/jsp/upload/image/20160913/1473747539435063081.png\" title=\"1473747539435063081.png\"/></p>', '2016-9-19', '17:30', '8', '审核未审批');
INSERT INTO `t_activity_apply` VALUES ('32', 'lanqiu33', 'da ', '<p>fr<br/></p>', 'dsa', '17:00', '7', '未审核');
INSERT INTO `t_activity_apply` VALUES ('33', '篮球迎新杯比赛', 'sadsa', '的萨达', '2016-9-8', '17:00', '7', '未审核');
INSERT INTO `t_activity_apply` VALUES ('49', '前台测试1', '烦人', '<p><img src=\"http://img.baidu.com/hi/jx2/j_0068.gif\"/></p>', '2016-9-12', '17:00', '9', '未审核');
INSERT INTO `t_activity_apply` VALUES ('50', 'cszfs', 'dsad', '<p style=\"text-align: justify;\">dsadsa<br/></p>', '2016-10-3', '10:00', '18', '审核已审批');

-- ----------------------------
-- Table structure for `t_article_lend`
-- ----------------------------
DROP TABLE IF EXISTS `t_article_lend`;
CREATE TABLE `t_article_lend` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `article_name` varchar(50) NOT NULL COMMENT '物品名称',
  `community_name` varchar(50) DEFAULT NULL COMMENT '社团名称',
  `header` varchar(50) DEFAULT NULL COMMENT '负责人姓名',
  `phone` varchar(50) DEFAULT NULL COMMENT '负责人电话',
  `article_use` text COMMENT '物品使用内容',
  `lend_time` varchar(50) DEFAULT NULL COMMENT '物品借用日期',
  `account_id` int(50) DEFAULT NULL COMMENT '借用人的账号Id',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='物品借用（社团向学校申请）';

-- ----------------------------
-- Records of t_article_lend
-- ----------------------------
INSERT INTO `t_article_lend` VALUES ('7', '倒萨倒萨', '大声地', '大苏打', '的撒大苏打', null, '2016-9-5', '7', '未审核');
INSERT INTO `t_article_lend` VALUES ('8', '', '', '', '15290491288', null, '2016-9-5', '8', '未审核');

-- ----------------------------
-- Table structure for `t_class`
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '精品课程的名称',
  `school` varchar(20) DEFAULT NULL COMMENT '学校',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `class_type` varchar(20) DEFAULT NULL COMMENT '课程的类别',
  `introduce` text COMMENT '简介',
  `content` text COMMENT '内容',
  `start_time` varchar(20) NOT NULL COMMENT '进行时间',
  `end_time` varchar(20) NOT NULL,
  `community_id` int(50) DEFAULT NULL COMMENT '社团id',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COMMENT='精品课程';

-- ----------------------------
-- Records of t_class
-- ----------------------------
INSERT INTO `t_class` VALUES ('35', '篮球迎新杯比赛', '东北师大', '篮球社管理员', '文学艺术', '哈哈哈', '哈哈哈哈', '2016-09-10 17:30', '2016-09-13 17:30', '30', '审核通过');
INSERT INTO `t_class` VALUES ('36', '篮球精英杯比赛', '东北师大', '哈哈哈', '哲学历史', '哈哈哈', '哈哈哈', '2016-09-12 20:55', '2016-09-13 20:55', '30', '审核通过');
INSERT INTO `t_class` VALUES ('39', '羽毛球技能训练', '东北师范大学', '羽毛球社管理员', '文学艺术', '<p style=\"\">\r\n	比较容易实现的方法有两个，一个是挥重拍，一个是利用器械。</p><p style=\"\">\r\n	挥重拍就是在平时挥动比羽毛球拍重很多的其他球拍，比如网球拍和壁球拍，或者很老的那种铁质的羽毛球拍，总之就是比常用的球拍重一些。</p><p style=\"\">\r\n	也可以在常用球拍的拍头包上几层报纸，或者是半截拍套，这样改造之后的球拍头非常重，经常挥舞会有助于腕力。</p><p style=\"\">\r\n	在练球时候也可以练习腕力，就是用网球拍或者壁球拍练球，这样坚持下来，手腕力量会有明显增长。注意这个方法练习的重点是手腕的力量，在挥动的过程中要有意识的使用腕力来控制，尽量不要使用胳膊的力量。</p><p style=\"\">\r\n	注意保护手腕，带上护腕是很好的保护措施。</p><p style=\"\">\r\n	利用器械就是用杠铃或者哑铃来练习，即手握杠铃或哑铃，手腕反复屈伸。</p><p style=\"\">\r\n	使用哑铃练习的好处是你可以只练习打球的手腕，但这一般都会造成两个手腕粗细的差异。</p><p style=\"\">\r\n	如果对此很在意，就要同时锻炼两个手腕。</p><p style=\"\">\r\n	练习过程中需要注意，动作快速是锻炼手腕的爆发力，而动作较慢就起不到锻炼爆发力的作用，但可以锻炼手腕的肌肉，对于腕伤的治疗很有帮助。</p><p style=\"\">\r\n	<strong>前臂力量的练习：</strong></p><p style=\"\">\r\n	器械练习是最好的办法，利用哑铃和杠铃，即手握杠铃或哑铃，以肘关节为支点，放下和举起手中重物。</p><p style=\"\">\r\n	在动作上要注意，保持手腕与前臂成一条直线，不用力，这样才可以锻炼到前臂而非手腕。</p><p style=\"\">\r\n	同样的，动作速度快是锻炼爆发力，放慢动作就是恢复训练而不是力量练习了。</p><p style=\"\">\r\n	<strong>手指力量的练习：</strong></p><p style=\"\">\r\n	初级水平的选手一般很难使用到手指的力量，这需要在很放松的状态下，只是在击球的瞬间才紧握球拍，才可以发挥手指的力量。</p><p style=\"\">\r\n	而网前球尤其需要手指的力量，因为越是精细的动作，就越需要极小的动作和细微的发力。</p><p style=\"\">\r\n	练习手指力量一般是使用握力计，平时自己空手频繁做手指快速抓握的动作也可以达到目的，关键在于坚持练习。</p><p><br/></p>', '<p style=\"\">\r\n	比较容易实现的方法有两个，一个是挥重拍，一个是利用器械。</p><p style=\"\">\r\n	挥重拍就是在平时挥动比羽毛球拍重很多的其他球拍，比如网球拍和壁球拍，或者很老的那种铁质的羽毛球拍，总之就是比常用的球拍重一些。</p><p style=\"\">\r\n	也可以在常用球拍的拍头包上几层报纸，或者是半截拍套，这样改造之后的球拍头非常重，经常挥舞会有助于腕力。</p><p style=\"\">\r\n	在练球时候也可以练习腕力，就是用网球拍或者壁球拍练球，这样坚持下来，手腕力量会有明显增长。注意这个方法练习的重点是手腕的力量，在挥动的过程中要有意识的使用腕力来控制，尽量不要使用胳膊的力量。</p><p style=\"\">\r\n	注意保护手作和细微的发力。</p><p style=\"\">\r\n	练习手指力量一般是使用握力计，平时自己空手频繁做手指快速抓握的动作也可以达到目的，关键在于坚持练习。</p><p><br/></p>', '2016-09-13 19:55', '2016-09-15 19:55', '31', '审核通过');
INSERT INTO `t_class` VALUES ('40', '羽毛球冬令营', '东北师大', '吴晓阳', '文学艺术', '<p style=\"\">\r\n	比较容易实现的方法有两个，一个是挥重拍，一个是利用器械。</p><p style=\"\">\r\n	挥重拍就是在平时挥动比羽毛球拍重很多的其他球拍，比如网球拍和壁球拍，或者很老的那种铁质的羽毛球拍，总之就是比常用的球拍重一些。</p><p style=\"\">\r\n	也可以在常用球拍的拍头包上几层报纸，或者是半截拍套，这样改造之后的球拍头非常重，经常挥舞会有助于腕力。</p><p style=\"\">\r\n	在练球时候也可以练习腕力，就是用网球拍或者壁球拍练球，这样坚持下来，手腕力量会有明显增长。注意这个方法练习的重点是手腕的力量，在挥动的过程中要有意识的使用腕力来控制，尽量不要使用胳膊的力量。</p><p style=\"\">\r\n	注意保护手腕，带上护腕是很好的保护措施。</p><p style=\"\">\r\n	利用器械就是用杠铃或者哑铃来练习，即手握杠铃或哑铃，手腕反复屈伸。</p><p style=\"\">\r\n	使用哑铃练习的好处是你可以只练习打球的手腕，但这一般都会造成两个手腕粗细的差异。</p><p style=\"\">\r\n	如果对此很在意，就要同时锻炼两个手腕。</p><p style=\"\">\r\n	练习过程中需要注意，动作快速是锻炼手腕的爆发力，而动作较慢就起不到锻炼爆发力的作用，但可以锻炼手腕的肌肉，对于腕伤的治疗很有帮助。</p><p style=\"\">\r\n	<strong>前臂力量的练习：</strong></p><p style=\"\">\r\n	器械练习是最好的办法，利用哑铃和杠铃，即手握杠铃或哑铃，以肘关节为支点，放下和举起手中重物。</p><p style=\"\">\r\n	在动作上要注意，保持手腕与前臂成一条直线，不用力，这样才可以锻炼到前臂而非手腕。</p><p style=\"\">\r\n	同样的，动作速度快是锻炼爆发力，放慢动作就是恢复训练而不是力量练习了。</p><p style=\"\">\r\n	<strong>手指力量的练习：</strong></p><p style=\"\">\r\n	初级水平的选手一般很难使用到手指的力量，这需要在很放松的状态下，只是在击球的瞬间才紧握球拍，才可以发挥手指的力量。</p><p style=\"\">\r\n	而网前球尤其需要手指的力量，因为越是精细的动作，就越需要极小的动作和细微的发力。</p><p style=\"\">\r\n	练习手指力量一般是使用握力计，平时自己空手频繁做手指快速抓握的动作也可以达到目的，关键在于坚持练习。</p><p><br/></p>', '<p style=\"\">\r\n	比较容易实现的方法有两个，一个是挥重拍，一个是利用器械。</p><p style=\"\">\r\n	挥重拍就是在平时挥动比羽毛球拍重很多的其他球拍，比如网球拍和壁球拍，或者很老的那种铁质的羽毛球拍，总之就是比常用的球拍重一些。</p><p style=\"\">\r\n	也可以在常用球拍的拍头包上几层报纸，或者是半截拍套，这样改造之后的球拍头非常重，经常挥舞会有助于腕力。</p><p style=\"\">\r\n	在练球时候也可以练习腕力，就是用网球拍或者壁球拍练球，这样坚持下来，手腕力量会有明显增长。注意这个方法练习的重点是手腕的力量，在挥动的过程中要有意识的使用腕力来控这需要在很放松的状态下，只是在击球的瞬间才紧握球拍，才可以发挥手指的力量。</p><p style=\"\">\r\n	而网前球尤其需要手指的力量，因为越是精细的动作，就越需要极小的动作和细微的发力。</p><p style=\"\">\r\n	练习手指力量一般是使用握力计，平时自己空手频繁做手指快速抓握的动作也可以达到目的，关键在于坚持练习。</p><p><br/></p>', '2016-09-14 19:55', '2016-12-16 19:55', '31', '审核通过');
INSERT INTO `t_class` VALUES ('41', '金方鑫', '东北师大', '哈哈哈哈', '哲学历史', '<p>1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争取筹办。该活动不只是能够很好的推广文学存在的价值，也能唤起人们对文学文化遗产的关注和重视，吸引更多人支持和热爱文学、发展更多坚持搞文学工作的学子。同时也为文联筹备充足的活动经费和筹办社团拉得赞助商家，又能促成各社团间密切交流与合作，带动各校文学社互动与提升各校文学社的工作能力等。</p><p>2、定时举办文学交流会和各项文学活动，召开干部层会议，定时在不定点校园举行文学活动和文学高峰会，并用先进的科学管理我们，让我们成为一个合格的文学社管理工作者。</p><p>3、定期出版文学社联合会大学生原创文集，集中我们的力量和经验办我们最优秀的学生原创文集。</p><p>4、开展文学交谊活动，促进文学爱好者交流，让每一个文学工作者能够走得更密切。</p><p>5、深入研讨文学工作，辅助各学院发展人文教育，展示广州文明城市之人文特色。</p><p>6、稳扎稳走，起步快发展稳健，广纳各校文学社，包括中学，高中，中专，大专，本科。使最终营造各象牙塔深淳沉稳、自由平等、百家争鸣的校园环境和文学氛围。</p><p>7、把文学社团联合会推向大学生成功创业项目，成为维护学生知识产权和成就学生知识产品等。</p><p>8、扩大我们的顾问团，发展知名度高、有责任心的顾问团，并将以顾问团引导和监督我们的工作，要求我们做到符合实际，符合党和国家的要求。</p><p><br/></p>', '<p>1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争取筹办。该活动不只是能够很好的推广文学存在的价值，也能唤起人们对文学文化遗产的关注和重视，吸引更多人支持和热爱文学、发展更多坚持搞文学工作的学子。同时也为文联筹备充足的活动经费和筹办社团拉得赞助商家，又能促成各社团间密切交流与合作，带动各校文学社互动与提升各校文学社的工作能力等。</p><p>2、定时举办文学交流会和各项文学活动，召开干部层会议，定时在不定点校园举行文学活动和文学高峰会，并用先进的科学管理我们，让我们成为一个合格的文学社管理工作者。</p><p>3、定期出版文学社联合会大学生原创文集，集中我们的力量和经验办我们最优秀的学生原创文集。</p><p>4、开展文学交谊活动，促进文学爱好者交流，让每一个文学工作者能够走得更密切。</p><p>5、深入研讨文学工作，辅助各学院发展人文教育，展示广州文明城市之人文特色。</p><p>6、稳扎稳走，起步快发展稳健，广纳各校文学社，包括中学，高中，中专，大专，本科。使最终营造各象牙塔深淳沉稳、自由平等、百家争鸣的校园环境和文学氛围。</p><p>7、把文学社团联合会推向大学生成功创业项目，成为维护学生知识产权和成就学生知识产品等。</p><p>8、扩大我们的顾问团，发展知名度高、有责任心的顾问团，并将以顾问团引导和监督我们的工作，要求我们做到符合实际，符合党和国家的要求。</p><p><br/></p>', '2016-10-08 23:40', '2016-10-11 23:40', '35', '审核通过');
INSERT INTO `t_class` VALUES ('42', '篮球社11111', '东北师大', '哈哈哈哈', '哲学历史', '<p>hhiuhiu<br/></p>', '<p>ijhihini<br/></p>', '2016-10-10 09:40', '2016-10-13 09:40', '36', '审核通过');

-- ----------------------------
-- Table structure for `t_class_enter`
-- ----------------------------
DROP TABLE IF EXISTS `t_class_enter`;
CREATE TABLE `t_class_enter` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `class_id` int(50) DEFAULT NULL COMMENT '课程的id',
  `student_id` int(50) DEFAULT NULL COMMENT '学生的id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_class_enter
-- ----------------------------
INSERT INTO `t_class_enter` VALUES ('2', '35', '9');
INSERT INTO `t_class_enter` VALUES ('7', '36', '9');
INSERT INTO `t_class_enter` VALUES ('8', '39', '9');
INSERT INTO `t_class_enter` VALUES ('9', '35', '13');
INSERT INTO `t_class_enter` VALUES ('10', '41', '17');
INSERT INTO `t_class_enter` VALUES ('11', '42', '18');

-- ----------------------------
-- Table structure for `t_community`
-- ----------------------------
DROP TABLE IF EXISTS `t_community`;
CREATE TABLE `t_community` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '社团名称',
  `name_head` varchar(50) DEFAULT NULL COMMENT '负责人姓名',
  `student_idnumber` varchar(50) DEFAULT NULL COMMENT '负责人学号',
  `phone` varchar(50) DEFAULT NULL COMMENT '负责人手机号',
  `content` text COMMENT '社团运营内容',
  `apply_id` int(50) DEFAULT NULL,
  `type` enum('未审核','审核未审批','审核已审批','审核不通过') NOT NULL DEFAULT '未审核' COMMENT '社团注册的状态',
  `top_ten` tinyint(4) NOT NULL COMMENT '0-否，1-是',
  `status` tinyint(4) DEFAULT NULL COMMENT '0-已删除，1-未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='社团注册，社团的简介';

-- ----------------------------
-- Records of t_community
-- ----------------------------
INSERT INTO `t_community` VALUES ('30', '篮球社', '篮球社头头', '2014012111', '11-0', '<p>篮球社是个好社团<img src=\"http://img.baidu.com/hi/jx2/j_0001.gif\"/></p>', '7', '审核已审批', '0', '1');
INSERT INTO `t_community` VALUES ('31', '羽毛球社', '羽毛球社头头', '2014012112', '112', '羽毛球社是个好地方', '8', '审核已审批', '0', '1');
INSERT INTO `t_community` VALUES ('32', '大啊大大', '大师', '但是', '大', null, '7', '未审核', '0', '0');
INSERT INTO `t_community` VALUES ('33', '晓阳社', '吴晓阳', '2015011011', '110110110110', '哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈\r\n                                        \r\n                                    ', '9', '审核已审批', '0', '1');
INSERT INTO `t_community` VALUES ('35', '方鑫社', '金方鑫', '2014012123', '110', '<p>1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争取筹办。该活动不只是能够很好的推广文学存在的价值，也能唤起人们对文学文化遗产的关注和重视，吸引更多人支持和热爱文学、发展更多坚持搞文学工作的学子。同时也为文联筹备充足的活动经费和筹办社团拉得赞助商家，又能促成各社团间密切交流与合作，带动各校文学社互动与提升各校文学社的工作能力等。</p><p>2、定时举办文学交流会和各项文学活动，召开干部层会议，定时在不定点校园举行文学活动和文学高峰会，并用先进的科学管理我们，让我们成为一个合格的文学社管理工作者。</p><p>3、定期出版文学社联合会大学生原创文集，集中我们的力量和经验办我们最优秀的学生原创文集。</p><p>4、开展文学交谊活动，促进文学爱好者交流，让每一个文学工作者能够走得更密切。</p><p>5、深入研讨文学工作，辅助各学院发展人文教育，展示广州文明城市之人文特色。</p><p>6、稳扎稳走，起步快发展稳健，广纳各校文学社，包括中学，高中，中专，大专，本科。使最终营造各象牙塔深淳沉稳、自由平等、百家争鸣的校园环境和文学氛围。</p><p>7、把文学社团联合会推向大学生成功创业项目，成为维护学生知识产权和成就学生知识产品等。</p><p>8、扩大我们的顾问团，发展知名度高、有责任心的顾问团，并将以顾问团引导和监督我们的工作，要求我们做到符合实际，符合党和国家的要求。</p><p><br/></p>', '17', '审核已审批', '0', '1');
INSERT INTO `t_community` VALUES ('36', '高老师社团', '高老师', '22222', '12312312', '<p>德固赛u的hash客户看几点回家看撒<br/></p>', '18', '审核已审批', '0', '1');

-- ----------------------------
-- Table structure for `t_community_admin`
-- ----------------------------
DROP TABLE IF EXISTS `t_community_admin`;
CREATE TABLE `t_community_admin` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `community_id` int(50) NOT NULL COMMENT '社团id，0-社联管理员，其他-社团管理员',
  `account_id` int(50) NOT NULL COMMENT '账号id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='社团-账户链接表';

-- ----------------------------
-- Records of t_community_admin
-- ----------------------------
INSERT INTO `t_community_admin` VALUES ('1', '30', '7');
INSERT INTO `t_community_admin` VALUES ('2', '31', '8');
INSERT INTO `t_community_admin` VALUES ('8', '33', '9');
INSERT INTO `t_community_admin` VALUES ('9', '35', '17');
INSERT INTO `t_community_admin` VALUES ('10', '36', '18');

-- ----------------------------
-- Table structure for `t_community_book`
-- ----------------------------
DROP TABLE IF EXISTS `t_community_book`;
CREATE TABLE `t_community_book` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `path` varchar(50) DEFAULT NULL COMMENT '社团宝典的路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='社团宝典（社联管理员添加）';

-- ----------------------------
-- Records of t_community_book
-- ----------------------------
INSERT INTO `t_community_book` VALUES ('4', '20161008233044061277.pdf');

-- ----------------------------
-- Table structure for `t_community_corporator`
-- ----------------------------
DROP TABLE IF EXISTS `t_community_corporator`;
CREATE TABLE `t_community_corporator` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `community_id` int(50) NOT NULL COMMENT '社团Id',
  `account_id` int(50) NOT NULL COMMENT '账号Id',
  `type` enum('未审核','审核通过','审核不通过') NOT NULL DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_community_corporator
-- ----------------------------
INSERT INTO `t_community_corporator` VALUES ('1', '30', '9', '审核通过');
INSERT INTO `t_community_corporator` VALUES ('2', '33', '13', '未审核');
INSERT INTO `t_community_corporator` VALUES ('3', '35', '17', '审核通过');

-- ----------------------------
-- Table structure for `t_community_presence`
-- ----------------------------
DROP TABLE IF EXISTS `t_community_presence`;
CREATE TABLE `t_community_presence` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(50) NOT NULL COMMENT '社团风采的标题',
  `author` varchar(10) DEFAULT NULL COMMENT '作者',
  `time` varchar(20) NOT NULL COMMENT '时间',
  `content` text NOT NULL COMMENT '内容',
  `article_type` enum('社团风采','社团动态') DEFAULT NULL,
  `community_id` int(50) DEFAULT NULL COMMENT '社团的id',
  `type` enum('未审核','审核通过','审核不通过') NOT NULL DEFAULT '未审核' COMMENT '审核状态0-未审核1-审核通过2-审核不通过',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='社团风采，社团动态';

-- ----------------------------
-- Records of t_community_presence
-- ----------------------------
INSERT INTO `t_community_presence` VALUES ('10', '社团风采', '羽毛球', '2016-09-11 15:00', '\r\n                                        社团风采<br>\r\n                                    ', '社团风采', '31', '审核通过');
INSERT INTO `t_community_presence` VALUES ('22', '迎新杯成功举办', '篮球社管理员', '2016-09-13 19:50', '<p>t<span style=\"color:#000000;font-family:宋体\">9月12日晚上，</span><span style=\"color:#000000;font-family:宋体\"></span></p>', '社团动态', '30', '审核通过');
INSERT INTO `t_community_presence` VALUES ('23', '哈哈哈哈', '哈哈哈哈', '2016-10-07 16:20', '<p style=\"TEXT-INDENT: 2em\"><a class=\"a-tips-Article-QQ\" href=\"http://sports.qq.com/d/f_players/6/5840\" target=\"_blank\">兰德</a>尔与莫兹戈</p><p><br/></p>', '社团动态', '30', '审核通过');
INSERT INTO `t_community_presence` VALUES ('24', '哈哈哈哈', '金方鑫', '2016-10-07 23:50', '<p>1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争</p>', '社团风采', '35', '审核通过');

-- ----------------------------
-- Table structure for `t_community_show`
-- ----------------------------
DROP TABLE IF EXISTS `t_community_show`;
CREATE TABLE `t_community_show` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `campus` varchar(50) DEFAULT NULL COMMENT '校区',
  `grade` varchar(5) DEFAULT NULL COMMENT '等级',
  `community_type` varchar(20) DEFAULT NULL COMMENT '社团类型',
  `logo` varchar(50) DEFAULT NULL COMMENT '社团logo',
  `community_id` int(50) DEFAULT NULL COMMENT '社团id',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='社团展示';

-- ----------------------------
-- Records of t_community_show
-- ----------------------------
INSERT INTO `t_community_show` VALUES ('21', '净月', 'A', '公益服务', '20161003001456308605.jpg', '31', '审核通过');
INSERT INTO `t_community_show` VALUES ('23', '本部', 'B', '文娱体育', '20161005162022371507.jpg', '30', '审核通过');
INSERT INTO `t_community_show` VALUES ('24', '本部', 'B', '公益服务', '20160914134719279999.png', '33', '审核通过');
INSERT INTO `t_community_show` VALUES ('25', '净月', 'C', '文娱体育', '20161008234040658345.jpg', '35', '审核通过');
INSERT INTO `t_community_show` VALUES ('26', '净月', 'B', '公益服务', '20161009093528986207.jpg', '36', '审核通过');

-- ----------------------------
-- Table structure for `t_datum_download`
-- ----------------------------
DROP TABLE IF EXISTS `t_datum_download`;
CREATE TABLE `t_datum_download` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL COMMENT '标题',
  `upload_name` varchar(20) DEFAULT NULL COMMENT '上传者姓名',
  `path` varchar(50) DEFAULT NULL COMMENT '资料上传的路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='资料下载';

-- ----------------------------
-- Records of t_datum_download
-- ----------------------------
INSERT INTO `t_datum_download` VALUES ('4', '社联纳新报名表', '白学学', '20160913191839463015.zip');
INSERT INTO `t_datum_download` VALUES ('5', '哈哈哈哈', '111', '20161009000506369866.zip');

-- ----------------------------
-- Table structure for `t_home_carousel`
-- ----------------------------
DROP TABLE IF EXISTS `t_home_carousel`;
CREATE TABLE `t_home_carousel` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `path` varchar(50) DEFAULT NULL COMMENT '图片的路径',
  `show_type` enum('首页显示','首页不显示') NOT NULL DEFAULT '首页不显示' COMMENT '是否首页显示',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_home_carousel
-- ----------------------------
INSERT INTO `t_home_carousel` VALUES ('2', '首页1', '20161012180647739897.png', '首页显示');

-- ----------------------------
-- Table structure for `t_leagues_introduce`
-- ----------------------------
DROP TABLE IF EXISTS `t_leagues_introduce`;
CREATE TABLE `t_leagues_introduce` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content` text NOT NULL COMMENT '社联概况的内容',
  `show_type` enum('首页不显示','首页显示') DEFAULT NULL,
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='社联概况';

-- ----------------------------
-- Records of t_leagues_introduce
-- ----------------------------
INSERT INTO `t_leagues_introduce` VALUES ('6', '<p>dsadsadsadsadsadsadsadsadsa<img src=\"http://img.baidu.com/hi/jx2/j_0025.gif\"/>的萨达的萨达萨达是</p>', '首页显示', '审核不通过');
INSERT INTO `t_leagues_introduce` VALUES ('7', '<p><span style=\"font-size: 24px;\">1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争取筹办。该活动不只是能够很好的推广文学存在的价值，也能唤起人们对文学文化遗产的关注和重视，吸引更多人支持和热爱文学、发展更多坚持搞文学工作的学子。同时也为文联筹备充足的活动经费和筹办社团拉得赞助商家，又能促成各社团间密切交流与合作，带动各校文学社互动与提升各校文学社的工作能力等。</span></p><p><span style=\"font-size: 24px;\">2、定时举办文学交流会和各项文学活动，召开干部层会议，定时在不定点校园举行文学活动和文学高峰会，并用先进的科学管理我们，让我们成为一个合格的文学社管理工作者。</span></p><p><span style=\"font-size: 24px;\">3、定期出版文学社联合会大学生原创文集，集中我们的力量和经验办我们最优秀的学生原创文集。</span></p><p><span style=\"font-size: 24px;\">4、开展文学交谊活动，促进文学爱好者交流，让每一个文学工作者能够走得更密切。</span></p><p><span style=\"font-size: 24px;\">5、深入研讨文学工作，辅助各学院发展人文教育，展示广州文明城市之人文特色。</span></p><p><span style=\"font-size: 24px;\">6、稳扎稳走，起步快发展稳健，广纳各校文学社，包括中学，高中，中专，大专，本科。使最终营造各象牙塔深淳沉稳、自由平等、百家争鸣的校园环境和文学氛围。</span></p><p><span style=\"font-size: 24px;\">7、把文学社团联合会推向大学生成功创业项目，成为维护学生知识产权和成就学生知识产品等。</span></p><p><span style=\"font-size: 24px;\">8、扩大我们的顾问团，发展知名度高、有责任心的顾问团，并将以顾问团引导和监督我们的工作，要求我们做到符合实际，符合党和国家的要求。</span></p><p></p><p></p>', '首页显示', '审核通过');

-- ----------------------------
-- Table structure for `t_place`
-- ----------------------------
DROP TABLE IF EXISTS `t_place`;
CREATE TABLE `t_place` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `location` varchar(50) NOT NULL COMMENT '申请地点',
  `campus` enum('本部','净月') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_place
-- ----------------------------
INSERT INTO `t_place` VALUES ('3', '校史馆', '本部');
INSERT INTO `t_place` VALUES ('4', '图书馆', '本部');
INSERT INTO `t_place` VALUES ('5', '阶梯教室309', '净月');
INSERT INTO `t_place` VALUES ('6', '阶梯教室230', '净月');

-- ----------------------------
-- Table structure for `t_place_apply`
-- ----------------------------
DROP TABLE IF EXISTS `t_place_apply`;
CREATE TABLE `t_place_apply` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `campus` varchar(20) NOT NULL COMMENT '校区',
  `day_time` varchar(20) NOT NULL COMMENT '日期（天）',
  `start_time` varchar(20) DEFAULT NULL,
  `end_time` varchar(20) DEFAULT NULL,
  `place` varchar(20) NOT NULL COMMENT '地点',
  `account_id` int(20) NOT NULL COMMENT '申请人的id',
  `uses` varchar(20) DEFAULT NULL COMMENT '用途',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='场地审核';

-- ----------------------------
-- Records of t_place_apply
-- ----------------------------
INSERT INTO `t_place_apply` VALUES ('8', '本部', '2016-09-30', '19:00', '21:00', '校史馆', '13', 'DSADSA', '审核通过');
INSERT INTO `t_place_apply` VALUES ('9', '净月', '2016-10-29', '11:00', '18:00', '阶梯教室309', '13', '学生会', '审核通过');
INSERT INTO `t_place_apply` VALUES ('10', '本部', '2016-10-19', '18:00', '19:00', '校史馆', '18', 'dsgsdf', '审核通过');

-- ----------------------------
-- Table structure for `t_resource_share`
-- ----------------------------
DROP TABLE IF EXISTS `t_resource_share`;
CREATE TABLE `t_resource_share` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL COMMENT '标题',
  `community_name` varchar(50) NOT NULL COMMENT '社团的名称',
  `content` text COMMENT '共享内容',
  `community_id` int(50) DEFAULT NULL COMMENT '社团Id',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='物资共享';

-- ----------------------------
-- Records of t_resource_share
-- ----------------------------
INSERT INTO `t_resource_share` VALUES ('3', '羽毛球物资共享', '羽毛球协会', '共享羽毛球<br>', '31', '审核通过');
INSERT INTO `t_resource_share` VALUES ('4', 'lanqiu大苏打实打实大苏打', '沉淀法dsf', '\r\n                                        \r\n                                        大飒飒大苏打fdsfsf', '30', '审核通过');
INSERT INTO `t_resource_share` VALUES ('5', '5', '5', '<p><img src=\"http://img.baidu.com/hi/jx2/j_0013.gif\"/>5<br/></p>', '30', '未审核');
INSERT INTO `t_resource_share` VALUES ('6', '哈哈哈哈', '金方鑫社', '<p>1、广州校园文学社团联合会每年举办两次全广州市性的大活动，承办社团不定，各社团通过申报形式争取筹办。该活动不只是能够很好的推广文学存在的价值，也能唤起人们对文学文化遗产的关注和重视，吸引更多人支持和热爱文学、发展更多坚持搞文学工作的学子。同时也为文联筹备充足的活动经费和筹办社团拉得赞助商家，又能促成各社团间密切交流与合作，带动各校文学社互动与提升各校文学社的工作能力等。</p><p>2、定时举办文学交流会和各项文学活动，召开干部层会议，定时在不定点校园举行文学活动和文学高峰会，并用先进的科学管理我们，让我们成为一个合格的文学社管理工作者。</p><p>3、定期出版文学社联合会大学生原创文集，集中我们的力量和经验办我们最优秀的学生原创文集。</p><p>4、开展文学交谊活动，促进文学爱好者交流，让每一个文学工作者能够走得更密切。</p><p>5、深入研讨文学工作，辅助各学院发展人文教育，展示广州文明城市之人文特色。</p><p>6、稳扎稳走，起步快发展稳健，广纳各校文学社，包括中学，高中，中专，大专，本科。使最终营造各象牙塔深淳沉稳、自由平等、百家争鸣的校园环境和文学氛围。</p><p>7、把文学社团联合会推向大学生成功创业项目，成为维护学生知识产权和成就学生知识产品等。</p><p>8、扩大我们的顾问团，发展知名度高、有责任心的顾问团，并将以顾问团引导和监督我们的工作，要求我们做到符合实际，符合党和国家的要求。</p><p><br/></p>', '35', '未审核');

-- ----------------------------
-- Table structure for `t_social_programs`
-- ----------------------------
DROP TABLE IF EXISTS `t_social_programs`;
CREATE TABLE `t_social_programs` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '项目名称',
  `holder` varchar(20) DEFAULT NULL COMMENT '发起单位',
  `activity_time` varchar(20) DEFAULT NULL COMMENT '活动时间',
  `activity_content` text COMMENT '活动内容',
  `support_content` text COMMENT '赞助内容',
  `type` enum('未审核','审核通过','审核不通过') DEFAULT '未审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='社会项目';

-- ----------------------------
-- Records of t_social_programs
-- ----------------------------
INSERT INTO `t_social_programs` VALUES ('2', '项目1', '人物1', '2016-09-13 17:00', '<p>UK<br/></p>', '<p>UKUKUKKU<br/></p>', '审核通过');
INSERT INTO `t_social_programs` VALUES ('6', '7U', '7U', '2016-12-13 15:05', null, '<p><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p>', '审核通过');
INSERT INTO `t_social_programs` VALUES ('7', 'y', 'ji', '2016-09-13 15:05', '<p><img src=\"http://img.baidu.com/hi/jx2/j_0023.gif\"/></p>', '<p><img src=\"http://img.baidu.com/hi/jx2/j_0002.gif\"/></p>', '审核通过');
INSERT INTO `t_social_programs` VALUES ('8', '4', '4', '2016-09-13 17:00', '', '', '审核通过');
