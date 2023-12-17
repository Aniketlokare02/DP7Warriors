package com.arrays;

public class PrimeNoFromArray {

	static int sum=0;
	
	static void primeFromArray(int num) {
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			sum+=num;
			System.out.println("Prime Number:"+num);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {7,4,5,6,11};
		
		for(int i=0;i<arr.length;i++) {
			primeFromArray(arr[i]);
		}
		System.out.println("Sum Of Prime Numbers:"+sum);

	}

}
