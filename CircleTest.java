package com.test;

public class CircleTest {
	private static int count;
	double center,radius;
	
	public CircleTest(double center, double radius) {
		
		this.center = center;
		this.radius = radius;
		count++;
	}
	CircleTest()
	{
		System.out.print("constructor default ");
		count++;
	}
	void show()
	{
		System.out.println("center is : "+center+  "radius is : "+radius);
	}

	public static void main(String[] args) {
		CircleTest c1 = new CircleTest(20.5,5.5);
		c1.show();
		CircleTest c2 = new CircleTest(20,5);
		c2.show();
		CircleTest c3 = new CircleTest();
		System.out.println("total number of instance :  "+CircleTest.count);
	}

}

