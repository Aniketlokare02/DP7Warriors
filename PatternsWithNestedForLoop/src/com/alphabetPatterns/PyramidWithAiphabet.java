package com.alphabetPatterns;

public class PyramidWithAiphabet {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}

}
