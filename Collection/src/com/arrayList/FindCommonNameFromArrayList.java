package com.arrayList;

import java.util.ArrayList;

//Q2. Create 2 arraylist of String containing names.
//Then find the names common in both the arraylist

public class FindCommonNameFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Aniket");
		al.add("Hrishikesh");
		al.add("Suraj");
		al.add("Shivam");
		al.add("Pralay");
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Aniket");
		al2.add("Kailash");
		al2.add("Vishal");
		al2.add("Hrishikesh");
		
		for(int i=0;i<al.size();i++) {
			for(int j=0;j<al2.size();j++) {
				if(al.get(i).equals(al2.get(j))) {
					System.out.println(al.get(i));
				}
			}
		}

	}

}
