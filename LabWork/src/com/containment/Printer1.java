package com.containment;

public class Printer1 {

	private int pId;
	private String pName;
	private float price;
	
	Printer1(){
		
	}
	
	Printer1(int pId, String pName, float price){
		this.pId=pId;
		this.pName=pName;
		this.price=price;
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nPrinter Deatils Id=" + pId + ",\nName=" + pName + ",\nPrice=" + price;
	}
}
