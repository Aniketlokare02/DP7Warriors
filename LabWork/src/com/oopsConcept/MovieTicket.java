package com.oopsConcept;

import java.util.Scanner;

public class MovieTicket {

	private int tId;
	static int price;
	static int availableTicket;

	static {
		price = 100;
		availableTicket = 25;
	}

	public void setTId(int tId) {
		this.tId = tId;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		MovieTicket.price = price;
	}

	public static int getAvailableTicket() {
		return availableTicket;
	}

	public static void setAvailableTicket(int availableTicket) {
		MovieTicket.availableTicket = availableTicket;
	}

	public int calculateTicketPrice(int noOfTickets) {
		int cost = 0;
		if (noOfTickets <= availableTicket) {
			cost = noOfTickets * price;
			MovieTicket.availableTicket = MovieTicket.availableTicket - noOfTickets;
		} 
		return cost;
//		else {
//			return -1;
//		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		MovieTicket m1 = new MovieTicket();
		while (true) {
			System.out.print("Enter The Ticket Id:");
			m1.tId = ip.nextInt();
			
			System.out.print("Enter The No. Of Tickets Want to Book: ");
			int noOfTickets = ip.nextInt();
			
			if (noOfTickets <= MovieTicket.availableTicket) {
				System.out.println("Available Tickets:" + MovieTicket.availableTicket);
				int cost = m1.calculateTicketPrice(noOfTickets);
				System.out.println("Total Cost Of Tickets:" + cost);
				System.out.println("Available Tickets After Booking:"+MovieTicket.availableTicket);
				System.out.println("----------------------------------");
				if(MovieTicket.availableTicket==0) {
					System.out.println("All Tickets Are Booked.");
					break;
				}
			}
			else {
				System.out.println("You Enter Wrong Input");
				System.out.println("Available Tickets:"+MovieTicket.availableTicket);
			}
		}
	}
}
