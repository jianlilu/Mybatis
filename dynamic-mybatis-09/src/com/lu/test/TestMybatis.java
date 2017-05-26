package com.lu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lu.pojo.Category;
import com.lu.pojo.Order;
import com.lu.pojo.OrderItem;
import com.lu.pojo.Product;


public class TestMybatis {
	  
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
        Map<String,Object> params = new HashMap<String, Object>(); 
//      params.put("name","a");
//      params.put("price","10");
      List<Product> ps = session.selectList("listProduct",params);
      for (Product p : ps) {
          System.out.println(p);
      }
 
        session.commit();
        session.close();
  
    }
 
    private static void listAll(SqlSession session) {
 
    }
}


