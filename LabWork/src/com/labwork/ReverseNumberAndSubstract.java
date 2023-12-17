package com.labwork;

import java.util.Scanner;

public class ReverseNumberAndSubstract {
	
	static int reverseNumber(int num) {
		int num1=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		int sub=num1-rev;
		if(sub<=0) {
			return 0;
		}
		else {
			return sub;
		}
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		System.out.println(reverseNumber(num));
		
	}

}
