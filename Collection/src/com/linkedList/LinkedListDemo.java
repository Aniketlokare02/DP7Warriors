package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> itcomp=new LinkedList<>();
		//System.out.println(itcomp.getFirst()); // throws NoSuchElementException
		System.out.println(itcomp.peek()); // null
		
		System.out.println();
		
		itcomp.add("HCL");
		itcomp.add("TCS"); // add at last
		itcomp.add("Null");
		itcomp.add("TCS");
		
		System.out.println(itcomp);
		
		itcomp.addFirst("Infosys");
		System.out.println(itcomp);
		
		itcomp.add(1, "Dell");
		System.out.println(itcomp);
		
		//retrieve
		
		System.out.println("---------------------------------");
		
		System.out.println(itcomp.element());
		System.out.println(itcomp.get(0));

	}

}
