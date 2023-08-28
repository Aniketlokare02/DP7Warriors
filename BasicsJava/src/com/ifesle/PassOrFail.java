package com.ifesle;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the name:");
		String name=ip.next();
		System.out.println("Enter the marks of sub1");
		double sub1=ip.nextDouble();
		System.out.println("Enter the marks of sub2");
		double sub2=ip.nextDouble();
		System.out.println("Enter the marks of sub3");
		double sub3=ip.nextDouble();
		System.out.println("Enter the marks of sub4");
		double sub4=ip.nextDouble();
		System.out.println("Enter the marks of sub5");
		double sub5=ip.nextDouble();
		
		double per=((sub1+sub2+sub3+sub4+sub5)/500)*100;
		
		if(per>45) {
			System.out.println(name+" has scored:"+per);
			System.out.println("Congratulations!!Passed and Promoted");
		}
		else {
			System.out.println(name+" has scored:"+per);
			System.out.println("You have failed!!Try hard next time");
		}

	}

}
