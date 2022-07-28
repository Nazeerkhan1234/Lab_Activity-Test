
// Program to print pattern structure.
package com.test;

import java.util.*;

public class TrianglePattern {

	public static void main(String[] args) {



	 Scanner scn = new Scanner(System.in) ;
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

