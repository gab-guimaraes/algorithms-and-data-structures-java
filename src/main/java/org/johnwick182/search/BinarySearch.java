package org.johnwick182.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = { 0, 12, 14, 15, 19 };
        System.out.println(binarySearch2(nums, 120));
        binarySearchNativeJava();
    }

    public static void binarySearchNativeJava() {
        List<Integer> list = Arrays.asList(5, 7, 9, 13, 17, 22);
        System.out.println(Collections.binarySearch(list, 13));

    }

    public static int binaryS(int[] sortedArray, int value, int low, int high) {
        int start = 0;
        int end = sortedArray.length;
        while (start < end) {
            int midPoint = (start + end) / 2;
            if (sortedArray[midPoint] == value)
                return midPoint;
            else if (sortedArray[midPoint] < value)
                start = midPoint + 1;
            else
                end = midPoint;
        }
        return -5000;
    }
    
    public static int binarySearch2(int[] myNumbers, int val) {
        if (myNumbers.length <= 1)
            return -1;
        
        int start = 0; //0
        int end = myNumbers.length;

        while (start < end) {
            int midPoint = (start + end) / 2;
            if (myNumbers[midPoint] == val)
                return midPoint;
            if (myNumbers[midPoint] < val) { //valor q peguei e menor que o meu val
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }
}
