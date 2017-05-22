package com.lu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lu.pojo.Category;
import com.lu.pojo.Student;

public class TestMybatis {
	 
    public static void main(String[] args) throws IOException {
    	
    	//根据配置文件mybatis-config.xml得到sqlSessionFactory 。
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
        //然后再根据sqlSessionFactory 得到session
        SqlSession session=sqlSessionFactory.openSession();
         
        /*
         * 最后通过session的selectList方法，调用sql语句listCategory。listCategory这个
         * 就是在配置文件Category.xml中那条sql语句设置的id。
                              执行完毕之后，得到一个Category集合，遍历即可看到数据。
        */
        List<Category> cs=session.selectList("listCategory");
        for (Category c : cs) {
        	System.out.print(c.getId() + " : ");
            System.out.println(c.getName());
        }
        
        System.out.println("////////////////////////////////");
        
        List<Student> students = session.selectList("listStu");
        for (Student stu : students) {
        	System.out.print(stu.getId() + " : ");
        	System.out.println(stu.getName());
        }
         
    }
}