package com.labwork;

import java.util.Scanner;

public class MaxDigitOfNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		int digit=0;
		while(num!=0) {
			int rem=num%10;
			
			if(rem>digit) {
				digit=rem;
			}
			num/=10;
		}
		System.out.println("Max Digit Of Number:"+digit);
		

	}

}
