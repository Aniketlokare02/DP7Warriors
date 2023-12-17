package com.assignments;

//10.Thread t1 prints numbers 1 to 10 .Thread t2 prints characters a to h. Ensure that always 
//characters are printed first and then numbers using join method.
public class PrintNumberCharacter {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread()
				{
					public void run() {
						for(int i=1;i<=10;i++) {
							System.out.println(i);
						}
					}
				};
		
		Thread t2=new Thread()
				{
					public void run() {
						for(char i='a';i<='h';i++) {
							System.out.println(i);
						}
					}
				};
		
		t2.start();
		t2.join();
		t1.start();

	}

}
