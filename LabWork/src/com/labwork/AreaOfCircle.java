package com.labwork;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double area, perimeter;
		System.out.print("Enter the Radius:");
		double radius = ip.nextInt();
		area = Math.PI * radius * radius;
		perimeter = 2 * Math.PI * radius;
		System.out.println("Area of Circle is : " + area);
		System.out.println("Perimeter of Circle is : " + perimeter);
	}

}
