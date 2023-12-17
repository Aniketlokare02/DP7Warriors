package com.labwork;

import java.util.Scanner;

public class CubeOfNum {

	static int square(int num) {
		return num*num;
	}
	
	static int cube(int num) {
		return num*square(num);
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		
		System.out.println("Cube of "+num+" is:"+cube(num));

	}

}
