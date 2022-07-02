package org.johnwick182.challengesCrackingCodeInterview.ArrayAndStrings;

import java.util.ArrayList;

//solution: O(n)
public class Permutation {
    public static void main(String[] args) {
        System.out.println("Check Permutation: Given two strings, write a method to decide if one is a permutation of the\n" +
                "other.");

        System.out.println(permutation("log","gol"));
        // gol log
    }

    public static boolean permutation(String y, String x) {
        if (y.length() != x.length()) {
            return false;
        }

        ArrayList<Character> letterY = new ArrayList<>();
        ArrayList<Character> letterX = new ArrayList<>();

        for (int i = 0; i < y.length(); i++) {
            letterX.add(y.charAt(i));
            letterY.add(y.charAt(i));
        }

        for (Character c : letterX) {
            if (!letterY.contains(c)) {
                return false;
            }
        }

        return true;
    }
}
