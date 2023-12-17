package com.alphabetPatterns;

public class PyramidWithAB {

	public static void main(String[] args) {
		
		String s="ab";
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= (3 - i); j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print(s+"");
			}
			System.out.println();
		}

	}

}
