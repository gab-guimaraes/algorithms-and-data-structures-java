package org.johnwick182.tree.binarySearchTree.v2;

public class BinaryTree {
    private Node root;

    //create an empty binary search -- a null root pointer
    public BinaryTree() {
        root = null;
    }

    public boolean lookup(int data) {
        return lookup(root, data);
    }

    public boolean lookup(Node node, int data) {
        if (node == null)
            return false;

        if (data==node.data)
            return true;
        else if (data < node.data)
            return lookup(node.left, data);
        else
            return lookup(node.right, data);
    }

    public void transverseInOrder() {
        transverseInOrder(root);
    }

    public void transverseInOrder(Node node) {
        if (node == null)
            System.out.println("empty");
        else {
            System.out.println(node.data);
            if (node.left != null)
                transverseInOrder(node.left);
            if (node.right != null)
                transverseInOrder(node.right);
        }
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }




}


