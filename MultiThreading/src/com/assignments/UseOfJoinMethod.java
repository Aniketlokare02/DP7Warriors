package com.assignments;

public class UseOfJoinMethod {
	
	public void print(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		UseOfJoinMethod j=new UseOfJoinMethod();
		
		Thread t1=new Thread()
				{
					public void run() {
						j.print(5);
					}
				};
				
		Thread t2=new Thread()
				{
					public void run() {
						j.print(7);
					}
				};
				
		Thread t3=new Thread()
				{
					public void run() {
						j.print(2);
					}
				};
				
		Thread t4=new Thread()
				{
					public void run() {
						j.print(3);
					}
				};
				
		t1.start();
		t1.join();
		t2.start();
		t2.join(1500);
		t3.start();
		t3.join(1500, 15000);
		t4.start();

	}

}
