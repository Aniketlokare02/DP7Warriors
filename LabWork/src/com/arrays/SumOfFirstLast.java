package com.arrays;

public class SumOfFirstLast {
	
	static void printSum(int[] arr) {
		int sum=0;
		int count=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			sum=arr[i]+arr[count];
			count--;
			System.out.println("Sum:"+sum);
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		printSum(arr);

	}

}
