package com.loopassignments;

import java.util.Scanner;

public class CheckNoIsKrishnamurthiOrNot {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		int num1=num;
		int rem=0;
		int value=0;
		int mul=1;
		while(num!=0) {
			rem=num%10;
			for(int i=1;i<=rem;i++) {
				mul*=i;
			}
			value+=mul;
			num/=10;
		}
		if(num1==value) {
			System.out.println(num1+" is Krishnamurthi Number.");
		}
		else {
			System.out.println(num1+" is Not a Krishnamurthi Number.");
		}

	}

}
