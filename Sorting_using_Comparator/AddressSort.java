package com.te.javabasics.collection.Assignment;

import java.util.Comparator;

public class AddressSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.add.compareTo(o2.name);
	}

}
