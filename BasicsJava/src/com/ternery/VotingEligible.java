package com.ternery;

import java.util.Scanner;

public class VotingEligible {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Age:");
		int age = ip.nextInt();

		String status;
		status = (age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(status);

		boolean s;
		s = (age >= 18) ? true : false;
		System.out.println(s);

	}

}
