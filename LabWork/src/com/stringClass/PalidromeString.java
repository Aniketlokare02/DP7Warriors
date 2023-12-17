package com.stringClass;

import java.util.Scanner;

public class PalidromeString {
	
	static String palindrome(String s) {
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.next();
		s=s.toLowerCase();
		
		if(s.equals(palindrome(s))) {
			System.out.println(s+" is Palindrome String.");
		}
		else {
			System.out.println(s+" is Not Palindrome String.");
		}

	}

}
