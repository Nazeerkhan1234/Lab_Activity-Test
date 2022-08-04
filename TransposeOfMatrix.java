package com.test;

public class TransposeOfMatrix {
	public static void main(String args[]) {

		int originalArray[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		System.out.println("Print original Matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(originalArray[i][j] + " ");
			}
			System.out.println();
		}

		int transposeArray[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transposeArray[i][j] = originalArray[j][i];
			}
		}

		System.out.println("Printing Matrix After Transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transposeArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
