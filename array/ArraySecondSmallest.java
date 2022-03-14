package com.te.javabasics.array;

import java.util.Arrays;

public class ArraySecondSmallest {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 4, 4 };
		int temp;
		// sort the array
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length - 2] + " second smallest output");

		for (int j = a.length - 2; j >= 0; j--) {
			if (a[j] > a[a.length - 1]) {
				System.out.print(a[j] + " is the second smallest value output if duplicate");
				return;
			}
		}

		/*
		 * for (int j = a.length - 1; j >= 0; j--) { if (a[j - 1] != a[j]) {
		 * System.out.print(a[j - 1] +
		 * " is the second smallest value output if duplicate"); break; }
		 * 
		 * }
		 */
	}
}
