package com.te.javabasics.array;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int[] a = { 2,1, 5, 5, 3, 8, 8,8,8,8,8};
		int temp;
		// sort the array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			// System.out.print(a[i] + " ");// sorted output
		}
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(a));// to print array
		System.out.println(a[a.length - 2] + " is the second element from last");

		for (int j = a.length - 2; j >= 0; j--) {
			if (a[j] < a[a.length - 1]) {
				System.out.print(a[j] + " is the second largest value output if duplicate");
				break;
			}
		}
	}
}