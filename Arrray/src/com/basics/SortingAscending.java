package com.basics;

import java.util.Arrays;

public class SortingAscending {

	static void sortingAscending(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				//swapping
				if(arr[i]>arr[j]) {  //ascending with bubble sorting
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {8,5,7,9,4,2,3};
		
		System.out.println("Before:"+Arrays.toString(arr));
		sortingAscending(arr);
		System.out.println("After:"+Arrays.toString(arr));

	}

}
