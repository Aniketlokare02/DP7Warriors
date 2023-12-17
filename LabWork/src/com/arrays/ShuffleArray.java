package com.arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int j = r.nextInt(arr.length);
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
