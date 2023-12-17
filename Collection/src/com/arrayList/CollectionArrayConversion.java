package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {

	public static void main(String[] args) {
		
		String[] colors= {"Red", "Blue", "Green", "Yellow"};
		//Arrays.sort(colors);
		//System.out.println(Arrays.toString(colors));
		
		//convert array to arraylist
		
		//1st way
		List<String> al=Arrays.asList(colors);
		System.out.println(al);
		
		//2nd way
		ArrayList<String> al2=new ArrayList<>(Arrays.asList(colors));
		System.out.println(al2);
		
		//3rd way
		ArrayList<String> al3=new ArrayList<>();
		Collections.addAll(al3, colors);
		System.out.println(al3);
		
		System.out.println("------------------------------");
		
		//convert arraylist to array
		Object[] col=al2.toArray();
		
		for(int i=0;i<col.length;i++) {
			col[i]=((String) col[i]).concat("Color");
		}
		System.out.println(Arrays.toString(col));
		
		//type safety is not there
		
		//type safe
		String[] cols=new String[al2.size()];
		al2.toArray(cols);
		
		for(int i=0;i<cols.length;i++) {
			cols[i]= cols[i].concat("Color");
		}
		System.out.println(Arrays.toString(cols));

	}

}
