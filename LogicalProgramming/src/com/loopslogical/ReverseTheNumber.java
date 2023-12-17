package com.loopslogical;

public class ReverseTheNumber {
	
	static int reverseTheNumber(int num) {
		int reverse=0;
		while(num!=0) {
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		System.out.println(reverseTheNumber(7895));

	}

}
