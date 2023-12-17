package com.linkedList;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		if(b1.getPrice()==b2.getPrice()) {
			return (b1.getName().compareTo(b2.getName()));
		}
		else {
			return (int) (b1.getPrice()-b2.getPrice());
		}
	}

}
