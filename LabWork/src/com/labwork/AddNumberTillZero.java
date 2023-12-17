package com.labwork;

import java.util.Scanner;

public class AddNumberTillZero {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		int sum=0; 
		while(true) {
			System.out.print("Enter The Number:");
			int num=ip.nextInt();
			sum+=num;
			if(num==0) {
				break;
			}
		}
		System.out.println("Sum:"+sum);

	}

}
