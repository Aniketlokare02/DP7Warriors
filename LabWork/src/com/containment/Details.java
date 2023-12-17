package com.containment;

public class Details {

	public static void main(String[] args) {
		
		Printer p1=new Printer(101, "HP", 15000f);
		Printer p2=new Printer(102, "Epson", 20000f);       
		
		Laptop l1=new Laptop(201, "HP", p1);
		Laptop l2=new Laptop(202, "Dell", p2);
		
		System.out.println(l1);
		System.out.println("---------");
		System.out.println(l2);

	}

}
