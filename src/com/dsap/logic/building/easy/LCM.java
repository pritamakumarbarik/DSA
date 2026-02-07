package com.dsap.logic.building.easy;

public class LCM {
	/*
	 * Given two positive integers a and b. Find the Least Common Multiple (LCM) of
	 * a and b. LCM of two numbers is the smallest number which can be divided by
	 * both numbers.
	 * 
	 * Input : a = 10, b = 5 Output : 10 Explanation : 10 is the smallest number
	 * divisible by both 10 and 5
	 * 
	 * Input : a = 5, b = 11 Output : 55 Explanation : 55 is the smallest number
	 * divisible by both 5 and 11
	 */

	public static int findLCM(int a, int b) {
		int tempA = a, tempB = b;
		while (b != 0) {

			int temp = b;
			b = a % b;
			a = temp;

		}

		return (tempA * tempB) / a;

	}

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.printf("LCM is %s", findLCM(a, b));
	}
}
