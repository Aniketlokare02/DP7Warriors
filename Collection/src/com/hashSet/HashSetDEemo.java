package com.hashSet;

import java.util.HashSet;

public class HashSetDEemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<>();
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Angular");
		hs.add("Go");
		hs.add("Python");
		//System.out.println(hs.add("Go"));
		hs.add(null);
		
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Java");
		hs1.add("C");
		hs1.add(".Net");
		System.out.println(hs1);
		
		//Mathematical Operation
		//Unoin
//		hs.addAll(hs1);
//		System.out.println(hs);
		
		//Difference
//		hs.removeAll(hs1);
//		System.out.println(hs);
		
		//Intresection
		hs.retainAll(hs1);
		System.out.println(hs);

	}

}
