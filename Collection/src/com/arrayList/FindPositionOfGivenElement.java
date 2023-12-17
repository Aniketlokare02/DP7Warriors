package com.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPositionOfGivenElement {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String Want To Find:");
		String find=ip.next();
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Suraj");
		al.add("Vishal");
		al.add("Shivam");
		al.add("Aniket");
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i).equals(find)) {
				System.out.println(al.get(i)+" Is At "+(i+1)+" Position.");
			}
		}

	}

}
