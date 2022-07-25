package org.johnwick182.hashtable.challenges;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

class LettersOfPhoneNumber {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    private static List <String> combinations = new ArrayList <>();

    private static Map <Character, String> letters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    private static String phoneDigits;

    public static List <String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return combinations;
        }
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private static void backtrack(int index, StringBuilder path) {
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return;
        }
        String possibleLetters = letters.get(phoneDigits.charAt(index));
        for (char letter: possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

}



