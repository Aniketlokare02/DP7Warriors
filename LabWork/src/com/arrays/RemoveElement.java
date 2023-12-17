package com.arrays;

import java.util.Scanner;

public class RemoveElement {
	
	static void removeElement(int[] arr, int size) {
		for(int i=0;i<size;i++) {
			arr[i+1]=arr[i];
			System.out.println(arr[i]);
			System.out.println(arr[i+1]);
		}
		size--;
		System.out.println("---");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=ip.nextInt();
		
		for(int i=0;i<size;i++) {
			arr[i]=ip.nextInt();
		}
		
		removeElement(arr, size);

	}

}
