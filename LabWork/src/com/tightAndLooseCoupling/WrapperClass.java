package com.tightAndLooseCoupling;

public class WrapperClass {

	public static void main(String[] args) {
		
		int num=20;
		char c='a';
		String s="123";
		
		Integer i=Integer.valueOf(c);
		System.out.println(i);
		int a=Integer.parseInt(s);
		System.out.println(a);
		System.out.println(Integer.max(10, 20));
		Character c1=Character.valueOf(c);
		System.out.println(c1);
		Integer j=num;
		System.out.println(j);
		Integer a1=Integer.valueOf(c);
		System.out.println(a1);

	}

}
