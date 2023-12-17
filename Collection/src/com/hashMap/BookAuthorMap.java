package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookAuthorMap {
	
	public static void createCountMap(ArrayList<Book> al) {
		
		HashMap<Author, Integer> hm=new HashMap<>();
		
		for(Book b : al) {
			if(hm.containsKey(b));
		}
	}
	
	public static void createBookMap(ArrayList<Book> al) {
		
		HashMap<Author, ArrayList<Book>> hm=new HashMap<>();
		
		ArrayList<Book> books;
		
		for(Book b : al) {
			if(hm.containsKey(b.getAuthor())) {
				books=hm.get(b.getAuthor());
			}
			else {
				books=new ArrayList<>();
			}
			books.add(b);
			hm.put(b.getAuthor(), books);
		}
		
		for(Map.Entry<Author, ArrayList<Book>> e : hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println("--------");
			for(Book b : e.getValue()) {
				System.out.println(b);
				System.out.println("-----------------------------");
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Book> al=new ArrayList<>();
		al.add(new Book(101, "Harry Potter", 1000, new Author(201, "JK Rowlling")));
		al.add(new Book(102, "Hamlet", 950, new Author(202, "William Shakespeare")));
		al.add(new Book(103, "Fantastic Beast", 1200, new Author(201, "JK Rowlling")));
		al.add(new Book(104, "Romeo And Juliet", 1000, new Author(202, "William Shakespeare")));
		al.add(new Book(105, "The Clear Blue Sky", 850, new Author(203, "Narayan Murthy")));
		
		createBookMap(al);
	}

}
