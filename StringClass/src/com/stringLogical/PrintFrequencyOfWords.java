package com.stringLogical;

public class PrintFrequencyOfWords {
	
	static void findFrequency(String s) {
		
		String[] arr=s.split(" ");
		int count;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="Visited")
				continue;
			count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					arr[j]="Visited";
				}
			}
			System.out.println(arr[i]+"--->"+count);
		}
	}

	public static void main(String[] args) {
		
		String s="A big cat is rolling on a big mat";
		findFrequency(s);

	}

}
