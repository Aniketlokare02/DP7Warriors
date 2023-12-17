package com.stringLogical;

public class PrintMostRepeatedWord {
	
	static void findMostRepeatedWord(String s) {
		String[] arr=s.split(" ");
		int count;
		String word=null;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="Visited")
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr[j]="Visited";
				}
			}
			if(count>max) {
				max=count;
				word=arr[i];
				
			}
		}
		System.out.println("Most Repeated:"+word+"--->"+max);
	}
	
	static void uniqueWord(String s) {
		String[] arr=s.split(" ");
		int count;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="Visited")
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr[j]="Visited";
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				
			}
		}
	}
	
	static void duplicateWord(String s) {
		String[] arr=s.split(" ");
		int count;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=="Visited")
				continue;
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
					arr[j]="Visited";
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
				
			}
		}
	}

	public static void main(String[] args) {
		
		String s="I love my India because my country is India and my country is great";
		findMostRepeatedWord(s);
		System.out.println("--------");
		uniqueWord(s);
		System.out.println("---------");
		duplicateWord(s);

	}

}
