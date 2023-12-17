package com.arrayList;

import java.util.ArrayList;

// Q4. Create a arraylist of Double using all three constructors of arraylist

public class CreateArrayListUsing3Constructor {

	public static void main(String[] args) {
		
		//1st way
		ArrayList<Double> al=new ArrayList<>();
		al.add(55.5);
		al.add(65.5);
		al.add(75.5);
		System.out.println(al);
		
		System.out.println("------------------");
		ArrayList<Double> al2=new ArrayList<>(3);
		al2.add(5.5);
		al2.add(15.5);
		al2.add(25.5);
		System.out.println(al2);
		System.out.println("------------------");
		
		ArrayList<Double> al3=new ArrayList<>(al2);
		al3.addAll(al);
		System.out.println(al3);

	}

}
