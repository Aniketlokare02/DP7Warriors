package com.arrays;

import java.util.Arrays;

public class ShiftZeroLeft {
	
	static int[] shiftZeroRight(int[] arr) {
		int count=0;
		int[] arr1=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}
	
	static int[] shiftZeroLeft(int[] arr) {
		int count=0;
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,0,12,0,2,0,3};
		System.out.println("Before:"+Arrays.toString(arr));
		
		System.out.println("----------------------------");
		
		System.out.println("After:"+Arrays.toString(shiftZeroLeft(arr)));
		
		System.out.println("----------------------------");
		
		System.out.println("After:"+Arrays.toString(shiftZeroRight(arr))); 

	}

}
