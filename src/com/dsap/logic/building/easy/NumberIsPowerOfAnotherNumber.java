package com.dsap.logic.building.easy;

public class NumberIsPowerOfAnotherNumber {

	public static boolean isPower(int x, long y) {

		long power = 1;
		while (power < y) {
			power = power * y;

			return (power == x);

		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPower(10, 1000));
	}

}
