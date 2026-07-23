package com.dsap.dsa;

public class BinarySearchOlogN {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        System.out.print(binarySearch(arr, x));

    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }


        return 0;
    }

}
