package com.extra;

import java.lang.reflect.Executable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyGame implements Runnable{
	
	private String taskName;
	
	public MyGame() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyGame(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		Date d=new Date();
		SimpleDateFormat sf=new SimpleDateFormat();
		for(int i=0;i<5;i++) {
			
			if(i==0) {
				System.out.println("<<Initialized:"+i+">>"+taskName+" ->"+sf.format(d));
			}
			else {
				System.out.println("<<Initialized:"+i+">>"+taskName+" ->"+sf.format(d));
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("<<Completed Task:>>"+taskName+" ->"+sf.format(d));
		
	}
	public static void main(String[] args) {
		
		Runnable r1=new MyGame("Play Music");
		Runnable r2=new MyGame("Score Points");
		Runnable r3=new MyGame("Move Car");
		Runnable r4=new MyGame("Accelerate");
		Runnable r5=new MyGame("Apply Bakes");
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		ex.execute(r5);
		
		ex.shutdown();
			
			
	}

}
