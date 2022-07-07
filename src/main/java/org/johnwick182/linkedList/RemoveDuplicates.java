package org.johnwick182.linkedList;

import java.util.HashSet;

public class RemoveDuplicates {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static void removeDuplicates(Node head) {
        HashSet<Integer> hs = new HashSet<>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            int curval = current.val;

            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }

            current = current.next;
        }


    }

}
