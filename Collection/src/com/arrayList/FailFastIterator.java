package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");
		
		//reomove Angular
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Angular")) {
				//al.remove("Angular"); // ConcurrentModificationException
				itr.remove();
			}
		}
		System.out.println(al);

	}

}
