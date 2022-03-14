package com.te.javabasics.patternprgms;

public class TriangleNumbers {
	public static void main(String[] args) {
		int row = 4;
		int col = row - 1;
		for (int i = 0; i < row; i++) {
			int temp = i + 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(temp + " ");
				temp = temp + (col - j);
			}
			System.out.println();
		}
	}

}
