package com.labwork;

import java.util.Scanner;

public class PrintSeriesNextNumber {
	
	static void nextNumber(int num) {
		int square;
		int nextDigit=0;
		int i=1;
		while(num<10000) {
			square=num*num;
			nextDigit=square-i;
			System.out.println(nextDigit);
			i++;
			num=nextDigit;
		}
		//return nextDigit;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		nextNumber(num);

	}

}
