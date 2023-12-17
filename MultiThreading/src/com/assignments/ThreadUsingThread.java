package com.assignments;

//1.Create thread by extending Thread class

public class ThreadUsingThread extends Thread{
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadUsingThread t1=new ThreadUsingThread();
		
		t1.start();

	}

}
