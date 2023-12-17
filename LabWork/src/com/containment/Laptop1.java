package com.containment;

public class Laptop1 {
	
	private int lId;
	private String lName;
	private Printer1 printer1;
	
	Laptop1(){
		
	}
	
	Laptop1(int lId, String lName, Printer1 printer1){
		this.lId=lId;
		this.lName=lName;
		this.printer1=printer1;
	}

	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	public Printer1 getPrinter1() {
		return printer1;
	}
	public void setPrinter1(Printer1 printer1) {
		this.printer1 = printer1;
	}

	@Override
	public String toString() {
		return "Laptop Details\nId=" + lId + ",\nName=" + lName + printer1;
	}
	
}
