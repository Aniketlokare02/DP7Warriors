package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Double> lhm=new LinkedHashMap<>();
		lhm.put("Aniket", 95.5);
		lhm.put("Hrishikesh", 99.5);
		lhm.put("Suraj", 96.3);
		lhm.put("Pralay", 95.7);
		lhm.put("Shivam", 94.3);
		lhm.put("Vishal", 92.2);
		
		for(Map.Entry<String, Double> e : lhm.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		System.out.println(lhm.get("Pralay"));

	}

}
