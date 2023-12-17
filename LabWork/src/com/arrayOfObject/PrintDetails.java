package com.arrayOfObject;

public class PrintDetails {

	public static void main(String[] args) {
		
		Movie m=new Movie(101, "Avatar2", 9.8f);
		
		Theater[] tr=new Theater[2];
		tr[0]=new Theater(201, "SFC", "Sangli", m);
		tr[1]=new Theater(202, "Phoenix", "Pune", m);
		
		for (Theater t : tr) {
			System.out.println(t);
		}

	}

}
