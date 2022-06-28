package org.johnwick182.hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {
    public static void main(String[] args) {
        hashmapTest();

    }

    public static void hashmapTest() {
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Shaggy");
        list.put(2, "Scooby-Doo");
        list.put(3, "Velma");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.get(59));

        String name = "";
        name.charAt(1);


    }

}
