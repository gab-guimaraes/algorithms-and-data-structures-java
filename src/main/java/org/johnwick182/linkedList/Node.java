package org.johnwick182.linkedList;

public class Node {
    private Node next;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public void add(int value) {
        Node end = new Node(value);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

}
