package com.dsap.logic.building.easy;

public class Fibonacci {

    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int firstNum = 0;
        int secondNum = 1;

        int till = 10;

        for (int i = 2; i <= till; i++) {
            int next = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = i;
            System.out.println(next);
        }

    }



}
