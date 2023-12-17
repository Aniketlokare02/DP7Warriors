package com.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<>();

		hm.put("Kailash", 85.9);
		hm.put("Neha", 89.6);
		hm.put("Anuj", 90.3);
		hm.put("Aniket", 94.5);
		hm.put("Vishal", 85.6);
		
		// 1st way
		System.out.println(hm);
		System.out.println("----------------------------------");
		
		// 2nd way
		Set<String> keys=hm.keySet();
		
		for (String key : keys) {
			System.out.println(key+"-->"+hm.get(key));
		}
		System.out.println("----------------------------------");
		
		// 3rd way
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()) {
			String k=itr.next();
			System.out.println(k+"-->"+hm.get(k));
		}
		System.out.println("----------------------------------");
		
		// 4th way
		Collection<Double> marks=hm.values();
		for(Double m : marks) {
			System.out.println(m);
		}
		System.out.println("----------------------------------"); 
		
		// 5th way
		Set<Entry<String, Double>> entries=hm.entrySet();
		for(Entry e : entries) {
			System.out.println(e.getKey()+"--"+e.getValue());
		}
		System.out.println("----------------------------------");
		
		// 6th way
		for(Map.Entry<String, Double> e : hm.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}

	}

}
