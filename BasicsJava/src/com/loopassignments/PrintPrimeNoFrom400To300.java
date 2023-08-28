package com.loopassignments;

import java.util.Scanner;

public class PrintPrimeNoFrom400To300 {

	public static void main(String[] args) {
		//Scanner ip=new Scanner(System.in);
		//System.out.print("Enter The Number:");
		//int num=ip.nextInt();
		
		int count=0;
		for(int i=400;i>=300;i--) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
