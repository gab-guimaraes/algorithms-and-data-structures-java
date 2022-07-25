package org.johnwick182.arrays.challenges;

import java.util.Arrays;

/*
this method explain how to rotate array
to right.
for example: v [ 1, 2, 3, 4, 5 ], k = 2
v [ 4, 5, 1, 2, 3 ]
 */
public class RotateToRight {
    public static void main(String[] args) {
        int[] v = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(v));
        rotate(v, 2);
        System.out.println(Arrays.toString(v));

    }

    public static void rotate(int[] v, int k) { //v vector and k jumps
        while (k > 0) {
            toRight(v);
            k--;
        }
    }

    private static void toRight(int[] v) {
        int n = v.length; // store the size of the array
        int aux = v[n-1]; // store the last element
        for (int i = n - 1; i > 0; i--) {
            v[i] = v[i - 1];
        }
        v[0] = aux;
    }
}
