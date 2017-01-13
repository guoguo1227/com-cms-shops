ALTER table  shop add  type  int(2)  DEFAULT '1' COMMENT '类型 1-普通 2-热铺 3-旺铺';
ALTER table  shop add road varchar(100) NOT NULL COMMENT '道路缩写';

ALTER table  advert add priority int(10) DEFAULT '1' COMMENT '优先级';

ALTER table  hotcategory add priority int(10) DEFAULT '1' COMMENT '优先级';
ALTER table  hotcategory add priority2 int(10) DEFAULT '1' COMMENT '优先级2';

CREATE TABLE `keyword` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `word` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT '0' COMMENT '次数',
  `createTime` datetime NOT NULL,
  `updateTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=240 DEFAULT CHARSET=utf8 COMMENT='搜索词表';

CREATE TABLE `investment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `type` varchar(100) NOT NULL COMMENT '类型',
  `description` varchar(3000) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=443 DEFAULT CHARSET=utf8 COMMENT='招商热线';

CREATE TABLE `shoppv` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(6) DEFAULT NULL COMMENT '类型',
  `relate_id` int(11) DEFAULT NULL COMMENT '关联id',
  `relate_type` int(6) DEFAULT NULL COMMENT '关联类型',
  `create_Date` datetime DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

CREATE TABLE `aboutme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(6) DEFAULT NULL COMMENT '类型',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `title` varchar(100) NOT NULL COMMENT '标题',
  `description` varchar(3000) DEFAULT NULL COMMENT '描述',
  `picture` varchar(100) DEFAULT NULL COMMENT '图片',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

