package com.te.javabasics.array;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] { 1,1,2,1, 2,2,1, 2 };
		boolean con = true;
		int max = 0;

		System.out.print("Duplicate elements in given array: ");

		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					max = arr[i];
					con = false;
					System.out.print(arr[i]+" ");
				}
			}
				
			}

		if (con) {
			System.out.println("No Duplicacte elements");

		}
	}

}
