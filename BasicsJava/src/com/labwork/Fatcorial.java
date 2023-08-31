package com.labwork;

import java.util.Scanner;

public class Fatcorial {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(num+" Factorial is : "+fact);

	}

}
