package com.stringLogical;

import java.util.Scanner;

public class ReplaceDuplicate {
	
	static String replaceDuplicate(String s) {
		
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]='$';
				}
			}
		}
		s=new String(arr);
		return s;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Word:");
		String word=ip.next();
		
		System.out.println("Orignal Word:"+word);
		word=replaceDuplicate(word);
		System.out.println("New Word:"+word);
		

	}

}
