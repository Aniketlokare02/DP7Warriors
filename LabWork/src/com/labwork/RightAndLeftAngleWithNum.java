package com.labwork;

public class RightAndLeftAngleWithNum {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 2*(5 - i); j++) {
				System.out.print("");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			//int n=1;
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				//i--;
				//n++;
			}
			
			System.out.println();
		}

	}
}
