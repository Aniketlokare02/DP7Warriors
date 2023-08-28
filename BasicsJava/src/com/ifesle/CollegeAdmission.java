package com.ifesle;

import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) { 
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Percentage");
		float per=ip.nextFloat();
		
		if(per>=65) {
			System.out.println("Eligible for Admission");
			if(per>=80) {
				System.out.println("Eligible for Science and Commerce");
			}
			else {
				System.out.println("Eligible for Commerce");
			}
		}
		else {
			System.out.println("Not Eligible for Admission");
		}

	}

}
