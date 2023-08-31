package com.labwork;

import java.util.Scanner;

public class SumOfEvenDigit {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				sum+=rem;
			}
			num/=10;
		}
		System.out.println("Sum Of Even Digit:"+sum);

	}

}
