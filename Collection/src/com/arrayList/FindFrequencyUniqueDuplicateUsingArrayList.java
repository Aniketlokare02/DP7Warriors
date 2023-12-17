package com.arrayList;

import java.util.ArrayList;

public class FindFrequencyUniqueDuplicateUsingArrayList {
	
	static void findFrequency(ArrayList<String> al) {
		
		int count;
		for(int i=0;i<al.size();i++) {
			count=1;
			if(al.get(i)=="Visited")
				continue;
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					count++;
					al.set(j, "Visited");
				}
			}
			System.out.println(al.get(i)+"--->"+count);
		}
	}
	
	static void findUnique(ArrayList<String> al) {

		int count;
		for (int i = 0; i < al.size(); i++) {
			count = 1;
			if (al.get(i) == "Visited")
				continue;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					count++;
					al.set(j, "Visited");
				}
			}
			if (count == 1)
				System.out.println(al.get(i) + "--->" + count);
		}
	}
	
	static void findDuplicate(ArrayList<String> al) {

		int count;
		for (int i = 0; i < al.size(); i++) {
			count = 1;
			if (al.get(i) == "Visited")
				continue;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					count++;
					al.set(j, "Visited");
				}
			}
			if (count > 1)
				System.out.println(al.get(i) + "--->" + count);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("A");
		
		//findFrequency(al);
		//findUnique(al);
		findDuplicate(al);

	}

}
