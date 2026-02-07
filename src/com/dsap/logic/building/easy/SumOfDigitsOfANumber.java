package com.dsap.logic.building.easy;

public class SumOfDigitsOfANumber {

	// Recursive
	public static int sumOfDigitOfNumber(int number) {
		if (number == 0) {
			return 0;
		}
		return (number % 10) + sumOfDigitOfNumber(number / 10);
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigitOfNumber2(12345));
	}

	public static int sumOfDigitOfNumber1(int number) {
		String numString = String.valueOf(number);
		int sum = 0;
		for (int i = 0; i <= numString.length() - 1; i++) {
			sum += Integer.parseInt(Character.toString(numString.charAt(i)));
		}
		return sum;
	}

	public static int sumOfDigitOfNumber2(int number) {
		int sum = 0;
		int module = 0;
		while (number != 0) {
			module = number % 10;

			sum += module;

			number = number / 10;
		}
		return sum;
	}

}
