package com.assignment;

import java.util.Scanner;

public class OvelOrConsonent {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter an alphabet:");
		char c=ip.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println(c+" is ovel");
		}
		else {
			System.out.println(c+" is consonent");
		}

	}

}
