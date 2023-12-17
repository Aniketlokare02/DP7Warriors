package com.containment;

public class Laptop {
	
	private int id;
	private String bName;
	private Printer printer;

	Laptop(){
		
	}
	
	Laptop(int id, String bName, Printer printer){
		this.id=id;
		this.bName=bName;
		this.printer=printer;
	}

	@Override
	public String toString() {
		return "Laptop Details \nId=" + id + ",\nName=" + bName + printer;
	}
	
}
