package com.alphabetPatterns;

public class PyramidWithAlphabet1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i+=2) {
			
			for(int j=1;j<=(7-i);j++) {
				System.out.print(" ");
			}
			
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			System.out.println();
		}
	}

}
