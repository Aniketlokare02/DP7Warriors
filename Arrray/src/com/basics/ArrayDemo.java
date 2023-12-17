package com.basics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.print("Enter the size:");
		int size=ip.nextInt();
		
		int[] arr=new int[size];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			sum+=arr[i];
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
		System.out.println("Sum of Array:"+sum);

	}

}
