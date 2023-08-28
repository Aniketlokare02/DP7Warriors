package com.loopassignments;
import java.util.Scanner;

public class PrintOdd521To229UsingWhile {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=ip.nextInt();
		while(num>=229) {
			System.out.println(num);
			num-=2;
			
		}

	}

}
