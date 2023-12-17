package com.sortingMap;

import java.util.Comparator;

import com.hashMap.Student;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return (int) (o2.getMarks()-o1.getMarks());
	}

}
