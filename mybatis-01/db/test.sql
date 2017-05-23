

// 创建数据库
create database how2java;



// 创建表
USE how2java;
 
CREATE TABLE category_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



// 导入数据
USE how2java;
INSERT INTO category_ VALUES (null,'category1');
INSERT INTO category_ VALUES (null,'category2');