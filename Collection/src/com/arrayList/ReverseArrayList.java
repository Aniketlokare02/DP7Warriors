package com.arrayList;

import java.util.ArrayList;

public class ReverseArrayList {
	
	static void reverseArrayList(ArrayList<String> al) {
		
		for(int i=0, j=al.size()-1; i<al.size()/2;i++, j--) {
			
				String temp=al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
			
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Mango");
		al.add("Cherry");
		al.add("Banana");
		al.add("Orange");
		al.add("Kiwi");
		
		System.out.println("Before:"+al);
		reverseArrayList(al);
		System.out.println("After:"+al);

	}

}
