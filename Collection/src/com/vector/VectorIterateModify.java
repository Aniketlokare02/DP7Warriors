package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIterateModify {

	public static void main(String[] args) {
		
		Vector<String> lang=new Vector<>(5);
		
		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".Net");
		lang.add("Java");
		
		System.out.println(lang);
		
		Enumeration<String> en=lang.elements();
		while(en.hasMoreElements()) {
			if(en.nextElement().equals("Java"))
				lang.remove("Java");
		}
		
		System.out.println(lang);

	}

}
