package com.stringClass;

public class MergeTwoString {
	
	static void mergeTwoString(String s1, String s2) {
		String merge="";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			merge=merge+s1.charAt(i);
			count++;
		}
		merge=" ";
		count++;
		for(int i=0;i<s2.length();i++) {
			merge=merge+s2.charAt(i);
			count++;
		}
		System.out.println(merge);
	}

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Java";
		
		mergeTwoString(s1, s2);

	}

}
