package com.stringClass;

import java.util.Scanner;

public class RemoveExtraSpace {
	
	static void removeExtraSpace(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				s1=s1+s.charAt(i);
			}
			else if(s.charAt(i)==' ' && s.charAt(i+1)==' '){
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.nextLine();
		
		System.out.println(s);
		removeExtraSpace(s);

	}

}
