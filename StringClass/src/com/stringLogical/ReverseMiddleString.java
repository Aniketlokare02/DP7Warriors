package com.stringLogical;

public class ReverseMiddleString {

	static void reverseMiddle(String s) {
		
		String[] s1=s.split(" ");
		String rev="";
//		rev=rev+s1[0]+" ";
//		rev=rev+" ";
		for(int i=0;i<s1.length-1;i++) {
			for(int j=s1[i].length()-1;j>=0;j--) {
				rev=rev+s1[i].charAt(j);
			}
			rev=rev+" ";
		}
		rev=rev+s1[s1.length-1];
		System.out.println("After: "+rev);
		
	}

	public static void main(String[] args) {
		
		String s="I like to learn Java";
		System.out.println("Before: "+s);
		
		reverseMiddle(s);

	}

}
