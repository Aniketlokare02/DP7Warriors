package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> lang=new Vector<>(5);
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".Net");
		
		System.out.println("--");
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("C++");
		
		System.out.println("--");
		
		System.out.println(lang.capacity());// Doubles
		System.out.println(lang.size());
		
		System.out.println("--------------------------");
		
		System.out.println(lang);
		System.out.println("--------------------------");
		System.out.println(lang.get(4));
		System.out.println(lang.elementAt(0));
		
		System.out.println("--------------------------");
		
		System.out.println(lang.remove(1));
		System.out.println(lang.removeElement("C++"));
		
		System.out.println("----------------------");
		
		System.out.println(lang.set(1, "SpringBoot"));
		System.out.println(lang);
		
		lang.setElementAt("AWS", 2);
		System.out.println(lang);

	}

}
