package com.dsap.logic.building.easy;

public class ReverseANumber {

	/*
	 * Given an Integer n, find the reverse of its digits.
	 * 
	 * Examples:
	 * 
	 * Input: n = 122 Output: 221 Explanation: By reversing the digits of number,
	 * number will change into 221.
	 * 
	 * Input: n = 200 Output: 2 Explanation: By reversing the digits of number,
	 * number will change into 2.
	 * 
	 * Input: n = 12345 Output: 54321 Explanation: By reversing the digits of
	 * number, number will change into 54321.
	 */

	public static int reverseNumber(int num) {
		int rev = 0;
		while (num != 0) {

			rev = rev * 10;

			rev += num % 10;

			num = num / 10;

		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverseNumber(123));
	}

}
