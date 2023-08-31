package com.labwork;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" is Factor of "+num);
			}
		}

	}

}
