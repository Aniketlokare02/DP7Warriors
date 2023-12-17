package com.basics;

import java.util.Arrays;

public class PassingArray {

	static void sqaureArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,6,7,9,3};
		System.out.println("Before");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After");
		sqaureArray(arr);

	}

}
