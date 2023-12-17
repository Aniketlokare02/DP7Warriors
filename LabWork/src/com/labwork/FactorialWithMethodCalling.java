package com.labwork;

import java.util.Scanner;

public class FactorialWithMethodCalling {
	
	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		System.out.println(num+" Factorial is:"+factorial(num));

	}

}
