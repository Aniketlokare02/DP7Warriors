package com.labwork;

import java.util.Scanner;
 
public class GreatestNumberUsingTernury {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The First Number:");
		int num1 = ip.nextInt();
		System.out.print("Enter The Second Number:");
		int num2 = ip.nextInt();
		System.out.print("Enter The Third Number:");
		int num3 = ip.nextInt();

		int max = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
		System.out.println(max + " is Greatest Number.");

		System.out.println();

		int max1 = num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3;
		System.out.println(max1 + " is Greatest Number.");
		
		System.out.println();
		String max3 = num1 > num2 ? num1 > num3 ? num1+" is Greatest." : num3+" is Greatest" : num2 > num3 ? num2+" is Greatest." : num3+" is Greatest.";
		System.out.println(max3);

	}

}
