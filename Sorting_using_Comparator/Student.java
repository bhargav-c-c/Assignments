package com.te.javabasics.collection.Assignment;

public class Student {

	int roll;
	String name;
	int age;
	int marks;
	String add;

	public Student(int roll, String name, int age, int marks, String add) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.add = add;
	}

	@Override
	public String toString() {
		return "StudentTest [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + ", add=" + add
				+ "]";
	}
	
	

}
