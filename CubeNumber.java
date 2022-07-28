//  Program  to display the cube of the number up to given  integer.
package com.test;

import java.util.*;

public class CubeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scn.nextInt();
		for (int i = 1; i <= number; i++) {
			int cube = i * i * i;
			System.out.println("Number is : " + i + " and cube of " + i + " is  " + cube);
		}
	}

}
