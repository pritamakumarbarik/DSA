package com.dsap.sorting;

import java.util.Arrays;

public class SelectoinSort {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 8, 6, 9, 1 };
		selectoinSort(arr);
	}

	public static void selectoinSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.err.println(Arrays.toString(arr));
	}
}
