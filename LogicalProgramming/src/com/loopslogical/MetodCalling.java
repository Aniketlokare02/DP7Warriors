package com.loopslogical;

import java.util.Scanner;

public class MetodCalling {
	
	static void factOfNumber(int n) {
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(n+" Factorial is : "+fact);
	}

	public static void main(String[] args) {
		
		factOfNumber(5);
		factOfNumber(7);

	}

}
