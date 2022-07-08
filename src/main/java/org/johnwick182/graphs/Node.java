package org.johnwick182.graphs;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> adjacent;
    private boolean visited;

    public Node(String name) {
        this.name = name;
        adjacent = new ArrayList<>();
        visited = false;
    }

    public void addAdjacent(Node node) {
        adjacent.add(node);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Node> getAdjacent() {
        return adjacent;
    }

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }
}
