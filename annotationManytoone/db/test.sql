
/////////////////////////////////////////////////////////////////
////                   category_                           /////
////////////////////////////////////////////////////////////////

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


/////////////////////////////////////////////////////////////////
////                   product_                             /////
////////////////////////////////////////////////////////////////

CREATE TABLE product_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(32) DEFAULT NULL,
  price int(11) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO product_ VALUES (null,'product01',56);
INSERT INTO product_ VALUES (null,'product02',76);

select * from product_;


/////////////////////////////////////////////////////////////////
////             order_             order_item_             /////
////////////////////////////////////////////////////////////////
create table order_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  code varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
 
create table order_item_(
  id int(11) NOT NULL AUTO_INCREMENT,  
  oid int , 
  pid int ,
  number int ,
  PRIMARY KEY(id)
)AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO order_ VALUES (1,'code000A');
INSERT INTO order_ VALUES (2,'code000B');
 
INSERT INTO order_item_ VALUES (null, 1, 1, 100);
INSERT INTO order_item_ VALUES (null, 1, 2, 100);
INSERT INTO order_item_ VALUES (null, 1, 3, 100);
INSERT INTO order_item_ VALUES (null, 2, 2, 100);
INSERT INTO order_item_ VALUES (null, 2, 3, 100);
INSERT INTO order_item_ VALUES (null, 2, 4, 100);




