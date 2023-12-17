package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

//22.WAP of swap two elements in an ArrayList

public class SwapTwoElementsInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println("Before Swap:"+al);
		Collections.swap(al, 0, 2);
		System.out.println("After Swap:"+al);
		
		int num=al.get(0);
		al.set(0, al.get(2));
		al.set(2, num);
		
		System.out.println(al);

	}

}
