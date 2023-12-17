package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		//List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(22);
		list.add(65);
		list.add(90);
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			int data=list.get(i)+10;
			list.set(i, data);
		}
		
		System.out.println(list);

	}

}
