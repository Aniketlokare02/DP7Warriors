package com.basics;

import java.util.Scanner;

public class SumOfEvenDigit {

	static void sumOfEven(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("Sum Of Even Elements:"+sum);
	}
	
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=ip.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		
		sumOfEven(arr);

	}

}
