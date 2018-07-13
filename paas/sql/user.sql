CREATE DATABASE db_paas;

CREATE table `tb_user`(
 `id` BIGINT NOT NULL AUTO_INCREMENT,
 `user_name` varchar(20) DEFAULT null,
 `phone` varchar(20) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8