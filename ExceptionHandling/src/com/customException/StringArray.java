package com.customException;

public class StringArray {

	public static void main(String[] args) throws InvalidStringException{
		
		String[] sarr= {"C", "Java", "Angular", "Python"};
		
		for (int i = 0; i < sarr.length; i++) {
			
				if (sarr[i].length() < 3) {
					System.out.println(sarr[i]);
					throw new InvalidStringException("Invalid String Exception");
					//System.out.println(sarr[i]);
				}
			
			System.out.println(sarr[i]);
		}

	}

}
