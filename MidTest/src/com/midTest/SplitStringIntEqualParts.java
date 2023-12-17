package com.midTest;

public class SplitStringIntEqualParts {
	
	static void splitString(String s, int noOfParts) {
		
		int len=s.length()/noOfParts;
		String s1="";
		for(int i=0;i<len;i+=noOfParts) {
			s1=s1+s.split(s, i+noOfParts);
		}
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		
		String s="I Like Java";
		
		int noOfParts=2;
		
		splitString(s, noOfParts);
		

	}

}
