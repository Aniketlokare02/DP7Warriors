package com.stringLogical;

public class PrintUniqueElement {
	
	static void printUnique(String[] s1, String[] s2) {
		boolean found;
		for(String s:s2) {
			found=false;
			for(String si:s1) {
				if(s.equals(si)) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		
		String[] s1= {"Aniket","Hrishi","Suraj","Shivam"};
		
		String[] s2= {"Pralay","Kailas","Shivam","Vishal","Suraj","Anuj"};
		
		printUnique(s1, s2);

	}

}
