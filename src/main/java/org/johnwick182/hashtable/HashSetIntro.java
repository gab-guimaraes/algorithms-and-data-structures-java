package org.johnwick182.hashtable;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetIntro {

    public static void main(String[] args) {
        hashsetTest();
    }

    public static void hashsetTest() {
        //set accept unique values.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(6);
        numbers.add(6);
        System.out.println(numbers);
        System.out.println("contains 3: " + numbers.contains(3));
        numbers.remove(10);
        System.out.println(numbers);

        ArrayList<String> array = new ArrayList<>();

    }
}
