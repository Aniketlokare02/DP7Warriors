package com.hashSet;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		
		HashSet<Item> hs=new HashSet<>();
		hs.add(new Item(1, "Sugar", 40));
		hs.add(new Item(2, "Chocalate", 50));
		hs.add(new Item(3, "Flour", 120));
		hs.add(new Item(4, "ColdDrink", 25));
		hs.add(new Item(5, "Ghee", 40));
		hs.add(new Item(1, "Sugar", 40));
		hs.add(new Item(6, "Chips", 40));
		
		for(Item i : hs) {
			System.out.println(i);
		}

	}

}
