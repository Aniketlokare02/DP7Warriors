package com.loopassignments;

import java.util.Scanner;

public class CountNumberOfDigitInNo {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		long num=ip.nextLong();
		
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println(count);

	}

}
