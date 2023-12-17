package com.stringClass;

import java.util.Arrays;

public class PrintStringChar {

	static void replacevowel(String s) {
		char[] arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				arr[i] = '$';
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	
	static void replaceVowelWithCaps(String s) {
		char[] arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				arr[i]-=32;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		String s = "hello";

		System.out.println(s);
		System.out.println("--------------");
		replacevowel(s);
		System.out.println("---------------");
		replaceVowelWithCaps(s);

	}

}
