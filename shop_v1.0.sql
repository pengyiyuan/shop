create database if not exists `shop`;

####商品表####
create table if not exists `goods` desc '商品表'(
	`goods_id` bigint primary key auto_increament desc '主键id',
	`goods_desc` varchar(100) desc '商品简介',
	`goods_text` varchar(300) desc '商品长介绍',
	`goods_icon` varchar(100) desc '商品缩略图',
	`goods_image` varchar(100) desc '商品大图',
	`goods_price` varchar(50) not null desc '商品价格',
	`goods_num` bigint desc not null '商品数量'
	) engine=innodb default charset=utf-8