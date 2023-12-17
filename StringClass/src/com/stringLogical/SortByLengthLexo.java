package com.stringLogical;

import java.util.Arrays;

public class SortByLengthLexo {
	
	static void sortByLengthLexo(String[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].length()==arr[j].length()) {
					if(arr[i].compareTo(arr[j])>0) {
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				else {
					if(arr[i].length()>arr[j].length()) {
						String temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		
		String[] arr= {"Java","C","Devops","Angular","Python"};
		
		System.out.println("Before Sort:"+Arrays.toString(arr));
		sortByLengthLexo(arr);
		System.out.println("After Sort:"+Arrays.toString(arr));

	}

}
