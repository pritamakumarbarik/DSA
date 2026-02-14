package com.dsap.logic.building.easy;

public class PerfectNumber {

	/*
	 * A number is a perfect number if it is equal to the sum of its proper
	 * divisors, that is, the sum of its positive divisors excluding the number
	 * itself. Find whether a given positive integer n is perfect or not. Examples:
	 * 
	 * Input: n = 15 Output: false Explanation: Divisors of 15 are 1, 3 and 5. Sum
	 * of divisors is 9 which is not equal to 15.
	 * 
	 * Input: n = 6 Output: true Explanation: Divisors of 6 are 1, 2 and 3. Sum of
	 * divisors is 6.
	 */

	public static boolean isPerfectNumber(int num) {

		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return (num == sum);
	}

	public static void main(String[] args) {
		int num = 6;
		System.out.printf("%s is perfect number %s", num, isPerfectNumber(num));
	}

}
