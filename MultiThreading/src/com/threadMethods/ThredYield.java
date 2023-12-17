package com.threadMethods;

public class ThredYield extends Thread{
	
	public void run() {
		
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i+"--> is running");
		}
	}

	public static void main(String[] args) {
		
		ThredYield t1=new ThredYield();
		ThredYield t2=new ThredYield();
		
		t1.start();
		t2.start();
		
		for(int i=0;i<=100;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+i+"--> is running");
		}

	}

}
