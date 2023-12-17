package com.patterns;

public class AlphaPatternLeftAngle {

	public static void main(String[] args) {
		
		char c='A';
		for(int i=1;i<=5;i++) {
			for(char j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
