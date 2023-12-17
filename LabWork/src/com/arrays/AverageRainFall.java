package com.arrays;

import java.util.Scanner;

public class AverageRainFall {

	static float averageRainFall(float[] arr) {
		float avg=0;
		float sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=ip.nextInt();
		
		float[] arr=new float[size];
		for(int i=0;i<size;i++) {
			arr[i]=ip.nextFloat();
		}
		
		System.out.println("Average Rain Fall in Week:"+averageRainFall(arr)+" mm.");

	}

}
