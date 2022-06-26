package org.johnwick182.strings;

class RomanToString {
    public static int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            total = total + checkValue(String.valueOf(s.charAt(i)));
        }

        return total;

    }

    public static int checkValue(String s) {
        return switch (s) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }


}