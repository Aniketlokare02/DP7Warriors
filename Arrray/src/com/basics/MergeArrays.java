package com.basics;

import java.util.Arrays;

public class MergeArrays {
	
	static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int[] merge=new int[arr1.length+arr2.length];
		
		int i=0;
		for(int j=0;j<arr1.length;j++) {
			merge[i]=arr1[j];
			i++;
		}
		
		for(int j=0;j<arr2.length;j++) {
			merge[i]=arr2[j];
			i++;
		}
		return merge;
	}

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10};
		
		int[] mar=mergeArray(arr1, arr2);
		System.out.println(Arrays.toString(mar));

	}

}
