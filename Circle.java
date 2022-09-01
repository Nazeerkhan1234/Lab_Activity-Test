package com.test;
class Circle extends Shape {
	double getArea() {
		return 0;
	}
}
//final class can not be derived
 class Rectagle extends Shape {
	int length;
	int width;

	public Rectagle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	double getArea() {
		return 0;
	}

}

