package com.basics;

public class SecondHighest {

static void secondHighest(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				//swapping
				if(arr[i]>arr[j]) {  //ascending with bubble sorting
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5};
		secondHighest(arr);
		System.out.println(arr[arr.length-2]);

	}

}
