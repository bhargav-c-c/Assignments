package com.te.javabasics.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		Object[] arr = { 1, 2, 3, 4 };
		Object[] temp = new Object[4];
		System.out.println("Array" + Arrays.toString(arr));
		System.out.println("Temp" + Arrays.toString(temp));

		System.out.println("-----------------------");
		// to copy array arr to temp
		// 1)
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];

		}
		System.out.println("Array" + Arrays.toString(temp));
		// 2) using arraycopy method
		System.out.println(". . . . .  . .. . ");

		System.arraycopy(arr, 0, temp, 0, 4);
		System.out.println("Array" + Arrays.toString(temp));
		System.out.println("____________________");

		// IIterating an array
		// 1)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println(". . . . .  . .. . ");

		// 2)foreach loop
		for (Object object : arr) {

			System.out.println(object);

		}
	}

}
