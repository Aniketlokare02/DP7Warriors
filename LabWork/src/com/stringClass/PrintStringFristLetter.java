package com.stringClass;

import java.util.Scanner;

public class PrintStringFristLetter {
	
	static void stringFirstLetter(String s) {
		
		String[] st=s.split(" ");
		String s1="";
		for(int i=0;i<st.length;i++) {
			if(i==st.length-1) {
				s1+=st[i];
			}
			else {
				s1+=st[i].charAt(0);
				s1+=".";
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.nextLine();
		stringFirstLetter(s);

	}

}
