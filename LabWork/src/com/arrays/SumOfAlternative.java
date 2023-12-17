package com.arrays;

public class SumOfAlternative {

	static int sumOfAlternative(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,5,8,6,4,9};
		
		System.out.println("Sum Of Alternative Element:"+sumOfAlternative(arr));

	}

}
