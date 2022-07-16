package org.johnwick182.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myList = { 10, 15, 2, 0, 3 };
        sortAscending(myList);
    }

    public static void sortAscending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }
}
