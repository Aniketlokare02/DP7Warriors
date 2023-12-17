package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

//18.WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

public class AddAndPrint1To50EvenNo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<50;i++) {
			al.add(i+1);
		}
		System.out.println(al);
		
		Iterator<Integer> ali=al.iterator();
		
		while(ali.hasNext()) {
			int num=ali.next();
			if(num%2==0) {
				System.out.println(num);
			}
		}
		System.out.println("----");
		
		for(int i=0;i<50;i++) {
			if(al.get(i)%2==0) {
				System.out.println(al.get(i));
			}
		}
		System.out.println("----");
		
		for(Integer i:al) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
