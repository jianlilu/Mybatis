package com.lu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.lu.pojo.Category;

public interface CategoryMapper {
    @Select(" select * from category_ where id = #{id}")
    public Category get(int id);
     
}