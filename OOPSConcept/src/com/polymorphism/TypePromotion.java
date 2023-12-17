package com.polymorphism;

public class TypePromotion {

	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
	
	static void display(long n) {
		System.out.println("In long");
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		display(5);

		// int: long and float : promoted to long 
	}

}
