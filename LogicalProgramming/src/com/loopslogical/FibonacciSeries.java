package com.loopslogical;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num1 = ip.nextInt();
		int num2 = ip.nextInt();
		int sum = 0;
		while (num2 <= 100) {
			System.out.println(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}

}
