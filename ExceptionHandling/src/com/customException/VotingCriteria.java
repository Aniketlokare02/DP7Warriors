package com.customException;

import java.util.Scanner;

public class VotingCriteria {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Enter Age:");
		int age = ip.nextInt();

		try {
			if (age < 18) {
				throw new AgeInvalidException("Age Should Be Greater Than 18 Years.");
			}
			System.out.println("You Can Vote Your Choice Party.");
		}
		catch (AgeInvalidException e) {
			System.out.println(e);
		}

	}

}
