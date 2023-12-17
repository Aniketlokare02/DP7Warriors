package com.stringLogical;

import java.util.Scanner;

public class AnagramString {
	
	static void sortCharacter(char[] ch) {
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	static boolean checkAnagram(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
			return false;
		else {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			sortCharacter(ch1);
			sortCharacter(ch2);
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Word1:");
		String word1=ip.next();
		
		System.out.println("Enter Word2:");
		String word2=ip.next();
		
		if(checkAnagram(word1, word2)) {
			System.out.println("Strings Are Anagram.");
		}
		else {
			System.out.println("Strings Are Not Anagram.");
		}

	}

}
