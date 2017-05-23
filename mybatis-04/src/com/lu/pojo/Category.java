package com.lu.pojo;

import java.util.List;

/*     准备实体类Category，用于映射表category_   */

public class Category {

	private int id;
    private String name;
    List<Product> products;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
     
}