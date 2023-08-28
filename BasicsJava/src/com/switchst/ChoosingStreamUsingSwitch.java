package com.switchst;

import java.util.Scanner;

public class ChoosingStreamUsingSwitch {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Choose Your Stream:");
		String stream = ip.next();
		System.out.print("Enter Percentage:");
		int passingCriteria = ip.nextInt();

		switch (stream) {
		case "MBA":
			System.out.println("You Are Choosing MBA.");
			switch (passingCriteria) {
			case 75:
				System.out.println("You Got Admission For MBA.");
				break;
			case 70:
				System.out.println("You Are Eligible For MCA.");
				break;
			default:
				System.out.println("Better Luck Next Time.");
			}
		break;
		case "MCA":
			System.out.println("You Are Choosing MCA.");
			switch (passingCriteria) {
			case 75:
				System.out.println("You Are Eligible For MBA.");
				break;
			case 70:
				System.out.println("You Got Admission For MCA.");
				break;
			default:
				System.out.println("Better Luck Next Time.");
			}
		break;
		default:System.out.println("Choose Correct Stream.");

			
			
		}

	}

}
