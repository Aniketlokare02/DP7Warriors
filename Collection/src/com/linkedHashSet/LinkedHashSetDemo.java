package com.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Aniket");
		lhs.add("Hrishi");
		lhs.add("Suraj");
		lhs.add(null);
		System.out.println(lhs.add("Aniket"));
		lhs.add("Pralay");
		
		System.out.println(lhs);
		
		for(String s : lhs) {
			System.out.println(s);
		}
		
		
	}

}
