package com.test;

class Square extends Rectagle {
	Square() {
		super(20, 20);
		System.out.println("length :- " + super.length);
		System.out.println("width :-" + super.width);
	}

	public static void main(String args[]) {
		Square s = new Square();
		if (s.length == s.width) {
			System.out.println("this rec class is square");
		}
	}
}
