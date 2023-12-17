package com.labwork;

import java.util.Date;
import java.util.Scanner;

public class TicketBooking {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Welcome To RedBus");
		
		System.out.print("Enter Your Airline Name:");
		String airName=ip.next();
		
		System.out.print("Enter Your Departure Place:");
		String dep=ip.next();
		
		System.out.print("Enter Your Destination:");
		String dest=ip.next();
		
		System.out.print("Enter Coupon Code:");
		int coupon=ip.nextInt();
		
		double price=5000.00;
		
		Date d=new Date();
		if(coupon==12345) {
			System.out.println("We are providing you 10% discount");
			System.out.println("Your Ticket Price is:"+(price-(price*0.1)));
		}
		else {
			System.out.println("Invalid Coupon Code");
			System.out.println("Your Ticket Price is:"+price);
		}
		System.out.println(d);

	}

}
