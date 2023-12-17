package com.containment;

public class Details1 {
	
	static void getLaptop(Laptop1 l) {
		if(l.getPrinter1().getPrice()>12000) {
			System.out.println(l.getlName());
		}
	}

	public static void main(String[] args) {
		
		Laptop1 l1=new Laptop1();
		l1.setlId(101);
		l1.setlName("Lenovo");
		l1.setPrinter1(new Printer1());
		l1.getPrinter1().setpId(201);
		l1.getPrinter1().setpName("Epson");
		l1.getPrinter1().setPrice(15000f);
		System.out.println(l1);
		
		System.out.println("-----------");
		
		Laptop1 l2=new Laptop1();
		l2.setlId(102);
		l2.setlName("Apple");
		l2.setPrinter1(new Printer1());
		l2.getPrinter1().setpId(202);
		l2.getPrinter1().setpName("HP");
		l2.getPrinter1().setPrice(12000f);
		System.out.println(l2);
		
		System.out.println("-----------");
		System.out.println(l1.getlId());
		System.out.println(l1.getlName());
		System.out.println(l1.getPrinter1().getpId());
		System.out.println(l1.getPrinter1().getpName());
		System.out.println(l1.getPrinter1().getPrice());
		
		System.out.println("--------");
		getLaptop(l1);
		getLaptop(l2);

	}

}
