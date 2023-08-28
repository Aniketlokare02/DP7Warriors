package com.ifesle;

public class ShortHand {

	public static void main(String[] args) {
		byte b1=70;
		byte b2=50;
		
		b1=(byte) (b1+b2);
		System.out.println(b1);
		
		byte num1=50;
		byte num2=40;
		//num1=num1+num2;
		
		num1+=num2; // removes type casting
		System.out.println(num1);
		
		short s1=10;
		short s2=20;
		
		//s1=s1* s2;
		

	}

}
