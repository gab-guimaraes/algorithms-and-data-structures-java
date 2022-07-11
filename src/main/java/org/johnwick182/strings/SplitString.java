package org.johnwick182.strings;

public class SplitString {

    public static void main(String[] args) {
        String s = "hello its me call me by name";
        String k = "gabriel";

        System.out.println("the size is" + k.length());
        String[] myWords = s.split(" ");

        for (String a : myWords) {
            System.out.println(a);
        }


    }
}
