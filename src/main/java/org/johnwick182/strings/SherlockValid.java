package org.johnwick182.strings;

import java.util.Hashtable;
import java.util.Map;

public class SherlockValid {

    public static void main(String[] args) {
        isValid("aabbcc");
    }
    public static String isValid(String s) {
        Hashtable<Character, Integer> hash = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!hash.contains(c)) {
                System.out.println("no contain: " + c);
                hash.put(c, 1);
            } else {
                int oldVal = hash.get(c);
                System.out.println("oldval: " + oldVal);
                hash.put(c, oldVal++);
                //map.put(key, map.get(key) + 1);
            }
        }

        System.out.println(hash);

        boolean margem = false;
        int count = 0;

        //aabcc

        for (Map.Entry<Character, Integer> e : hash.entrySet()) {
            if (count == e.getValue())
                break;

            if (count == 0) {
                count = e.getValue();
            }

            else {
                if (count > e.getValue()) {
                    return "NO";
                } else {
                    if (count < e.getValue() - 1) {
                        if (margem == false)
                            margem = true;
                        else
                            return "NO";
                    }
                }
            }


        }

        return "YES";


    }
}
