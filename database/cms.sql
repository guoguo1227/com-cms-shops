ALTER table  shop add  type  int(2)  DEFAULT '1' COMMENT '类型 1-普通 2-热铺 3-旺铺';

CREATE TABLE `keyword` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `word` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT '0' COMMENT '次数',
  `createTime` datetime NOT NULL,
  `updateTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=240 DEFAULT CHARSET=utf8 COMMENT='搜索词表';

