package com.containment;

public class ShowSupplierItem {

	static void getOfSameItem(Supplier s) {
		
	}
	
	public static void main(String[] args) {
		
		Item i1=new Item(101, "KurKure", 10);
		Item i2=new Item(102, "Soap", 80);
		Item i3=new Item(103, "BornVita", 80);
		Item i4=new Item(104, "GeminiOil", 100);
		
		Supplier s1=new Supplier(201, "Aniket", i2);
		Supplier s2=new Supplier(202, "Hrishikesh", i3);
		Supplier s3=new Supplier(203, "Suraj", i1);
		Supplier s4=new Supplier(204, "Pralay", i4);
		
		

	}

}
