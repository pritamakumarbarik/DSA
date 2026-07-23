package com.dsap.logic.building;

public class DiceProblem {

	public static int giveTheOppositeFace(int oppositeOf) {
		if (oppositeOf <= 0)
			return -1;
		return 7 - oppositeOf;
	}

	public static void main(String[] args) {
		int oppositeOf = 1;
		System.out.printf("Opposite of %s is %s", oppositeOf, giveTheOppositeFace(oppositeOf));
	}

}
