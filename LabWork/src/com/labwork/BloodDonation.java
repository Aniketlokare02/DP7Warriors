package com.labwork;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age=ip.nextInt();
		System.out.print("Enter Your Weight:");
		int wieght=ip.nextInt();
		
		if(age>=18) {
			if(wieght>=70) {
				System.out.println("Your Eligible for Donate Blood");
			}
			else {
				System.out.println("Your Under Wieght");
			}
		}
		else {
			System.out.println("Your Not Eligible for Donate Blood");
		}

	}

}
