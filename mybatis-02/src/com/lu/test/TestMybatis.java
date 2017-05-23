package com.lu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lu.pojo.Category;
import com.lu.pojo.Product;


/* 查询所有 */
public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
        listAll(session);
         
        session.commit();
        session.close();
 
    }
 
//    private static void listAll(SqlSession session) {
//        List<Category> cs = session.selectList("listCategory");
//        for (Category c : cs) {
//            System.out.println(c.getName());
//        }
//    }
    
    
    private static void listAll(SqlSession session) {
        List<Product> products = session.selectList("listProduct");
        for (Product p : products) {
            System.out.print(p.getId() + " - ");
            System.out.print(p.getName() + " - ");
            System.out.println(p.getPrice());
        }
    }

}



/* 修改 
public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
//        Category c= session.selectOne("getCategory",2);
//        c.setName("修改了的Category名稱");
//        session.update("updateCategory",c);
         
        Product p= session.selectOne("getProduct",2);
        p.setName("new product");
        session.update("updateProduct",p);
        
        listAll(session);
         
        session.commit();
        session.close();
 
    }
 
    private static void listAll(SqlSession session) {
        List<Product> products = session.selectList("listProduct");
        for (Product p : products) {
            System.out.print(p.getId() + " - ");
            System.out.print(p.getName() + " - ");
            System.out.println(p.getPrice());
        }
    }
}
*/


/* 查询 
public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
// 通过session.selectOne获取id=2的记录
        Product p= session.selectOne("getProduct",2);
         
        System.out.print(p.getId() + " - ");
        System.out.print(p.getName() + " - ");
        System.out.println(p.getPrice());
         
//      listAll(session);
         
        session.commit();
        session.close();
 
    }
}
*/



/* 增加 
public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        
//        通过session.insert调用addCategory对应的SQL语句
//        Category c = new Category();
//        c.setName("新增加的Category");
//        session.insert("addCategory",c);
        
        Product p = new Product();
        p.setName("i am new product");
        p.setPrice(200);
        session.insert("addProduct", p);
         
        listAll(session);
         
        session.commit();
        session.close();
 
    }
 
//    private static void listAll(SqlSession session) {
//        List<Category> cs = session.selectList("listCategory");
//        for (Category c : cs) {
//        	System.out.print(c.getId() + " : ");
//            System.out.println(c.getName());
//        }
//    }
    private static void listAll(SqlSession session) {
    	List<Product> products = session.selectList("listProduct");
    	for (Product p : products) {
    		System.out.print(p.getId() + " - ");
    		System.out.print(p.getName() + " - ");
    		System.out.println(p.getPrice());
    	}
    }
}
*/



/* 删除  
public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
// 删除id=6的对象
//        Category c = new Category();
//        c.setId(6);
//        session.delete("deleteCategory",c);
        
        Product p = new Product();
        p.setId(5);
        session.delete("delProduct", p);
         
        listAll(session);
         
        session.commit();
        session.close();
 
    }
 
//    private static void listAll(SqlSession session) {
//        List<Category> cs = session.selectList("listCategory");
//        for (Category c : cs) {
//        	System.out.print(c.getId() + " : ");
//            System.out.println(c.getName());
//        }
//    }
    private static void listAll(SqlSession session) {
    	List<Product> products = session.selectList("listProduct");
    	for (Product p : products) {
    		System.out.print(p.getId() + " - ");
    		System.out.print(p.getName() + " - ");
    		System.out.println(p.getPrice());
    	}
    }
}

*/





