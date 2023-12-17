package com.basics;

public class PrintDuplicateEle {
	
	static void findDuplicateEle(char[] arr) {
		int count;
		for(int i=0;i<arr.length;i++) {
			count=1;
			if(arr[i]=='\0')
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='\0';
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		char[] arr= {'a','e','b','a','v'};
		System.out.println("Duplicate Element:");
		findDuplicateEle(arr);

	}

}
