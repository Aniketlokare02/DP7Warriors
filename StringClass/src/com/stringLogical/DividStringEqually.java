package com.stringLogical;

import java.util.Arrays;

public class DividStringEqually {

	static void dividEqually(String s, int noOfc) {

		int len = s.length();

		int n = len / noOfc;

		String[] arr = new String[n];
		if (len % noOfc != 0) {
			System.out.println("We Cannot Divide.");
		} 
		else {
			int index = 0;
			for (int i = 0; i < len; i += noOfc) {
				arr[index] = s.substring(i, i + noOfc);
				index++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {

		String[] s = { "I", "am", "very", "smart" };

		int noOfc = 2;
		String s1 = String.join(" ", s);
		System.out.println(s1);
		dividEqually(s1, noOfc);

	}

}
