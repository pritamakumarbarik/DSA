package com.dsap.logic.building;

public class NthTerm {

	public static int ntTermOfAP(int a1, int a2, int nth) {

		int start = a1;
		int diff = a2 - a1;

		for (int i = 1; i <= nth - 1; i++) {
			start += diff;
		}

		return start;
	}

	public static void main(String[] args) {
		System.out.println(ntTermOfAP(2, 3, 4));
	}

}
