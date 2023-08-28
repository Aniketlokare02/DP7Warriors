package com.assignment;

import java.util.Scanner;

public class NumberOfDays {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter The Month:");
		String month=ip.next();
		
		if(month=="January" || month=="March" || month=="May" || month=="July"|| month=="August" || month=="October" || month=="December") {
			System.out.println(month+" has a 31 Days");
		}
		else if(month=="April" || month=="June" || month=="September" || month=="November") {
			System.out.println(month+" has a 30 Days");
		}
		else {
			System.out.println(month+" has a 28 Days");
		}

	}

}
