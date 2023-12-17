package com.arrayList;

import java.util.ArrayList;

public class MethodsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.isEmpty());
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		al.add(null);
		al.add(null);
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		//diffrence add and set
		
		al.add(2, "HTML"); // add and shift
		System.out.println(al);
		
		al.set(5, "Devops"); //replaces
		System.out.println(al);
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add(".Net");
		al2.add("SQL");
		
		ArrayList<String> al3=new ArrayList<>(5);
		al3.add(".Net");
		al3.add("SQL");
		al3.add("Java");
		al3.add("React");
		
		System.out.println(al2);
		
		//		al.addAll(al2);
//		System.out.println(al);
		
		al.addAll(2,al2);
		System.out.println(al);
		
		System.out.println(al.contains("Java"));
		System.out.println(al.contains("React"));
		
		System.out.println(al.containsAll(al3)); // All elements of al3 must be present in al
		
		System.out.println(al.size());
		
		// remove
		
		System.out.println(al.remove(4));  // return Element
		
		System.out.println(al.remove("HTML"));
		
		//System.out.println(al.remove("Java")); // return boolean
		
//		al.removeAll(al3);  // remove all elements which matches al3
//		System.out.println(al);
		
		al.retainAll(al3); // keeps only those elements which matches al3 and removes rest
		System.out.println(al);
		
		

	}

}
