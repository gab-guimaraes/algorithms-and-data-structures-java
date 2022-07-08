package org.johnwick182.tree;

public class Tree {
    private TreeNode root; //all tree needs to root to start (Raiz)

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null)
            root.traverseInOrder();
    }


}
