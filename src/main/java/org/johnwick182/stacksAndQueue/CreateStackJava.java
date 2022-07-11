package org.johnwick182.stacksAndQueue;

import java.util.Stack;

public class CreateStackJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(400);

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
