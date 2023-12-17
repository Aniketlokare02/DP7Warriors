package com.basics;

import java.util.Arrays;

public class RotateOnceLeft {
	
static void rotateOnce(int[] arr) {
		
		int firstE=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=firstE;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7};
		
		System.out.println("Before:");
		System.out.println(Arrays.toString(arr));
		rotateOnce(arr);
		System.out.println(Arrays.toString(arr));

	}

}
