package org.johnwick182.strings;

import java.util.Scanner;

public class LongestWord {
        public static String LongestWord(String sen) {

            String[] words = sen.split("\\s+");

            String longest = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() >= longest.length()) {
                    longest = words[i];
                }
            }
            return longest;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));
        }
}
