package com.basics;

public class FindSum {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,15,45};
		int sum=0;
		for (int i : arr) {
			if(i%3==0 && i%5==0) {
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
