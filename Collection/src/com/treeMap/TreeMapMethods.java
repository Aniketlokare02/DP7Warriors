package com.treeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap=new TreeMap<>();
		tmap.put(4, "CSS");
		tmap.put(2, "SQL");
		tmap.put(3, "HTML");
		tmap.put(1, "JAVA");
		tmap.put(6, "C#");
		tmap.put(1, "Angualr");
		//tmap.put(null, "Hi"); // NullPointerException
		
		System.out.println(tmap);
		
		//Methods
		
		System.out.println("First Key:"+tmap.firstKey());
		System.out.println("Last Key:"+tmap.lastKey());
		
		SortedMap<Integer, String>s1=tmap.subMap(3,6);// 3 included // 6 excluded
		System.out.println(s1);
		
		SortedMap<Integer, String>s2=tmap.headMap(3);// entries before 3 and 3 is excluded
		System.out.println(s2);
		
        SortedMap<Integer, String>s3=tmap.tailMap(3);// entries after 3 and 3 is included
		System.out.println(s3);
		
		// Navigable Map
		
		System.out.println("Lower Key:"+tmap.lowerKey(4)); // strictly less
		System.out.println("Floor Key:"+tmap.floorKey(4)); // less than or equal to
		
		System.out.println("Higher Key:"+tmap.higherKey(4)); // strictly greater
		System.out.println("Ceiling Key:"+tmap.ceilingKey(4)); // greter than or equal to
		
		SortedMap<Integer, String>s4=tmap.subMap(3,false,6,true);// 3 excluded // 6 included
		System.out.println(s4);
		
		SortedMap<Integer, String>s5=tmap.headMap(3, true);// entries before 3 and 3 is included
		System.out.println(s5);
		
		SortedMap<Integer, String>s6=tmap.tailMap(3, false);// entries after 3 and 3 is excluded
		System.out.println(s6);
		
		// by default
		// from:included
		// to:excluded

	}

}
