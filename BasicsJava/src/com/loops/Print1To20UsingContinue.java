package com.loops;

public class Print1To20UsingContinue {

	public static void main(String[] args) {
		
		for(int i=0;i<=20;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}

	}

}
