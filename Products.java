package com.test;

class Exceptiton {

}

class MyException extends Exception {
	public MyException(String s) {
		// call parent class constructor
		super(s);
	}
}

class ProductCheck {
	int weight;

	public ProductCheck(int weight) {
		this.weight = weight;
	}
}

public class Products {

	public static void main(String[] args) {
		try {
			int ProductWeight = 200;
			if (ProductWeight > 100) {
				System.out.println("product weight is  " + ProductWeight);
			}
		} catch (Exception e) {
			System.out.println("Product weight invalid");
		}
		System.out.println("Product weight valid");
	}

}