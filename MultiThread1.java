package com.test;

import java.util.Random;

class Squares extends Thread

{
	int x;

	Squares(int n) {
		x = n;
	}

	public void run() {
		int sqr = x * x;
		System.out.println("Square of " + x + " = " + sqr);
	}
}

class Cube extends Thread {
	int x;

	Cube(int n) {
		x = n;
	}

	public void run() {
		int cub = x * x * x;
		System.out.println("Cube of " + x + " = " + cub);
	}
}

class Number extends Thread {
	public void run() {
		Random random = new Random();

		for (int i = 1; i <= 4; i++) {
			int randomInteger = random.nextInt(100);

			// First thread generates random integer every 1 second.

			System.out.println("Random Integer generated : " + randomInteger);

			// if the value is even
			// second thread computes the square of the number and prints.
			if (randomInteger % 2 == 0) {
				Squares s = new Squares(randomInteger);

				s.start();
			}
			// If the value is odd,
			// the third thread will print the value of cube of the number.
			if (randomInteger % 2 == 1) {
				Cube c = new Cube(randomInteger);

				c.start();
			}
			try {

				Thread.sleep(1000);

			} catch (InterruptedException ex) {

				System.out.println(ex);
			}
		}
	}
}

public class MultiThread1 {

	public static void main(String args[]) {
		Number n = new Number();
		n.start();
	}
}
