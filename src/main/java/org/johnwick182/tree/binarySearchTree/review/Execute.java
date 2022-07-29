package org.johnwick182.tree.binarySearchTree.review;

public class Execute {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(100);
        tree.insert(40);
        tree.insert(25);
        tree.insert(1);
        tree.insert(33);
        tree.insert(93);
        tree.insert(103);
        tree.insert(1200);
        tree.insert(133);
        tree.traverseInOrder();
        System.out.println(tree.get(103));
        System.out.println(tree.min());
        System.out.println(tree.max());



    }
}
