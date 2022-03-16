package com.te.javabasics.collections.sets.Assignment;

import java.util.Objects;

public class StudentSet {

	int roll;
	String name;
	int age;
	int marks;
	String add;

	public StudentSet(int roll, String name, int age, int marks, String add) {

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

	@Override
	public int hashCode() {

		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSet other = (StudentSet) obj;
		/*
		 * if (add == null) { if (other.add != null) return false; } else if
		 * (!add.equals(other.add)) return false; if (age != other.age) return false; if
		 * (marks != other.marks) return false; if (name == null) { if (other.name !=
		 * null) return false; } else if (!name.equals(other.name)) return false;
		 */
		if (roll != other.roll)
			return false;
		return true;
	}

}
