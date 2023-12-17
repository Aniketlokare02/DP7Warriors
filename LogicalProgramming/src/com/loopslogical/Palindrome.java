package com.loopslogical;

public class Palindrome { 
	
	static void checkPalindrome(int num) {
		int orignal=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		if(rev==orignal) {
			System.out.println(rev+" is Palindrome.");
		}
		else {
			System.out.println(rev+" is Not a Palindrome.");
		}
	}

	public static void main(String[] args) {
		
		checkPalindrome(1221);

	}

}
