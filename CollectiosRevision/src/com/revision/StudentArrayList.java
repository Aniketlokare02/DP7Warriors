package com.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1, "Aniket", 90.5f));
		list.add(new Student(2, "Hrishikesh", 85.6f));
		list.add(new Student(3, "Suraj", 95.4f));
		list.add(new Student(4, "Pralay", 90.5f));
		
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------");
		
		ListIterator<Student> litr=list.listIterator(list.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("------------------------");
		
		Collections.sort(list, new MarksComparator());
		for(Student s : list) {
			System.out.println(s);
		}

	}

}
