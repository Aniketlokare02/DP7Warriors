package com.labwork;

import java.util.Scanner;

public class EarningOfEmployeePerYear {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Part-Time Hours/Day:");
		int partTime=ip.nextInt();
		int cost=100;
		
		if(partTime>0 && partTime<25) {
			System.out.println("Employees Earning : "+((partTime*cost)*365)+" Rs/Year");
		}

	}

}
