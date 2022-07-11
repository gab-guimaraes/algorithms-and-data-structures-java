package org.johnwick182.graphs;

import java.util.LinkedList;

public class GraphsOOBreathSearch {
    public static void main(String[] args) {
        Graph g = createGraph();
        Node ori = g.getListNodes().get(1);
        Node dest = g.getListNodes().get(6);
        System.out.println("origem: " + ori.getName());
        System.out.println("destino: " + dest.getName());
        System.out.println(search(g, ori, dest));
    }

    /*
    Route Between Nodes: Given a directed graph,
    design an algorithm to find out whether there is a
    route between two nodes.
     */
    public static boolean search(Graph g, Node origin, Node destination) {
        if (origin == null) return false;
        origin.visit();

        LinkedList<Node> q = new LinkedList<>();
        q.add(origin);
        Node u;

        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u != null) {
                for (Node v: u.getAdjacent()) {
                    if (!v.isVisited()) {
                        if (v == destination) {
                            return true;
                        } else {
                            q.add(v);
                            u.visit();
                        }
                    }
                }
            }
        }
        return false;
    }


    public static Graph createGraph() {
        Graph countries = new Graph();
        Node br = new Node("Brazil");
        Node ar = new Node("Argentina");
        Node pe = new Node("Peru");
        Node pa = new Node("Paraguay");
        Node mx = new Node("Mexico");
        Node us = new Node("UnitedStates");
        Node ca = new Node("Canada");
        br.addAdjacent(ar);
        br.addAdjacent(pa);
        br.addAdjacent(pe);
        pe.addAdjacent(mx);
        mx.addAdjacent(us);
        mx.addAdjacent(ca);
        countries.addNode(br);
        countries.addNode(ar);
        countries.addNode(pe);
        countries.addNode(pa);
        countries.addNode(mx);
        countries.addNode(us);
        countries.addNode(ca);
        return countries;
    }
}
