package com.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderMap {

	public static void main(String[] args) {
		
		TreeMap<Customer, Order> tmap=new TreeMap<>(new MnoComparator());
		tmap.put(new Customer(1, "Aniket", 9740943250l), new Order(101, "Laptop", 53000));
		tmap.put(new Customer(1, "Aniket", 9740253250l), new Order(102, "Mobile", 30000));
		tmap.put(new Customer(2, "Hrishikesh", 9740942140l), new Order(103, "PenDrive", 850));
		tmap.put(new Customer(3, "Suraj", 9723543250l), new Order(104, "HaedDisk", 1200));
		tmap.put(new Customer(4, "Pralay", 9740974560l), new Order(105, "Charger", 530));
		tmap.put(new Customer(5, "Shivam", 9740987950l), new Order(106, "HeapPhone", 4500));
		
		for(Map.Entry<Customer, Order> e : tmap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("-----------------------");
		}

	}

}
