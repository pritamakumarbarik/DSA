package com.dsap.logic.building;

public class CheckEvenorOdd {

	/*
	 * Given a number n, check whether it is even or odd. Return true for even and
	 * false for odd.
	 * 
	 * Examples:
	 * 
	 * Input: n = 15 Output: false Explanation: 15 % 2 = 1, so 15 is odd .
	 * 
	 * Input: n = 44 Output: true Explanation: 44 % 2 = 0, so 44 is even.
	 */

	public static boolean isEven(int number) {
		return (number % 2 == 0) ? true : false;
	}

	public static void main(String... args) {
		System.out.printf("Is even %s", isEven(8));
	}

}
