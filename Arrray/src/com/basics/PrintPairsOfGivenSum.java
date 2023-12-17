package com.basics;

public class PrintPairsOfGivenSum {
	
	static void printPairsOfGivenSum(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>sum)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j]==sum)) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		int sum=7;
		printPairsOfGivenSum(arr, sum);

	}

}
