package com.arrays;

public class MaxCharFromArray {

	static char maxCharFromArray(char[] arr) {

		char max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		char[] arr= {'a','g','c','d'};
		
		System.out.println("Maximum Character of Array:"+maxCharFromArray(arr));

	}

}
