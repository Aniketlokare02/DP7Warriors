package com.arrays;

import java.util.Arrays;

public class ShiftEvenLeft {
	
	static int[] shiftEvenLeft(int[] arr) {
		int count=0;
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		
		int[] arr1=shiftEvenLeft(arr);
		System.out.println(Arrays.toString(arr1));

	}

}
