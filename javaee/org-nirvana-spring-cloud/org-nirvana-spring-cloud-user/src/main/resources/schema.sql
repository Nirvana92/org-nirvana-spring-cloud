drop TABLE IF EXISTS tb_user;

CREATE TABLE `springcloud`.`tb_user` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nickname` varchar(255),
	`age` int(10),
	`balance` decimal(10,2),
	`created` datetime,
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` COMMENT='';