package com.arrayOfObject;

import java.util.Scanner;

public class PrintDetails1 {
	
	static Scanner ip=new Scanner(System.in);
	
	static void enterDetails(Theater1 t) {
		System.out.println("Enter Theater Id:");
		t.settId(ip.nextInt());
		
		System.out.println("Enter Theater Name:");
		t.settName(ip.next());
		
		System.out.println("Enter Theater Location:");
		t.setLocation(ip.next());
		
		t.setMovie(new Movie());
		System.out.println("Enter Movie Id:");
		t.getMovie().setmId(ip.nextInt());
		
		System.out.println("Enter Movie Name:");
		t.getMovie().setmName(ip.next());
		
		System.out.println("Enter Movie Rating:");
		t.getMovie().setRating(ip.nextFloat());
	}

	public static void main(String[] args) {
		
		Movie1[] m=new Movie1[2];
		
		Theater1[] tr=new Theater1[3];
		
		for(int i=0;i<tr.length;i++) {
			tr[i]=new Theater1();
			enterDetails(tr[i]);
		}
		
		for (Theater1 t : tr) {
			System.out.println(t);
		}

	}

}
