package com.te.javabasics.array;

public class AarrayDuplicacteSinigle {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1,2, 1, 2, 2, 1, 2 };
		
		System.out.print("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int j= 0; j < a.length; j++) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[j]&& i!=j) {

					count++;
					a[i] = '\n';
				}
			}

			if (a[j] != '\n' && count > 0) {
				System.out.print(a[j] + " ");

			}

		}

	}

}
