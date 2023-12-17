package com.containment;

public class Printer {
	
	private int pId;
	private String pName;
	private float price;
	
	Printer(){
		
	}
	
	Printer(int pId, String pName, float price){
		this.pId=pId;
		this.pName=pName;
		this.price=price;
	}

	@Override
	public String toString() {
		return "\nPrinter Details\nId=" + pId + ",\nName=" + pName + ",\nprice=" + price;
	}

}
