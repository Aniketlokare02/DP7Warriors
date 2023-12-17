package com.midTest;

import java.util.Arrays;

public class ReversetheStringWordByWord {
	
	static void reverseTheStringByWord(String s) {
		String[] arr=s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				s1=s1+arr[i].charAt(j);
			}
			s1=s1+" ";
		}
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		
		String s="I Like Learn To Java";
		reverseTheStringByWord(s);

	}

}
