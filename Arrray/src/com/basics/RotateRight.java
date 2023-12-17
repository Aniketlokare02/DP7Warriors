package com.basics;

import java.util.Arrays;

public class RotateRight {
	
	static void rotateOnce(int[] arr) {
		
		int lastE=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=lastE;
	}

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7};
		
		System.out.println("Before:");
		System.out.println(Arrays.toString(arr));
		rotateOnce(arr);
		System.out.println(Arrays.toString(arr));

	}

}
