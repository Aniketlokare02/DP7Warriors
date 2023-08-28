package com.loopassignments;

import java.util.Scanner;

public class PrintNthFactorial {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int s=ip.nextInt();
		
		int fact=1;
		for(int i=1;i<=s;i++) {
			fact*=s;
		}
		System.out.println(fact);

	}

}
