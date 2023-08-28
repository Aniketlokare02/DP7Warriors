package com.assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1=ip.nextDouble();
		
		System.out.println("Enter symbol of operation want perform");
		char c=ip.next().charAt(0);
		
		System.out.println("Enter the second number");
		double num2=ip.nextDouble();
		
		if(c=='+') {
			System.out.println(num1+num2);
		}
		else if(c=='-') {
			System.out.println(num1-num2);
		}
		else if(c=='*') {
			System.out.println(num1*num2);
		}
		else if(c=='/') {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Invalid Operator");
		}

	}

}
