package org.johnwick182.tree;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class DepthandBreathSearchReview {
    /*
        depth - profundidade, recursivo
        breath - largura, fila
    */
    static HashSet<Integer> visitedNodes = new HashSet<>();

    public static void main(String[] args) {
        TreeNode t = new TreeNode(20);
        t.setLeftChild(new TreeNode(10));
        t.setRightChild(new TreeNode(30));
        depth(t);
        breath(t);
    }

    public static void depth(TreeNode node) {
        System.out.println("value: " + node.getData());

        if (node.getLeftChild() != null && !visitedNodes.contains(node.getLeftChild().getData())) {
            depth(node.getLeftChild());
            visitedNodes.add(node.getLeftChild().getData());
        }
        if (node.getRightChild() != null && !visitedNodes.contains(node.getRightChild().getData())) {
            depth(node.getRightChild());
            visitedNodes.add(node.getRightChild().getData());
        }
    }

    public static void breath(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.remove();
            System.out.println(treeNode.getData());
            if (treeNode.getRightChild() != null)
                queue.add(treeNode.getRightChild());
            if (treeNode.getLeftChild() != null)
                queue.add(treeNode.getLeftChild());
        }
    }
}
