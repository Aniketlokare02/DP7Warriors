package com.labwork;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num = ip.nextInt();

		System.out.print("Enter Factor:");
		int factor = ip.nextInt();
		
		if (factor > 0) {
			if (num % factor == 0) {
				System.out.println(factor + " is a " + num + "s Factor");
			} 
			else {
				System.out.println(factor + " is Not a " + num + "s Factor");
			}
		} 
		else {
			System.out.println("Negative Factors Are Not Allowed.");
		}

	}

}
