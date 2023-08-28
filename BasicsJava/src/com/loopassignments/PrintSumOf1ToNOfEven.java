package com.loopassignments;

import java.util.Scanner;

public class PrintSumOf1ToNOfEven {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
	
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum Of Even Number From 1 To N"+sum);

	}

}
