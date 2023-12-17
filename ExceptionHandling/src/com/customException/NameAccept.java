package com.customException;

import java.util.Scanner;

public class NameAccept {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = ip.next();

		try {
			if (name.length() < 3) {
				throw new InvalidNameException("Name Should Be Greater Than 3 Characters.");
			}
			System.out.println("Wlecome " + name);
		} 
		catch (InvalidNameException e) {
			System.out.println(e);
		}

	}

}
