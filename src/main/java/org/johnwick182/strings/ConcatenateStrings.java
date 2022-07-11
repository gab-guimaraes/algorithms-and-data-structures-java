package org.johnwick182.strings;

public class ConcatenateStrings {

    public static void main(String[] args) {
        String[] c = { "hi", "my", "name", "is", "john", "wick"};

        StringBuilder s = new StringBuilder();

        for (String words : c) {
            s.append(words);
            s.append(' ');
        }

        System.out.println(s);
    }
}
