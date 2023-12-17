package com.loopslogical;

public class ExtractDigitsFromNumber {
	
	static void extractDigit(int num) {
		System.out.println("The Digit of Number:"+num);
		while(num!=0) {
			System.out.println(num%10);
			num/=10;
		}
	}

	public static void main(String[] args) {
		
		extractDigit(5678);

	}

}
