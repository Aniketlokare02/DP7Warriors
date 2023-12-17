package com.oopsConcept;

public class FindByRating {
	
	static void findByRating(Movie m) {
		if(m.getRating()>=7) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		
		Movie m1=new Movie(101, "RRR", 9);
		Movie m2=new Movie(102, "Avatar2", 8);  
		Movie m3=new Movie(103, "JohnWick", 7);
		Movie m4=new Movie(104, "OMG2", 6);
		Movie m5=new Movie(105, "Adipurush", 5);
		
		System.out.println("-----------------Before----------------");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
		System.out.println("-----------------After------------------");
		findByRating(m1);
		findByRating(m2);
		findByRating(m3);
		findByRating(m4);
		findByRating(m5);

	}

}
