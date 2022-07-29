package org.johnwick182.tree.binarySearchTree.review;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.println("Data = " + data);
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public int min() {
        if (left != null) {
            return left.min();
        }
        return data;
    }

    public int max() {
        if (right == null)
            return data;
        else
            return right.max();
    }


    public TreeNode get(int value) {
        if (value == data)
            return this;
        if (value < data) {
            if (left != null) {
                return left.get(value);
            }
        }
        else {
            if (right != null) {
                return right.get(value);
            }
        }
        return null;
    }

    public void insert(int value) {
        if (value == data)
            return;
        if (value > data) {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        } else {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        }
    }
}