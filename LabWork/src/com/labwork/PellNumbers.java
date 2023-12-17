package com.labwork;

import java.util.Scanner;

public class PellNumbers {

	static void pellNumber(int limit) {
		int sum = 0;
		int a=1;
		int b=0;
		for(int i=1;i<=limit;i++) {
			if (b == 0) {
				System.out.println(b);
			} 
			sum = a + (b * 2);
			System.out.println(sum);
			a = b;
			b = sum;
			
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Limit:");
		int limit = ip.nextInt();
		

		pellNumber(limit);

	}

}

//import java.util.Scanner;
//
//public class PellNumbers {
//	public static void main(String args[]) {
//		int n, limit, a = 1, b = 0, c;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the limit: ");
//		limit = sc.nextInt();
//		System.out.println("First " + limit + " Pell numbers are: ");
//		for (n = 1; n <= limit; n++) {
//			c = a + 2 * b;
//			if(b==0) {
//				System.out.print(b+" ");
//			}
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//		}
//	}
//}