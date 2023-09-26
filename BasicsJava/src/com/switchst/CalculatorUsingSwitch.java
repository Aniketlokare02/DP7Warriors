package com.switchst;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		char ch1;
		do {
			System.out.print("Enter First Number:");
			int num1 = ip.nextInt();
			System.out.print("Enter Second Number:");
			int num2 = ip.nextInt();
			System.out.print("1.+\n2.-\n3.*\n4./\n5.%\nEnter Operator Want To Perform Task:");
			char c = ip.next().charAt(0);
			switch (c) {
			case '+':
				System.out.println("Addition:" + (num1 + num2));
				break;
			case '-':
				System.out.println("Substraction:" + (num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication:" + (num1 * num2));
				break;
			case '/':
				System.out.println("Division:" + (num1 / num2));
				break;
			case '%':
				System.out.println("Modulus:"+(num1%num2));
				break;
			default:
				System.out.println("Enter valid Operator.");
			}
			System.out.println("Do You Want To Continue... Press Y Or N..");
			ch1 = ip.next().charAt(0);
		} while (ch1 != 'N');
		
	}

}
