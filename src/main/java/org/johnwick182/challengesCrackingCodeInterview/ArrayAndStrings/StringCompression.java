package org.johnwick182.challengesCrackingCodeInterview.ArrayAndStrings;

/*
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
Hints: #92, if 110
*/

import java.util.Locale;

public class StringCompression {
    //aabcccccaaa
    //a2blc5a3

    public static void main(String[] args) {
        System.out.println(compression("aaabb"));
    }

    public static String compression(String str) {
        if (str == null)
            return null;
        if (str.length() == 0)
            return str;

        int num = str.length() - 1;
        int i = 0;
        String strComp = "";

        while (i < num) {
            int repetition = 1;

            while (str.charAt(i) == str.charAt(i + 1) && i < num - 1) {
                repetition++;
                i++;
            }

            strComp = strComp + str.charAt(i) + repetition;
            i++;
        }

        return strComp;
    }
}
