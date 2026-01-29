package com.dsap.logic.building;

public class SwapTwoNumber {

	/*
	 * Given two numbers a and b, the task is to swap them.
	 * 
	 * Examples:
	 * 
	 * Input: a = 2, b = 3 Output: a = 3, b = 2
	 * 
	 * Input: a = 20, b = 0 Output: a = 0, b = 20
	 * 
	 * Input: a = 10, b = 10 Output: a = 10, b = 10
	 */

	public static void swapNumber(int a, int b) {

		System.out.printf("Orginal Input a=%s and b=%s\r\n", a, b);
		int c = 0;

//		c = a;
//		a = b;
//		b = c;

		a = a + b; // 6

		b = a - b;// 6 - 4 = 2

		a = a - b; // 6 - 2 = 4

		System.out.printf("Swap output a=%s and b=%s\r\n", a, b);

	}

	public static void main(String[] args) {
		swapNumber(2, 4);
	}

}
