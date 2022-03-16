package com.te.javabasics.collections.sets.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import com.te.javabasics.collections.sets.NameSortSet;

public class StudentSetTest {

	public static void main(String[] args) {
		boolean temp = true;

		while (temp) {

			HashSet<StudentSet> hashSet = new HashSet<StudentSet>();
			hashSet.add(new StudentSet(101, "Zack", 19, 95, "Calicutt"));
			hashSet.add(new StudentSet(201, "Jason", 20, 60, "London"));
			hashSet.add(new StudentSet(501, "Robert", 21, 90, "New York"));
			hashSet.add(new StudentSet(901, "Charlie", 19, 56, "New Jersey"));
			hashSet.add(new StudentSet(801, "Bhargav", 23, 99, "Dubai"));
			hashSet.add(new StudentSet(101, "Rakesh", 19, 95, "Bangalore"));
			hashSet.add(new StudentSet(301, "Swapneel", 20, 60, "Delhi"));
			hashSet.add(new StudentSet(401, "Charlie", 21, 90, "New York"));
			hashSet.add(new StudentSet(701, "Zack", 19, 56, "New Jersey"));
			hashSet.add(new StudentSet(801, "Karthik", 23, 99, "Dubai"));
			ArrayList<StudentSet> arrayList = new ArrayList<StudentSet>(hashSet);
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
				Collections.sort(arrayList, new SetRollSort());
				for (StudentSet studentSet : arrayList) {
					System.out.println(studentSet);
				}
				break;
			}
			case 2: {
				System.out.println("===== Sorting by Name =====");
				Collections.sort(arrayList, new SetNameSort());
				for (StudentSet studentSet : arrayList) {
					System.out.println(studentSet);
				}

				break;
			}
			case 3: {
				System.out.println("===== Sorting by Age =====");
				Collections.sort(arrayList, new SetAgeSort());
				for (StudentSet studentSet : arrayList) {
					System.out.println(studentSet);
				}

				break;
			}
			case 4: {
				System.out.println("===== Sorting by Marks =====");
				Collections.sort(arrayList, new SetMarksSort());
				for (StudentSet studentSet : arrayList) {
					System.out.println(studentSet);
				}
				
				break;
			}
			case 5: {
				System.out.println("===== Sorting by Address =====");
				Collections.sort(arrayList, new SetAddressSort());
				for (StudentSet studentSet : arrayList) {
					System.out.println(studentSet);
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

				}

			}

		}

	}
}
