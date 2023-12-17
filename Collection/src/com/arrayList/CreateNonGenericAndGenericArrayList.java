package com.arrayList;

import java.util.ArrayList;

// Q5. Create a non generic arraylist and show the usage of creating generics

public class CreateNonGenericAndGenericArrayList {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Aniket");
		al.add(20.5);
		al.add('A');
		
//		 for(int i=0;i<al.size();i++) {
//			 System.out.println(al.get(i));
//			 int data=(int)al.get(i)+10;  // Class Cast Exception
//			 al.set(i, data);
//		 }
		 System.out.println(al);
		 
		 ArrayList<Integer> al2=new ArrayList<>();
		 al2.add(10);
		 al2.add(20);
		 al2.add(30);
		 al2.add(40);
		 
		 for(int i=0;i<al2.size();i++) {
			 System.out.println(al2.get(i));
			 int data=al2.get(i)+10;  
			 al2.set(i, data);
		 }
		 System.out.println(al2);

	}

}
