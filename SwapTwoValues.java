package com.test;
//java program to swap two values using object reference.
//Your program should have a swap method.

class SwapValues {
	int no;
	SwapValues(int no) {
		this.no = no;
	}
}

class SwapTwoValues {
	public static void swap(SwapValues value1, SwapValues value2) {
		int temp = value1.no;
		value1.no = value2.no;
		value2.no = temp;
	}

	public static void main(String[] args) {

		SwapValues value1 = new SwapValues(1);
		SwapValues value2 = new SwapValues(2);
		
		System.out.println(" Before swapping value1 is  " + value1.no);
		System.out.println("Before swapping value2 is " + value2.no);
		swap(value1, value2);

		System.out.println(" After swapping value1 is  " + value1.no);
		System.out.println("After swapping value2 is " + value2.no);
	}
}
