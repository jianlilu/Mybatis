

// �������ݿ�
create database how2java;



// ������
USE how2java;
 
CREATE TABLE category_ (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;



// ��������
USE how2java;
INSERT INTO category_ VALUES (null,'category1');
INSERT INTO category_ VALUES (null,'category2');


/////////////////////////////////////////////////////////////////
////                                                        /////
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

