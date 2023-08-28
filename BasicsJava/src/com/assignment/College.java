package com.assignment;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the total marks");
		float total=ip.nextFloat();
		System.out.println("Enter Subject wise marks");
		float physics=ip.nextFloat();
		float chemistry=ip.nextFloat();
		float biology=ip.nextFloat();
		float maths=ip.nextFloat();
		
		float avg=(physics+chemistry+biology+maths)/4;
		
		if(total>=90 || avg>=85) {
			System.out.println("Eliglible for Admission");
		}
		else {
			System.out.println("Not Eligible for Admission");
		}

	}

}
