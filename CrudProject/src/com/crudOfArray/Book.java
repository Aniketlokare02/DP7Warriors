package com.crudOfArray;

public class Book {
	
	private int b_id;
	private String b_name;
	private int price;
	private String author_name;
	
	public Book(int b_id, String b_name, int price, String author_name) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.price = price;
		this.author_name = author_name;
	}
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", price=" + price + ", author_name=" + author_name + "]";
	}

}
