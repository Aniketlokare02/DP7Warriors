package com.assignment;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter the Salary:");
		double salary=ip.nextDouble();
		
		if(salary<=10000) {
			System.out.print("Gross Salary is : "+(salary+(salary*0.20)+(salary*0.80))+" Rupees");
		}
		else if(salary<=20000) {
			System.out.print("Gross Salary is : "+(salary+(salary*0.25)+(salary*0.90))+" Rupees");
		}
		else {
			System.out.print("Gross Salary is : "+(salary+(salary*0.30)+(salary*0.95))+" Rupoees");
		}

	}

}
