package com.containment;

public class Book {
	
	private int bId;
	private String bName;
	private Author author;
	
	Book(){
		
	}
	
	Book(int bId, String bName, Author author){
		this.bId=bId;
		this.bName=bName;
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

	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book Details \nId=" + bId + ", Name=" + bName + "\n" + author;
	}

}
