package com.dsap.logic.building.easy;

public class SumOfNaturalNumberRec {

    public static void main(String[] args) {
        System.out.println(sumOfNatualNumber(1000));
    }

    static public int sumOfNatualNumber(int num) {

        if (num == 1) {
            return 1;
        }

        return num + sumOfNatualNumber(num - 1);
    }

}
