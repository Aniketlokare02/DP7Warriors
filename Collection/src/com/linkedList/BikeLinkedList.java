package com.linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Bike> ll=new LinkedList<>();
		ll.add(new Bike(101, "Royal-Enfield-Classic350", 275000, 2020));
		ll.add(new Bike(102, "Hero-Splendor+", 85000, 2009));
		ll.add(new Bike(103, "Honda-Activa", 90000, 2015));
		ll.add(new Bike(104, "Yamaha-FZ", 175000, 2007));
		ll.addFirst(new Bike(105, "Harley-Dividson", 450000, 2022));
		ll.addFirst(new Bike(106, "TVS-Jupiter", 92000, 2008));
		ll.addLast(new Bike(107, "Kawasaki-Ninja", 450000, 2017));
		ll.add(5, new Bike(108, "Appache-RTR-350", 225000, 2023));
		
		for(Bike b : ll) {
			System.out.println(b);
		} 
		System.out.println("-------------------------------------------------");
		
		Collections.sort(ll);
		for(Bike b : ll) {
			System.out.println(b);
		}
		System.out.println("-------------------------------------------------");
		
		Iterator<Bike> itr=ll.iterator();
		while(itr.hasNext()) {
			if(itr.next().getModel()<2010)
				itr.remove();
		}
		for(Bike b : ll) {
			System.out.println(b);
		}
		
	}

}
