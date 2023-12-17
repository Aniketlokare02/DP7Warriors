package com.labwork;

import java.util.Date;
import java.util.Scanner;

public class BookMovieTicket {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Movie Name:");
		String name=ip.next();
		
		System.out.print("Enter Rating:");
		float rating=ip.nextFloat();
		
		System.out.print("Enter Price:");
		int price=ip.nextInt();
		
		System.out.println("Coupon Code for Silver:0\nCoupon Code for Gold:1");
		
		System.out.print("Enter Coupon Code:");
		int code=ip.nextInt();
		
		Date d=new Date();
		
		if(code==0) {
			System.out.println("For Silver 50 Rs Off");
			System.out.println("Your Ticket is Booked at Price:"+(price-50));
		}
		else if(code==1) {
			System.out.println("For Gold 100 Rs Off");
			System.out.println("Your Ticket is Booked at Price:"+(price-100));
		}
		else {
			System.out.println("You Don't Have Any Coupon Code");
			System.out.println("Your Ticket is Booked at Price:"+price);
		}
		System.out.println(d);
		
	}

}
