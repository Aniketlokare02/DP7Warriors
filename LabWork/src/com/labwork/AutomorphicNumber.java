package com.labwork;

import java.util.Scanner;

public class AutomorphicNumber {
	
	static int count=0;
	
	static void automorphic(int num) {
		int count=0;
		int num1=num;
		int num2=num;
		while(num!=0) {
			num/=10;
			count++;
		}
		int sqr=num1*num1;
		int pow=1;
		int rem=0, rem2=0;
		for(int i=1;i<=count;i++) {
			 rem=num1%pow;
			 rem2=num1%pow;
			
		}
		if(rem==rem2) {
			System.out.println(num2+" is Automorphic Number.");
		}
		else {
			System.out.println(num2+" is Not Automorphic Number.");
		}
	}
	
//	static int reverseNumber(int num) {
//		int rev=0;
//		while(num!=0) {
//			int rem=num%10;
//			rev=(rev*10)+rem;
//			num/=10;
//			count++;
//		}
//		//System.out.println(rev);
//		return rev;
//	}
//	
//	static int automorphic(int num) {
//		int num1=num;
//		int sqr=num*num;
//		int rev1=0;
//		for(int i=1;i<=count;i++) {
//			int rem=num1%10;
//			rev1=(rev1*10)+rem;
//			num1/=10;
//		}
//		//System.out.println(rev1);
//		return rev1;
//		
//	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		automorphic(num);
//		int rev=reverseNumber(num);
//		int auto=automorphic(num);
//		if(rev==auto) {
//			System.out.println(num+" is Automorphic.");
//		}
//		else {
//			System.out.println(num+" is Not a Automorphic.");
//		}
		

	}

}
