package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Mango");
		ll.add("Orange");
		ll.add("Banana");
		ll.add("Kiwi");
		ll.add("Cherry");
		
		// 1st normal way 
		System.out.println(ll);
		
		System.out.println("-------------------------------------");
		
		// 2nd for loop way
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("------");
		
		// 3rd enhanced loop way
		
		for (String s : ll) {
			System.out.println(s);
		}
		System.out.println("------");
		
		// 4th iterator way
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------");
		
		// 5th descending iterator way
		Iterator<String> ditr=ll.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
		System.out.println("------");
		
		// 6th list iterator way
		ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("------");
		
		// 7th list iterator descending way
		ListIterator<String> litr1=ll.listIterator(ll.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}

	}

}
