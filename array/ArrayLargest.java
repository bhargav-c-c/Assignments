package com.te.javabasics.array;

public class ArrayLargest {

	public static void main(String[] args) {
		int[] a = { 1, 2, 999999, 952, 963, 7, 0, 9999999 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
