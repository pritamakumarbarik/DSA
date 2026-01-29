package com.dsap.logic.building;

public class SumOfNatural {

	/*
	 * Given a positive integer n, find the sum of the first n natural numbers.
	 * 
	 * Examples :
	 * 
	 * Input: n = 3 Output: 6 Explanation: 1 + 2 + 3 = 6
	 * 
	 * Input: n = 5 Output: 15 Explanation: 1 + 2 + 3 + 4 + 5 = 15
	 */

	public static int sumOfNatualNumbers(int num) {
		if (num <= 0) {
			return 0;
		}
		return num + sumOfNatualNumbers(num - 1);
	}

	public static void main(String[] args) {
		System.out.printf("Sum of natual number of %s is %s", 2, sumOfNatualNumbers(3));
	}
}
