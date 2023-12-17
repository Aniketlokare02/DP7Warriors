package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IterateVector {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(10);
		v.add(null);
		v.add(null);
		v.add(-34);
		v.add(23);
		
		// 1st way
		System.out.println(v);
		
		System.out.println("--");
		
		// 2nd way
		for(int i=0;i<v.size();i++) {
			//System.out.println(v.get(i));
			System.out.println(v.elementAt(i));
		}
		
		System.out.println("--");
		
		// 3rd way
		
		for (Integer i : v) {
			System.out.println(i);
		}
		
		System.out.println("--");
		
		// 4th way
		
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--");
		
		// 5th way
		
		ListIterator<Integer> litr=v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("--");
		
		// 6th way
		
		ListIterator<Integer> litr1=v.listIterator(v.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		
		System.out.println("--");
		
		// 7th way
		
		Enumeration<Integer> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
