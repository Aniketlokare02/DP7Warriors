package com.labwork;

import java.util.Scanner;

public class PrintAlphabetFromNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Numbers:");
		int num1=ip.nextInt();
		int num2=ip.nextInt();
		int num3=ip.nextInt();
		int num4=ip.nextInt();
		
		char c1=(char) num1;
		char c2=(char) num2;
		char c3=(char) num3;
		char c4=(char) num4;
		
		System.out.println(c1+"\n"+c2+"\n"+c3+"\n"+c4);

	}

}
