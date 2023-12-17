package com.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap=new TreeMap<>();
		tmap.put(4, "CSS");
		tmap.put(2, "SQL");
		tmap.put(3, "HTML");
		tmap.put(1, "JAVA");
		
		System.out.println(tmap);
		System.out.println("------------------");
		
		/// reverse
		NavigableMap<Integer, String> nm=tmap.descendingMap();
		
		for(Map.Entry<Integer, String> e : nm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("------------------");
		
		//
		NavigableSet<Integer> ns=tmap.navigableKeySet();
		for(Integer i : ns) {
			System.out.println(i+" "+tmap.get(i));
		}
		System.out.println("------------------");
		
		//
		Set<Integer> key=tmap.keySet();
		Iterator<Integer> itr=key.iterator();
		while(itr.hasNext()) {
			int keys=itr.next();
			System.out.println(keys+" "+tmap.get(keys));
		}
		System.out.println("------------------");
		//
		for(Map.Entry<Integer, String> e : tmap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
