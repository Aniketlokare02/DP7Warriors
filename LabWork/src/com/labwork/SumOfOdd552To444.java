package com.labwork;

import java.util.Scanner;

public class SumOfOdd552To444 {

	public static void main(String[] args) {
		//Scanner ip=new Scanner(System.in);
		//System.out.print("Enter The Number:");
		
		
		int sum=0;
		int count=0;
		for(int i=552;i>=444;i--) {
			if(i%2!=0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("Count Of Odd Number:"+count);
		System.out.println("Sum Of Odd Number:"+sum);
		

	}

}
