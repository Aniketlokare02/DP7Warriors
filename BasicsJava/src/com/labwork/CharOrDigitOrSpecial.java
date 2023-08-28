package com.labwork;

import java.util.Scanner;

public class CharOrDigitOrSpecial {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the character:");
		char c=ip.next().charAt(0);
		 if((c>='A' && c<='Z') || (c>='a' && c<='z')){
			 System.out.println("It is a Alphabet");
		 }
		 else if(c>='0' && c<='9') {
			 System.out.println("It is a Digit");
		 }
		 else {
			 System.out.println("It is a Special character");
		 }

	}

}
