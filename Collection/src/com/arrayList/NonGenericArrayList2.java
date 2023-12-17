package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList2 {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(12);
		list.add("Aniket");
		list.add(55.6f);
		list.add('A');
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			int data=(int)list.get(i)+10;// Class Cast Exception
			list.set(i, data);
		}
		
		System.out.println(list);

	}

}
