package com.containment;

public class Item {
	
	private int iId;
	private String iName;
	private int price;
	
	Item(){
		
	}
	
	Item(int iId, String iName, int price){
		this.iId=iId;
		this.iName=iName;
		this.price=price;
	}

	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item Details\nId=" + iId + ",\nName=" + iName + ",\nPrice=" + price;
	}

}
