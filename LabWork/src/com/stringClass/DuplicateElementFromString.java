package com.stringClass;

import java.util.Scanner;

public class DuplicateElementFromString {
	
	static void printDuplicate(String s) {
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.next();
		
		printDuplicate(s);
	}

}
