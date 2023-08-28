package com.assignment;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=ip.nextInt();
		if(num>0) {
			System.out.println(num+" is a Positive number");
		}
		else if(num<0) {
			System.out.println(num+" is a Negative number");
		}
		else {
			System.out.println(num+" is a Zero");
		}

	}

}
