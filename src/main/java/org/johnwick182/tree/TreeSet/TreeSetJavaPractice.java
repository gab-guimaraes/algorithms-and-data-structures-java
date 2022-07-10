package org.johnwick182.tree.TreeSet;

import java.util.TreeSet;

public class TreeSetJavaPractice {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(9);
        tree.add(10);
        tree.add(12);
        tree.add(1);
        tree.add(500);

        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.higher(4));


        for (int i: tree) {
            System.out.println(i);
        }

    }
}
