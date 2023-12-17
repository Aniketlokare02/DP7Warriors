package com.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Float> ad=new ArrayDeque<>();
		
		//ad.add(null); // not allows null
		ad.add(52.3f);
		ad.offer(45.3f);
		ad.addFirst(65.3f);
		
		//duplicate allowed
		//insertion order maintained
		System.out.println(ad);
		
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.removeLast());
		
		ad.push(25.6f); // addFirst()
		System.out.println(ad);
		
		ad.push(35.4f);
		System.out.println(ad);
		
		System.out.println(ad.pop());// removeFirst()

	}

}
