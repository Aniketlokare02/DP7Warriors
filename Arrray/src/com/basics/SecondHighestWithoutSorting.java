package com.basics;

public class SecondHighestWithoutSorting {
	
	static int secondhighest(int[] arr) {
		
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				shighest=highest;
				highest=arr[i];
			}
			else if(arr[i]>shighest) {
				shighest=arr[i];
			}
		}
		return shighest;
	}

	public static void main(String[] args) {
		
		int[] arr= {6,7,10,2,4,3,9};
		
		System.out.println("Second Highest:"+secondhighest(arr));

	}

}
