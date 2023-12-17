package com.arrays;

import java.util.Arrays;

public class ShiftNagativeLeft {
	
	static int[] shiftNagativeLeft(int[] arr) {
		int count=0;
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
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
		
		int[] arr= {1,2,-1,3,-2,-3};
		System.out.println("Before:"+Arrays.toString(arr));
		
		System.out.println("----------------------------");
		
		System.out.println("After:"+Arrays.toString(shiftNagativeLeft(arr)));

	}

}
