package org.johnwick182.graphs;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> listNodes;

    public Graph() {
        listNodes = new ArrayList<>();
    }
    public void addNode(Node node) {
        listNodes.add(node);
    }
    public ArrayList<Node> getListNodes() {
        return listNodes;
    }
}
