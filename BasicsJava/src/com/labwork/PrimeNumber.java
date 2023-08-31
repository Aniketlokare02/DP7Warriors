package com.labwork;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=ip.nextInt();
		boolean flag=false;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(num+" is Prime Number.");
		}
		else {
			System.out.println(num+" is Not Prime Number.");
		}

	}

}
