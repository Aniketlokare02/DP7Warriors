package com.loopassignments;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		int product=1;
		while(num!=0) {
			int rem=num%10;
			product*=rem;
			num/=10;
		}
		System.out.println("Product Of Each Digit Of Number:"+product);

	}

}
