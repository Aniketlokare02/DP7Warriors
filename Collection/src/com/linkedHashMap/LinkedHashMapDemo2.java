package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		
		// maintain insertion order
		// maintain access order
		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>(16, 0.75f, true);
		lhm.put("Aniket", 95.5);
		lhm.put("Hrishikesh", 99.5);
		lhm.put("Suraj", 96.3);
		lhm.put("Pralay", 95.7);
		lhm.put("Shivam", 94.3);
		lhm.put("Vishal", 92.2);
		
		for(Map.Entry<String, Double> e : lhm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		System.out.println("Marks of Pralay:"+lhm.get("Pralay"));
		System.out.println("Marks of Shivam:"+lhm.get("Shivam"));
		
		System.out.println("---------------------");
		
		for(Map.Entry<String, Double> e : lhm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}

	}

}
