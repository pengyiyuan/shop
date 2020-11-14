CREATE DATABASE IF NOT EXISTS `shop`;

####商品表####
CREATE TABLE IF NOT EXISTS `goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_desc` varchar(100) DEFAULT NULL COMMENT '商品简介',
  `goods_text` varchar(300) DEFAULT NULL COMMENT '商品长介绍',
  `goods_icon` varchar(100) DEFAULT NULL COMMENT '商品缩略图',
  `goods_image` varchar(100) DEFAULT NULL COMMENT '商品大图',
  `goods_price` varchar(50) NOT NULL COMMENT '商品价格',
  `goods_num` bigint(20) NOT NULL COMMENT '商品数量',
  `fist_category` tinyint COMMENT '一级分类',
  `second_category` tinyint COMMENT '二级分类',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';