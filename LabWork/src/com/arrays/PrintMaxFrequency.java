package com.arrays;

import java.util.Scanner;

public class PrintMaxFrequency {
	
	static void maxFrequency(int[] arr) {
		int count;
		int ele=0;
		boolean visited=false;
		int maxFre=0;
		for(int i=0;i<arr.length;i++) {
			count=1;
			visited=false;
			
			//checking if element is compared or not
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					visited=true;
					break;
				}
			}   
			
			if(visited==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k]) {
						count++;
					}
				}
				System.out.println(arr[i]+"--->"+count);
			}
			if(count>maxFre) {
				maxFre=count;
				ele=arr[i];
			}
			
		}
		System.out.println("Maximum Frequency is:"+ele+"-->"+maxFre);	
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,1,2,2,2,3,4,1,1};
		maxFrequency(arr);

	}

}
