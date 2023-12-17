package com.labwork;

import java.util.Scanner;

public class NumberInAscendingOrDescending {
	
	static boolean ascendingOrDescending(int num) {
		int num1=num;
		boolean flag=false;
		int digit=0;
		int digit1=9;
		while(num!=0) {
			int rem=num%10;
			if(rem>digit) {
				flag=true;
				digit=rem;
			}
//			else if(digit1>rem) {
//				flag=true;
//				digit1=rem;
//			}
			num/=10;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		boolean status=ascendingOrDescending(num);
		
		if(status==true) {
			System.out.println(num+" is Ascending Or Descending.");
		}
		else {
			System.out.println(num+" is Bouncy.");
		}

	}

}
