package com.loopslogical;

import java.util.Scanner;

public class PerfectNumber {
	
	static int perfectNumber(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		if(num==perfectNumber(num)) {
			System.out.println(num+" is a Perfect Number.");
		}
		else {
			System.out.println(num+" is Not a Perfect Number.");
		}

	}

}
