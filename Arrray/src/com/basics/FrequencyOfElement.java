package com.basics;

public class FrequencyOfElement {
	
	static void findFrequency(int[] arr) {
		
		int count;
		boolean visited=false;
		
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
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,1,5,3,6,7,2,1};
		
		findFrequency(arr);

	}

}
