package com.lu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lu.pojo.Product;

public interface ProductMapper {
    
    @Select("select * from product_ where id = #{id}")
    public Product get(int id);
}