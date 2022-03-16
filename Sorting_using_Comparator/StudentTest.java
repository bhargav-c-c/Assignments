package com.te.javabasics.collection.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		boolean temp = true;

		while (temp) {
			ArrayList<Student> arrayList = new ArrayList<Student>();
			arrayList.add(new Student(101, "Zack", 19, 95, "Calicutt"));
			arrayList.add(new Student(201, "Jason", 20, 60, "London"));
			arrayList.add(new Student(501, "Robert", 21, 90, "New York"));
			arrayList.add(new Student(901, "Charlie", 19, 56, "New Jersey"));
			arrayList.add(new Student(801, "Bhargav", 23, 99, "Dubai"));
			boolean flag = true;
			Scanner sc = new Scanner(System.in);

			System.out.println("Please Select anyone sorting option from below");
			System.out.println("_______________________________________________");
			System.out.println("Press 1 to Sort by Roll number");
			System.out.println("Press 2 to Sort by Name");
			System.out.println("Press 3 to Sort by Age");
			System.out.println("Press 4 to Sort by Marks");
			System.out.println("Press 5 to Sort by Address");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.println("===== Sorting by Roll number =====");
				Collections.sort(arrayList, new RollSort());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			}
			case 2: {

				System.out.println("===== Sorting by Name =====");
				Collections.sort(arrayList, new NameSort());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			}
			case 3: {
				System.out.println("===== Sorting by Age =====");
				Collections.sort(arrayList, new AgeSort());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			}
			case 4: {
				System.out.println("===== Sorting by Marks =====");
				Collections.sort(arrayList, new MarksSort());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			}
			case 5: {
				System.out.println("===== Sorting by Address =====");
				Collections.sort(arrayList, new AddressSort());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;
			}
			default:
				System.out.println();
				System.out.println("Incorrect Choice!!");
				System.out.println("Please Select from below mentioned options");
				System.out.println();
				continue;
			}
			while (flag) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println();
				System.out.println("For resorting type 'YES'");
				System.out.println("To exit type 'NO'");
				System.out.println();
				String s = sc1.next();

				if (s.equalsIgnoreCase("YES")) {

					flag = false;

				} else if (s.equalsIgnoreCase("NO")) {
					flag = false;
					temp = false;

					System.out.println();
					System.out.println("Program Terminated. Thank you!!!");
					System.out.println();

				} else {
					System.out.println();
					System.out.println("Error!!! : Please type 'YES' or 'NO'");
					System.out.println();
					flag = true;

				}

			}

		}

	}
}
