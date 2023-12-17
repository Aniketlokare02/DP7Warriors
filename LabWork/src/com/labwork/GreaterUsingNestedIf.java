package com.labwork;

import java.util.Scanner;

public class GreaterUsingNestedIf {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int num1=ip.nextInt();
		System.out.print("Enter Second Number:");
		int num2=ip.nextInt();
		System.out.print("Enter Third Number:");
		int num3=ip.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is Greatest.");
			}
			else {
				System.out.println(num3+" is Greatest.");
			}
		}
		else {
			if(num2>num3) {
				System.out.println(num2+" is Greatest.");
			}
			else {
				System.out.println(num3+" is Greatest.");
			}
		}

	}

}
