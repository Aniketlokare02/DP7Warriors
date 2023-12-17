package com.assignments;

//7.WAP to show use of sleep method
public class UseOfSleep extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}

	public static void main(String[] args) {
		
		UseOfSleep t=new UseOfSleep();
		
		t.start();

	}

}
