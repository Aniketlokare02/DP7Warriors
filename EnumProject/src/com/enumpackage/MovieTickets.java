package com.enumpackage;

import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("1. Standard\n2. Premium\n3. Recliner");
		int seatType=ip.nextInt();
		
		System.out.println("Enter Number Of Seats:");
		int num=ip.nextInt();
		
		MovieSeats ms=null;
		
		switch(seatType) {
		case 1: ms=MovieSeats.STANDARD;
		break;
		case 2: ms=MovieSeats.PREMIUM;
		break;
		case 3: ms=MovieSeats.RECLINER;
		break;
		default: System.out.println("Error");
		}
		
		System.out.println("Ticket Type : "+ms);
		System.out.println("Number Of Seats : "+num);
		System.out.println("Total Amount : "+(num*(ms.price)));

	}

}
