package org.johnwick182.tree.binarySearchTree.review;

public class Tree {
    public TreeNode root;

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void insert(int val) {
        root.insert(val);
    }

    public TreeNode get(int value) {
        return root.get(value);
    }

    public int min() {
        return root.min();
    }

    public int max() {
        return root.max();
    }


}
