package com.lu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lu.pojo.Product;

public interface ProductMapper {
	  
    @Select(" select * from product_ where cid = #{cid}")
    public List<Product> listByCategory(int cid);
     
}
