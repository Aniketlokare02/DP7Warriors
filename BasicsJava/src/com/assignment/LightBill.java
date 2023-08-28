package com.assignment;

import java.util.Scanner;

public class LightBill {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter No. of Electricity Unit Used : ");
		int unit=ip.nextInt();
		if(unit<=50) {
			System.out.print("Your Electricity Bill is : "+((unit*0.50)+((unit*0.50)*0.20))+" Rupees");
		}
		else if(unit<=150) {
			System.out.println("Your Electricity Bill is : "+((25+((unit-50)*0.75))+((25+((unit-50)*0.75)))*0.20)+" Rupees");
		}
		else if(unit<=250) {
			System.out.print("Your Electricity Bill is :"+((100+(unit-150)*1.20)+((100+(unit-150)*1.20))*0.20)+" Rupees");
		}
		else {
			System.out.println("Your Electricity Bill is : "+((220+(unit-250)*1.50)+((220+(unit-250)*1.50)*0.20))+" Rupees");
		}

	}

}
