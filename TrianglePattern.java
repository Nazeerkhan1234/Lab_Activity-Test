package com.test;

import java.util.*;

public class TrianglePattern {

	public static void main(String[] args) {

//		 Write a Java program to display the pattern like right angle triangle with a number.

		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int number = scn.nextInt();
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= i; j++) {

					System.out.print(j + " ");
				}
				System.out.println();
			}
		}

	}
}
