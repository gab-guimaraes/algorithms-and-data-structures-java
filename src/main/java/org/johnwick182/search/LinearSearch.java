package org.johnwick182.search;

/*
Linear search: search in each position in Array to find the correct element and then return the index.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] test = { 1, 4, 6, 149, 29 };

        int pos = linearSearch(test, 149);
        System.out.println(pos);
        System.out.println(test[pos]);
    }

    public static int linearSearch(int[] myArray, int number) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number)
                return i;
        }
        return -1;
    }
}
