package com.ifesle;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the Age");
		int age=ip.nextInt();
		
		if(age>=18) {
			System.out.println("You can vote..");
		}
		else {
			System.out.println("You cannot vote..");
		}
		
		System.out.println("Rest of code..");

	}

}
