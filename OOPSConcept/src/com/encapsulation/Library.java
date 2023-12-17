package com.encapsulation;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		Book b=new Book();
		
		b.setBookId(101);
		b.setBname("ShivCharitra");
		b.setPrice(1000);
		
		System.out.println("Book Id:"+b.getBookId()+" Book Name:"+b.getBname()+" Book Price:"+b.getPrice());
		System.out.println(b);
		
		System.out.println("Enter Book Id:");
		b.setBookId(ip.nextInt());

		System.out.println("Enter The Book Name:");
		b.setBname(ip.next());
		
		System.out.println("Enter The Book Price:");
		b.setPrice(ip.nextFloat());
		System.out.println(b);
	}


	
}
