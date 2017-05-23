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
import com.lu.pojo.Product;






/* 多条件查询 */
public class TestMybatis {
	  
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
  
//        //查询ID>1 且 字符串里包含‘cat’的name
//        Map<String,Object> params = new HashMap<String,Object>();
//        params.put("id", 1);
//        params.put("name", "cat");
//         
//        List<Category> cs = session.selectList("listCategoryByIdAndName",params);
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
        
//        因为是多个参数，而selectList方法又只接受一个参数对象，所以需要把多个参数放在Map里，
//        然后把这个Map对象作为参数传递进去
        //查询ID>1 且 字符串里包含‘pro’的name
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("id", 1);
        params.put("name", "pro");
        
        List<Product> products = session.selectList("listProductByIdAndName",params);
        for (Product p : products) {
        	System.out.print(p.getId() + " - ");
        	System.out.print(p.getName() + " - ");
        	System.out.println(p.getPrice() + " - ");
        }
 
        session.commit();
        session.close();
  
    }
}



/* 模糊查询 
public class TestMybatis {
	  
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
  
////      查询字符串中包含‘cat’的name
//        List<Category> cs = session.selectList("listCategoryByName","cat");
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
        
//      查询字符串中包含‘pro’的name 或 包含‘h’的 name
        List<Product> products = session.selectList("listProductByName","pro");
        for (Product p : products) {
        	System.out.print(p.getId() + " - ");
        	System.out.print(p.getName() + " - ");
        	System.out.println(p.getPrice());
        }
 
        session.commit();
        session.close();
  
    }
}

*/



