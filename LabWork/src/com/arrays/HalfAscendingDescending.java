package com.arrays;

import java.util.Arrays;

public class HalfAscendingDescending {

	static int[] sortingAscending(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j<= (arr.length)/2; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			for (int j = arr.length-1;j>arr.length/2;j--) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr= {3,2,1,6,7,9};
		System.out.println("Before"+Arrays.toString(arr));
		
		System.out.println("------------------------");
		
		int[] arr1=sortingAscending(arr);
		System.out.println("After:"+Arrays.toString(arr1));

	}

}
