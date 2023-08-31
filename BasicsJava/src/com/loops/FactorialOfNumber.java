package com.loops;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.print("Enter the Number:");
		 int num=ip.nextInt();
		 int fact=1;
		 
		 for(int i=1;i<=num;i++) {
			 fact*=i;
		 }
		 System.out.println("Factorial Of "+num+" is : "+fact);

	}

}
