package com.switchst;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int num1=ip.nextInt();
		System.out.print("Enter Second Number:");
		int num2=ip.nextInt();
		System.out.print("Enter Operator Want To Perform Task:");
		char c=ip.next().charAt(0);
		
		switch (c) {
		case '+' : System.out.println("Addition:"+(num1+num2));
		break;
		case '-' : System.out.println("Substraction:"+(num1-num2));
		break;
		case '*' : System.out.println("Multiplication:"+(num1*num2));
		break;
		case '/' : System.out.println("Division:"+(num1/num2));
		break;
		default  : System.out.println("Enter valid Operator.");
		}

	}

}
