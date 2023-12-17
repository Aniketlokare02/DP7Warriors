package com.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("SpringBoot");
		al.add("Python");
		al.add("HTML");
		
		System.out.println(al);
		
		HashSet<String> hs=new HashSet<>(al);
		System.out.println(hs);
		
	}

}
