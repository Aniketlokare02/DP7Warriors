package com.labwork;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=ip.next();
		System.out.println("Enter age:");
		int age=ip.nextInt();
		System.out.println("Enetr hieght:");
		double height=ip.nextDouble();
		System.out.println("Enter the gender:");
		char gender=ip.next().charAt(0);
		
		System.out.println("Name of Person:"+name);
		System.out.println("Person age is:"+age);
		System.out.println("Person height is:"+height);
		System.out.println("Person gender is:"+gender);

	}

}
