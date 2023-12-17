package com.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		//ht.put(null, "Aniket"); // null key is not allowed
		//ht.put(1, null); // null value is not allowed
		// it is thread safe because it is legacy class
		
		System.out.println(ht.put(1, "Pralay"));
		ht.put(1, "Aniket");
		ht.put(2, "Hrishikesh");
		ht.put(3, "Suraj");
		ht.put(4, "Shivam");
		
		System.out.println(ht);
	}

}
