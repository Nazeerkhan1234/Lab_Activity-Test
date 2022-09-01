package com.test;

abstract class Shape {
	String color;
	boolean filled;

	Shape() {
		color = "green";
		filled = true;
	}

	Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean Filled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		if (this.filled == true) {
			return " Shape with color of " + this.color + " and filled.";
		} else {
			return " Shape with color of " + this.color + " and not filled.";

		}
	}

	abstract double getArea();

	public static void main(String[] args) {
//		  shape shape1 = new shape();	
		// shape can not be instantiate
	}

}

