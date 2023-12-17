package com.interThreadComm;

class SharedRes {

	public synchronized void methodOne() {

		System.out.println(Thread.currentThread().getName() + " has Locked Method One.");
		System.out.println(Thread.currentThread().getName() + " has Released Method One.");

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has Finished The Task.");
	}

	public synchronized void methodTwo() {
	
		notifyAll();

		System.out.println(Thread.currentThread().getName() + " has Notified.");
	}
}

public class InterThreadComm2 {

	public static void main(String[] args) {
		SharedRes s=new SharedRes();
		
		Thread t1=new Thread()
				{
					public void run() {
						s.methodOne();
					}
				};
				
		Thread t2=new Thread()
				{
					public void run() {
						s.methodOne();
					}
				};
				
		Thread t3=new Thread()
				{
					public void run() {
						try {
							Thread.sleep(1500);
						} 
						catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						s.methodTwo();
					}
				};
				
		t1.start();
		t2.start();
		t3.start();

	}

}
