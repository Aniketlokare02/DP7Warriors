package com.arrayList;

import java.util.ArrayList;

public class SortingUsingArrayList {
	
	static void sortArrayList(ArrayList<Integer> al) {
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)) {
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(8);
		al.add(5);
		al.add(10);
		al.add(12);
		al.add(9);
		al.add(20);
		al.add(15);
		al.add(1);
		al.add(6);
		
		System.out.println("Before : "+al);
		sortArrayList(al);
		System.out.println("After : "+al);

	}

}
