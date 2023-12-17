package com.basics;

import java.util.Scanner;

public class MaxEleOfArray {

	static int maxElement(int[] arr) {                                  
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=ip.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=ip.nextInt();
		}
		
		System.out.println("Max Element of Array is:"+maxElement(arr));
	}

}
