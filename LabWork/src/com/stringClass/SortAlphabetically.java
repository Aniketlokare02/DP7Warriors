package com.stringClass;

import java.util.Scanner;

public class SortAlphabetically {
	
	static void sortAlpha(String s) {
		char[] ch=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]>ch[i+1]) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Sorted.");
		}
		else {
			System.out.println("Not Sorted.");
		}
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.next();
		sortAlpha(s);

	}

}
