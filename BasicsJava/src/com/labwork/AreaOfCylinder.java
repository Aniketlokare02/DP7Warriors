package com.labwork;

import java.util.Scanner;

public class AreaOfCylinder {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double radius=ip.nextDouble();
		System.out.println("Enter the height:");
		double height=ip.nextDouble();
		
		double volume=Math.PI*radius*radius*height;
		
		System.out.println("Volume of Cylinder:"+volume);

	}

}
