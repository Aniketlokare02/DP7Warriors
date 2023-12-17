package com.labwork;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		
		
		int fixed=35;
		int count=0;
		while(true) {
			int num=ip.nextInt();
			count++;
			if(fixed<num) {
				System.out.println("You Guesssed Higher Number. Guess Another.");
			}
			else if(fixed>num) {
				System.out.println("You Guessed Lower Number. Guess Another.");
			}
			else {
				System.out.println("Congrasulation..You Guessed Correct Number.");
				System.out.println("You Took "+count+" Attempts.");
				break;
			}
		}

	}

}
