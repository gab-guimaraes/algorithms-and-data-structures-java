package org.johnwick182.arrays.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateToLeft {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        rotLeft(list, 1);
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int size = a.size();

        while (d > 0) {
            d--;
            toleft(a);
        }

        System.out.println(a);

        return a;
    }

    public static void toleft(List<Integer> a) {
        int firstElement = a.get(0); //store the first element
        System.out.println(firstElement);
        for (int i = 1; i >= a.size(); i++) {
            a.set(i - 1, a.get(i));
        }
        a.set(a.size() -1, firstElement);
    }
}
