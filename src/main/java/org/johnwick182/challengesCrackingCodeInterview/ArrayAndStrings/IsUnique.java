package org.johnwick182.challengesCrackingCodeInterview.ArrayAndStrings;

import java.sql.SQLOutput;
import java.util.HashSet;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */
public class IsUnique {
    public static void main(String[] args) {
        System.out.println("Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you\n" +
                "cannot use additional data structures? ");

        System.out.println(isUnique("abc"));
        System.out.println(isUnique("aabc"));
        System.out.println(isUnique("aabbc"));
        System.out.println(isUnique("qwifns"));
    }

    public static boolean isUnique(String s) {
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashSet.contains(s.charAt(i))) {
                return false;
            }
            hashSet.add(s.charAt(i));
        }

        return true;
    }
}
