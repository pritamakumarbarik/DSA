package com.dsap.logic.building.easy;

public class FactorialOfANumber {
	/*
	 * Given the non-negative integers n , compute the factorial of a given number.
	 * Note: Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1, for n = 0,
	 * factorial is 1.
	 * 
	 * Examples:
	 * 
	 * Input: n = 5 Output: 120 Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120
	 * 
	 * Input: n = 4 Output: 24 Explanation: 4! = 4 * 3 * 2 * 1 = 24
	 */

	// Recursion
	public static int findFactorialOfAnumberRecursion(int num) {
		if (num <= 0) {
			return 1;
		}
		return findFactorialOfAnumberRecursion(num - 1) * num;

	}

	// Using Loop
	public static int findFactorialOfAnumbeUsingLoop(int num) {
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial = (factorial * i);
		}
		return factorial;

	}

	public static void main(String[] args) {
		int num = 5;
		// Recursion
		System.out.printf("Result using recursion: %s\r\n", findFactorialOfAnumberRecursion(num));
		// Loop
		System.out.printf("Result using loop: %s", findFactorialOfAnumbeUsingLoop(num));

	}
}
