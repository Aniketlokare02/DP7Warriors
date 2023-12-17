package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

// Q3. Create an arraylist of Integer and implement following methods
// 1. get method
// 2. set method
// 3. retainAll
// 4. removeAll
// 5. add method

public class ArrayListsMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(25);
		al.add(35);
		al.add(45);
		al.add(55);
		al.add(65);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		
		System.out.println("--------------------");
		System.out.println(al.set(4, 60));
		System.out.println(al);
		
		System.out.println("--------------------");
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(35);
		al2.add(55);
		al2.add(60);
		al.addAll(al2);
		System.out.println(al);
		al.retainAll(al2);
		System.out.println(al);
		
		System.out.println("--------------------");
		al.removeAll(al2);
		System.out.println(al);
		
		//Collections.synchronizedCollection(al);

	}

}
