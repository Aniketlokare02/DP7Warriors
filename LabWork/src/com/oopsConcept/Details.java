package com.oopsConcept;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Item Id:");
		int id=ip.nextInt();
		System.out.print("Enter Item Name:");
		String name=ip.next();
		System.out.print("Enter Item Price:");
		float price=ip.nextFloat();
		
		System.out.println("------------------------");
		Item i=new Item();
		i.display(id, name, price);
		

	}

}
