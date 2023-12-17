package com.stringClass;

public class DiffOfEquals {

	public static void main(String[] args) {
		
		String s1="Aniket";
		String s2=s1;
		System.out.println(s1.equals(s2));
		System.out.println("-------");
		String s3=s1;
		String s4="Hrishi";
		System.out.println(s3.equals(s4));
		System.out.println("---------");
		System.out.println(s3==s4);
		System.out.println("---------");
		System.out.println(s1==s2);
		System.out.println("---------");
		String s5=new String("Aniket");
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));

	}

}
