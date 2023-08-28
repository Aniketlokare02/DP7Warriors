package com.ifesle;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=ip.nextInt();
		
		System.out.println("Enter the second number");
		int num2=ip.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num2+" is greater");
		}

	}

}
