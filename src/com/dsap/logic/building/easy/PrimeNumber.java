package com.dsap.logic.building.easy;

public class PrimeNumber {
	/*
	 * Given a positive integer, check if the number is prime or not. A prime is a
	 * natural number greater than 1 that has no positive divisors other than 1 and
	 * itself. Examples of the first few prime numbers are {2, 3, 5, ...} Examples :
	 * 
	 * Input: n = 11 Output: true
	 * 
	 * Input: n = 15 Output: false
	 * 
	 * Input: n = 1 Output: false
	 */
	
	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(13));
	}

}
