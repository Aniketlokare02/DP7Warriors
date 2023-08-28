package com.assignment;

import java.util.Scanner;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter the first number:");
		int num1 = ip.nextInt();

		System.out.print("Enter the second number:");
		int num2 = ip.nextInt();

		System.out.print("Enter the third number:");
		int num3 = ip.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greater");
		} else if (num2 > num3) {
			System.out.println(num2 + " is greater");
		} else {
			System.out.println(num3 + " is greater");
		}

	}

}
