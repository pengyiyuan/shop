CREATE DATABASE IF NOT EXISTS `shop`;

USE `shop`;

####商品表####
CREATE TABLE IF NOT EXISTS `goods` (
  `goods_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goods_desc` varchar(100) DEFAULT NULL COMMENT '商品简介',
  `goods_text` varchar(300) DEFAULT NULL COMMENT '商品长介绍',
  `goods_icon` varchar(250) DEFAULT NULL COMMENT '商品缩略图',
  `goods_image` varchar(250) DEFAULT NULL COMMENT '商品大图',
  `goods_price` varchar(50) NOT NULL COMMENT '商品价格',
  `goods_num` bigint(20) NOT NULL COMMENT '商品数量',
  `fist_category` smallint COMMENT '一级分类',
  `second_category` smallint COMMENT '二级分类',
  `goods_type` int COMMENT '商品类型',
  `activity_id` bigint(20) COMMENT '活动id',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';