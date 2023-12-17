package com.labwork;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Welcome To HDFC ATM");

		System.out.print("Enter Your Pin:");
		int pin = ip.nextInt();

		double balance = 10000;

		
			if (pin == 1234) {
				System.out.println("1-Deposite\n2-Withdraw\n3-Check Balance\n4-Exit");

				System.out.print("Enter Choice : ");
				int choice = ip.nextInt();
				
				switch (choice) {
				case 1:
					System.out.print("Enter Deposite Amount : ");
					int deposite = ip.nextInt();
					balance += deposite;
					System.out.println("Your Bank Balance is : " + balance);
					break;

				case 2:
					System.out.print("Enter Amount to be Withdraw : ");
					int withdraw = ip.nextInt();
					balance -= withdraw;
					System.out.println("Your Bank Balance is : " + balance);
					break;

				case 3:
					System.out.println("Your Bank Balance is : " + balance);
					break;

				default:
					System.out.println("Thank You. Visit Again!!");
				}
			} else {
				System.out.println("Enter Correct Pin.");
			}

		}
	

}
