package com.basics;

import java.util.Scanner;

public class SearchElement {

	static void findElement(int[] arr, int ele) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(ele==arr[i]) {
				flag=true;
				System.out.println(ele+" Found at:"+i);
				
			}
				
		}
		if(!flag) {
			System.out.println(ele+" Not Found.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Search Element:");
		int ele=ip.nextInt();
		
		int[] arr= {1,2,3,4,5,6,7,8,9};

		findElement(arr, ele);
	}

}
