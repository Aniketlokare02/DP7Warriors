package com.hashMap;

public class Book {
	
	private int bId;
	private String bName;
	private double price;
	private Author author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bId, String bName, double price, Author author) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.price = price;
		this.author=author;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", price=" + price + ", author=" + author + "]";
	}

}
