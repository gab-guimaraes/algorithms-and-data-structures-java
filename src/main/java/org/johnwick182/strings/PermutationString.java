package org.johnwick182.strings;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {
    public static void main(String[] args) {
        permuteAndPrint("", "oie");
    }


    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
}
