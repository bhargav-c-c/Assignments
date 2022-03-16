package com.te.javabasics.collections.sets.Assignment;

import java.util.Comparator;

public class SetAgeSort implements Comparator<StudentSet> {

	@Override
	public int compare(StudentSet o1, StudentSet o2) {
		
		return o1.age-o2.age;
	}

}
