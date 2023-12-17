package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Mango");
		al.add("Cherry");
		al.add("Banana");
		al.add("Orange");
		al.add("Kiwi");
		
		System.out.println(al);
		System.out.println("-------");
		//1st way
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------");
		//2nd way
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("-------");
		//3rd way
		Iterator<String> ltr=al.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("-------");
		//4th way
		ListIterator<String> lsr=al.listIterator();
		while(lsr.hasNext()) {
			System.out.println(lsr.next());
		}
		System.out.println("-------");
		//5th way
		ListIterator<String> ltsr=al.listIterator(al.size());
		while(ltsr.hasPrevious()) {
			System.out.println(ltsr.previous());
		}

	}

}
