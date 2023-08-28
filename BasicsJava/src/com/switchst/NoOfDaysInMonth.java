package com.switchst;

import java.util.Scanner;

public class NoOfDaysInMonth {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Month:");
		String mName=ip.next();
		
		switch(mName) {
		case "January":
		case "March":
		case "May"    :
		case "July"   :
		case "August" :
		case "October":
		case "December": System.out.println("31 Days");
			break;
		case "April"   :
		case "June"    :
		case "September":
		case "November" : System.out.println("30 Days");
			break;
		case "February": System.out.println("Enter the Year");
		int year=ip.nextInt();
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println("29 days");
		}
		else {
			System.out.println("28 days");
		}
		}
			

	}

}
