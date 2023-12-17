package com.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TestBook {

	public static void main(String[] args) {
		
		//PriorityQueue<Book> ll=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Book> ll=new PriorityQueue<>();
		ll.add(new Book(101, "HarryPotter", 500));
		ll.add(new Book(102, "ShivCharitra", 1000));
		ll.add(new Book(103, "DharmVeer", 1500));
		ll.add(new Book(104, "Subhedar", 1000));
		
		for (Book b : ll) {
			System.out.println(b);
		}
		

	}

}
