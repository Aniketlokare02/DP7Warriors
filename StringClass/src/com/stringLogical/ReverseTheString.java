package com.stringLogical;

public class ReverseTheString {
	
	static void reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("After: "+rev);
	}

	public static void main(String[] args) {
		
		String s="I like to learn Java";
		System.out.println("Before: "+s);
		reverseString(s);

	}

}
