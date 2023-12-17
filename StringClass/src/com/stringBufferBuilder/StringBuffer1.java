package com.stringBufferBuilder;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer(10);
		System.out.println(sb1.capacity());
		
		sb1.append("Hello Java");
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.replace(0, 5, "Welcome"));
		
		sb1.insert(12, " Developer");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		
		System.out.println(sb1.charAt(0));
		
		System.out.println(sb1.deleteCharAt(6));
		
		System.out.println(sb1.indexOf("Java"));
		
		sb1.setCharAt(6, 'e');
		System.out.println(sb1);
		sb1.setCharAt(7, ' ');
		System.out.println(sb1);
		
		System.out.println(sb1.substring(8));
		System.out.println(sb1.substring(3, 12));

	}

}
