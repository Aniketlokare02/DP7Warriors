package com.assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter the Year:");
		int year=ip.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+" is Leap year");
				}
				else {
					System.out.println(year+" is not a Leap year");
				}
			}
			else {
				System.out.println(year+" is a Leap year");
			}
		}
		else {
			System.out.println(year+" is not a leap year");
		}

	}

}
