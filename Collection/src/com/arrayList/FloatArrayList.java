package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Q1. Create an arraylist of Float and iterate the arraylist using
// 1. normal for loop
// 2. enhanced for loop
// 3. iterator
// 4. list iterator- forward
// 5. list iterator- backward

public class FloatArrayList {

	public static void main(String[] args) {
		
		ArrayList<Float> al=new ArrayList<>();
		al.add(25.2f);
		al.add(50.3f);
		al.add(45.4f);
		al.add(65.6f);
		al.add(85.7f);
		
		//1st
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----");
		
		//2nd
		for (Float f : al) {
			System.out.println(f);
		}
		System.out.println("----");
		
		//3rd
		Iterator<Float> ali=al.iterator();
		while(ali.hasNext()) {
			System.out.println(ali.next());
		}
		System.out.println("----");
		
		//4th
		ListIterator<Float> lal=al.listIterator();
		while(lal.hasNext()) {
			System.out.println(lal.next());
		}
		System.out.println("----");
		
		//5th
		ListIterator<Float> lalp=al.listIterator(al.size());
		while(lalp.hasPrevious()) {
			System.out.println(lalp.previous());
		}

	}

}
