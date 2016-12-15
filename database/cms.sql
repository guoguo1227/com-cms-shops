ALTER table  shop add  type  int(2)  DEFAULT '1' COMMENT '类型 1-普通 2-热铺 3-旺铺';

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
