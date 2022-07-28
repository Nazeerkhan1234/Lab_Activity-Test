package com.test;
import java.util.*;
public class CubeNumber {

	public static void main(String[] args) {
		// Write a  Java program  to display the cube of the number up to given  integer.
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int number = scn.nextInt();
			for(int i=1; i<=number; i++) {
				int cube = (int)Math.pow(i, 3);
				System.out.println("Number is : " +i+ " and cube of " + i+" is  "+ cube);
			}
		}

	}

}
