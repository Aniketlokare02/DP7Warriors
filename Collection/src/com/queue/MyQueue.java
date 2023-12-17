package com.queue;

public class MyQueue {
	
	int front, rear;
	int size;
	int[] arr;
	
	public MyQueue() {
		
	}
	
	public MyQueue(int size) {
		front=0;
		rear=0;
		this.size=size;
		arr=new int[this.size];
	}
	
	void insert(int data) {
		if(rear<size) {
			arr[rear]=data;
			rear++;
			System.out.println("Element is Inserted.");
		}
		else {
			System.out.println("Queue is Full.");
		}
	}
	
	void delete() {
		int temp;
		if(rear>front) {
			System.out.println("Element is Deleted:"+arr[front]);
			
			for(temp=front;temp<rear-1;temp++) {
				
				arr[temp]=arr[temp+1];
			}
			arr[--rear]=0;
		}
		else {
			System.out.println("Queue is Empty.");
		}
	}
	
	void display() {
		if(rear>front) {
			for(int i=front;i<rear;i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Queue is Empty.");
		}
	}

	public static void main(String[] args) {
		
		MyQueue q=new MyQueue(5);
		q.display();
		
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		
		q.display();

	}

}
