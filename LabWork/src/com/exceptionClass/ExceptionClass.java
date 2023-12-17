package com.exceptionClass;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		try {
			int num = ip.nextInt();
			if (num > 99999)
				throw new OutOfRangeException("Number Out Of Range.");
			System.out.println("Number In Range.");
		} 
		catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		}

	}

}
