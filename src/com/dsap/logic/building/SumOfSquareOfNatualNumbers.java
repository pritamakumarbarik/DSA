package com.dsap.logic.building;

public class SumOfSquareOfNatualNumbers {
	/*
	 * Given a positive integer n, we have to find the sum of squares of first n
	 * natural numbers. Examples :
	 * 
	 * Input : n = 2 Output: 5 Explanation: 1^2+2^2 = 5
	 * 
	 * Input : n = 8 Output: 204 Explanation : 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 +
	 * 7^2 + 8^2 = 204
	 */

	public static int sumOfSquareOfNaturalNumbers(int number) {
		if (number <= 0)
			return 0;
		return sumOfSquareOfNaturalNumbers(number - 1) + (number * number);
	}

	public static void main(String[] args) {
		int number = 2;
		 System.out.printf("Sum of square of natual numbers of %s is %s", number,
		 sumOfSquareOfNaturalNumbers(number));
		// sumOfSquareOfNaturalNumbers2(2);
		//System.out.printf("Sum of square of natual numbers of %s is %s", number, sumOfSquaresMath(number));
	}

	// Alternate taking extra space
	public static void sumOfSquareOfNaturalNumbers2(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i * i;
			System.out.printf("Sum of square of natual numbers of %s is %s", number, sum);

		}

	}

	// This is ultimate best
	public static int sumOfSquaresMath(int number) {
		// 6 * 5 = 30/6 = 5
		return (number * (number + 1) * (2 * number + 1)) / 6;
	}
}
