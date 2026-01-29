package com.dsap.logic.building;

public class ClosesetAndDivisibleByM {

	/*
	 * Given two integers n and m (m != 0). Find the number closest to n and
	 * divisible by m. If there is more than one such number, then output the one
	 * having maximum absolute value.
	 * 
	 * Examples:
	 * 
	 * Input: n = 13, m = 4 Output: 12 Explanation: 12 is the closest to 13,
	 * divisible by 4.
	 * 
	 * Input: n = -15, m = 6 Output: -18 Explanation: Both -12 and -18 are closest
	 * to -15, but -18 has the maximum absolute value.
	 */

	public static int closesetAndDivisibleByM(int number, int m) {
		for (int i = number; i <= number; i--) {

			if ((i % m == 0)) {
				return i;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.printf("Closest %s", closesetAndDivisibleByM(23, 3));
	}

}
