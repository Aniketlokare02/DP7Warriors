package com.loops;

import java.util.Scanner;

public class Print3Or5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Bye");
			} 
			else if (i % 3 == 0) {
				System.out.println("Hello");
			} 
			else if (i % 5 == 0) {
				System.out.println("Welcome");
			} 
			else {
				System.out.println(i);
			}
		}

	}

}
