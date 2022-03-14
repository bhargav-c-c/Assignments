package com.te.javabasics.patternprgms;

public class TriangleAlphabets {
	public static void main(String[] args) {
		char ch = 'A';
		int row = 6;
		for (int i = 0; i < row; i++) {
			char temp = ch;
			for (int j = 0; j <= i; j++) {
				System.out.print(temp + " ");
				temp--;
			}
			System.out.println();
			ch++;
		}
	}

}
