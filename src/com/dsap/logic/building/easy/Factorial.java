package com.dsap.logic.building.easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOfNum(5));
    }

    public static int factorialOfNum(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorialOfNum(num - 1);
    }
}
