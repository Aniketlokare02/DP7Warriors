package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntegerSort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o2-o1);
	}
	
}

public class IntegerSortingReverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(7);
		al.add(10);
		al.add(-3);
		al.add(1);
		al.add(5);
		
		System.out.println(al);
		Collections.sort(al, new IntegerSort()); // ascending
		System.out.println(al);

	}

}
