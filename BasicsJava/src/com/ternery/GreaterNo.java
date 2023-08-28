package com.ternery;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter first no:");
		int num1 = ip.nextInt();
		System.out.print("Enter second no:");
		int num2 = ip.nextInt();

		int max;
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);

	}

}
