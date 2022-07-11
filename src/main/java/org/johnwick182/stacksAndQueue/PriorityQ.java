package org.johnwick182.stacksAndQueue;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(10);
        queue.add(20);
        queue.add(5000);
        queue.add(49);
        System.out.println(queue.size());
        System.out.println(queue.peek()); //finds the minimal element
        queue.poll(); //remove the minimum
        System.out.println(queue.peek()); //prints second minmal now
        System.out.println(queue.peek()); //prints second minmal now

    }

}
