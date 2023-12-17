package com.polymorphism;

public class TypePromotionAmbiguity {

	static void add(int n1, double n2) {
		System.out.println("In Method 1");
		System.out.println(n1+n2);
	}
	
	static void add(long n1, float n2) {
		System.out.println("In Method 2");
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		
		//add(9, 7.8f);

		// 9 int : asking  7.8 to convert to duoble
		// 7.8 float asking 9 to convert to long
	}

}
