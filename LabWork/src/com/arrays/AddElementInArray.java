package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
	
	static void insertElement(int[] arr, int pos, int newValue, int size) {
		
		for(int i=size-1;i>=pos;i--) {
			arr[i+1]=arr[i];
			System.out.println(arr[i]);
			System.out.println(arr[i+1]);
		}
		arr[pos]=newValue;
		size++;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		int[] arr=new int[6];
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=ip.nextInt();
		
		for(int i=0;i<size;i++) {
			arr[i]=ip.nextInt();
		}
		
		insertElement(arr, 2, 100, size);

	}

}
