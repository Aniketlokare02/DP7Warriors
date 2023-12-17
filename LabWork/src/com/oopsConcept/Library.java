package com.oopsConcept;

class Book{
	
	private int bId;
	private String bName;
	private String aName;
	private String pDate;
	private float price;
	private char category;
	
	Book(int bId, String bName, String aName, String pDate, float price, char category){
		this.bId=bId;
		this.bName=bName;
		this.aName=aName;
		this.pDate=pDate;
		this.price=price;
		this.category=category;
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

	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "bId=" + bId + ", bName=" + bName + ", aName=" + aName + ", pDate=" + pDate + ", price=" + price
				+ ", category=" + category;
	}
	
}
public class Library {
	
	static void discount(Book b) {
		if(b.getCategory()=='S') {
			float price=b.getPrice();
			price=(float) (price-(price*0.1));
			b.setPrice(price);
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		Book b1=new Book(101, "ShivCharitra", "Aniket", "14/02/1845", 2000, 'S');
		Book b2=new Book(102, "Chhava", "Hrishikesh", "14/11/1945", 1500, 'S');
		Book b3=new Book(103, "Mrutyunjay", "Suraj", "20/10/1985", 1000, 'O');
		Book b4=new Book(104, "DharmaVeer", "Pralay", "15/08/2000", 2500, 'S');
		
		System.out.println("----------------------Before---------------------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		System.out.println("----------------------Discount----------------------");
		discount(b1);
		discount(b2);
		discount(b3);
		discount(b4);
		
		System.out.println("----------------------After----------------------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
	

}
