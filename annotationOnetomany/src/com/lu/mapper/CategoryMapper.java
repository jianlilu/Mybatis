package com.lu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lu.pojo.Category;

public interface CategoryMapper {
    @Select(" select * from category_ ")
    @Results({  
                @Result(property = "id", column = "id"),
                @Result(property = "products", javaType = List.class, 
                column = "id", 
                many = @Many(select = "com.lu.mapper.ProductMapper.listByCategory") ) 
            })
    public List<Category> list();
 
}