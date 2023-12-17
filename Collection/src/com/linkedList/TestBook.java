package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class TestBook {

	public static void main(String[] args) {
		
		LinkedList<Book> ll=new LinkedList<>();
		ll.add(new Book(101, "HarryPotter", 500));
		ll.add(new Book(102, "ShivCharitra", 1000));
		ll.add(new Book(103, "DharmVeer", 1500));
		ll.add(new Book(104, "Subhedar", 1000));
		
		for (Book b : ll) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------");
		
		Collections.sort(ll);
		for (Book b : ll) {
			System.out.println(b);
		}
		System.out.println("------------------");
		
		Collections.sort(ll, new SortById());
		for (Book b : ll) {
			System.out.println(b);
		}
		System.out.println("------------------");
		
		Collections.sort(ll, new SortByName());
		for (Book b : ll) {
			System.out.println(b);
		}
		System.out.println("------------------");
		
		Collections.sort(ll, new SortByPrice());
		for (Book b : ll) {
			System.out.println(b);
		}

	}

}
