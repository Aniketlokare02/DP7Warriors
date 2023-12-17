package com.arrayOfObject;

public class MaxMarksStudent {

	static void maxMarks(Student[] arr) {

		Student st = new Student();

		float maxMarks = Float.MIN_VALUE;

		for (Student s : arr) {
			if (s.getMarks() > maxMarks) {
				maxMarks = s.getMarks();
				st = s;
			}
		}
		System.out.println(st);
	}

	static void sortByMarks(Student[] arr) {

		Student s = new Student(); // temp

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getMarks() < arr[j].getMarks()) {
					s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
			}
		}
	}

	public static void main(String[] args) {

		Student[] arr = new Student[5];

		arr[0] = new Student(1, "Aniket", 95.5f);
		arr[1] = new Student(2, "Hrishikesh", 90.2f);
		arr[2] = new Student(3, "Suraj", 85.5f);
		arr[3] = new Student(4, "Pralay", 87.4f);
		arr[4] = new Student(5, "Shivam", 89.9f);

		for (Student s : arr) {
			System.out.println(s);
		}

		System.out.println("-----------------------------------");
		maxMarks(arr);
		
		for (Student s : arr) {
			System.out.println(s);
		}

	}

}
