package com.assignment;

import java.util.Scanner;

public class NumberDivisibleBy5And11 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ip.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.println(num+" is divisible by 5 and 11");
		}
		else {
			System.out.println(num+" is not divisible by 5 and 11");
		}

	}

}
