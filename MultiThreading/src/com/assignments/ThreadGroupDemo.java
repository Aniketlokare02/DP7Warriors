package com.assignments;

public class ThreadGroupDemo implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadGroupDemo r=new ThreadGroupDemo();
		
		ThreadGroup tg1=new ThreadGroup("Parent");
		
		Thread t1=new Thread(tg1, r, "Child1");
		Thread t2=new Thread(tg1, r, "Child2");
		
		//tg1.setPriority(MAX_PRIORITY);
		//r.setMaxPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		tg1.list();
		
		System.out.println("Active Threads:"+tg1.activeCount());

	}

}
