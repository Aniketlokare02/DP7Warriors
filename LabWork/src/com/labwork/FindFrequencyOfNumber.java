package com.labwork;

import java.util.Scanner;

public class FindFrequencyOfNumber {
	
	static int frequencyOfDigit(int num, int digit) {
		int count=0;
		while(num!=0) {
			int rem=num%10;
			if(rem==digit) {
				count++;
			}
			num/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		System.out.print("Enter The Digit:");
		int didgit=ip.nextInt();
		
		System.out.println("Frequency of "+num+" is : "+frequencyOfDigit(num, didgit));

	}

}
