package com.labwork;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static int armStrongNumber(int num) {
		int count=0;
		int num1=num;
		while(num!=0) {
			num/=10;
			count++;
		}
		
		int sum=0;
		while(num1!=0) {
			int rem=num1%10;
			int value=1;
			for(int i=1;i<=count;i++) {
			value*=rem;
			}
			sum+=value;
			num1/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		//int num2=num;
		
		
		if(num==armStrongNumber(num)) {
			System.out.println(num+" is ArmStrong Number.");
		}
		else {
			System.out.println(num+" is Not a ArmStrong Number.");
		}
		
	}

}
