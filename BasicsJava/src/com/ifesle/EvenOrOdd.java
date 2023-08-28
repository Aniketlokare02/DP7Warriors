package com.ifesle;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the number:");
		
		int num=ip.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}

	}

}
