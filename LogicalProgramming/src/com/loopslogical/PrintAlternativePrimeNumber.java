package com.loopslogical;

import java.util.Scanner;

public class PrintAlternativePrimeNumber {
	
	static void primeNumber(int num) {
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		for(int i=num;i<=50;i++) {
			primeNumber(i);
		}

	}

}
