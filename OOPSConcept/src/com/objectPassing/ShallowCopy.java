package com.objectPassing;

import java.util.Scanner;

import com.encapsulation.Book;

public class ShallowCopy {

static Scanner ip=new Scanner(System.in);
	
	static void insertObject(Book b) {
		System.out.println("Enter Book Id:");
		b.setBookId(ip.nextInt());

		System.out.println("Enter The Book Name:");
		b.setBname(ip.next());
		
		System.out.println("Enter The Book Price:");
		b.setPrice(ip.nextFloat());
	}

	public static void main(String[] args) {
		
		Book b1=new Book();
		insertObject(b1);
		
		Book b2=b1;  // Shallow Copy
		System.out.println(b1);
		System.out.println("---------------------");
		System.out.println(b2);
		
		b2.setPrice(3000);
		System.out.println("----------------------");
		System.out.println(b1);
		System.out.println(b2);
	}
}
