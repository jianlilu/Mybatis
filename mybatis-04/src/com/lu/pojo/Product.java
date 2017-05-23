package com.lu.pojo;

public class Product {
	
	private int id;
	private String name;
	private int price;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
