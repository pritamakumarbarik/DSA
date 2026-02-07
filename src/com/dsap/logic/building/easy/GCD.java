package com.dsap.logic.building.easy;

public class GCD {

	/*
	 * Input: a = 20, b = 28 Output: 4 Explanation: The factors of 20 are 1, 2, 4,
	 * 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these
	 * factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest
	 * among the common factors is 4.
	 * 
	 * Input: a = 60, b = 36 Output: 12 Explanation: GCD of 60 and 36 is 12.
	 */

	// eg 28 / 12 , 4 /2

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.printf("GCD %s", findGCD(20, 28));
	}
}
