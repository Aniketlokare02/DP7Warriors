package com.basics;

import java.util.Arrays;

public class MergeAlternative {
	
static int[] mergeArray(int[] arr1, int[] arr2) {
		
		int[] merge=new int[arr1.length+arr2.length];
		
		int index=0;
		int maxLenth=Math.max(arr1.length, arr2.length);
		
		for(int i=0;i<maxLenth;i++) {
			if(i<arr1.length) {
				merge[index]=arr1[i];
				index++;
			}
			if(i<arr2.length) {
				merge[index]=arr2[i];
				index++;
			}
		}
		return merge;
	}

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {11,12,13};
		
		int[] mer=mergeArray(arr1, arr2);
		System.out.println(Arrays.toString(mer));

	}

}
