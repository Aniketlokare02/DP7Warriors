package com.hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Double> hm=new HashMap<>();
		
		System.out.println(hm.isEmpty());
		
		hm.put("Kailash", 85.9);
		hm.put(null, 0.0);
		System.out.println(hm.put(null, 100.0)); // replace 0 with 100
		hm.put("Neha", 89.6);
		hm.put("Anuj", 90.3);
		hm.put("Aniket", 94.5);
		hm.put("Vishal", 85.6);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		//get
		
		System.out.println("Marks of Vishal:"+hm.get("Vishal"));
		
		System.out.println("Suraj:"+hm.containsKey("Suraj"));
		System.out.println("Anuj:"+hm.containsKey("Anuj"));
		
		System.out.println("89.6:"+hm.containsValue(89.6));
		
		// putIfAbsent
		System.out.println(hm.putIfAbsent("Neha", 65.6));
		System.out.println(hm);
		
		System.out.println(hm.putIfAbsent("Suraj", 85.6));
		System.out.println(hm);

	}

}
