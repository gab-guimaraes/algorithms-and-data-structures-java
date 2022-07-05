package org.johnwick182.challengesCrackingCodeInterview.ArrayAndStrings;


import java.util.Arrays;

/*
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr 3ohn Smit h 13
Output: "Mr%203ohn%20Smith"
 */
public class URLyfeString {
    public static void main(String[] args) {
        transformString("oi   tudo   .");

    }

    public static boolean transformString(String s) {

        if (s != null) {
            char[] stringSplitted = s.toCharArray();
            System.out.println(Arrays.toString(stringSplitted));

            int i = 0;

            while (i < stringSplitted.length) {
                if (stringSplitted[i] == ' ') {
                    stringSplitted[i] = '%';
                    stringSplitted[i + 1] = '2';
                    stringSplitted[i + 2] = '0';
                    i = i + 2;
                }
                i++;
            }

            String str = String.valueOf(stringSplitted);
            System.out.println(str);
        }
        return true;
    }
}
