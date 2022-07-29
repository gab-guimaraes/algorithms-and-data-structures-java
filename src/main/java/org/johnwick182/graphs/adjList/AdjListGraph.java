package org.johnwick182.graphs.adjList;

import java.util.*;

public class AdjListGraph {
    public static void main(String[] main) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int size = 4;

        for (int i = 0; i < size; i++) {
            adj.add(new ArrayList());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(3).add(2);
        adj.get(2).add(0);

        dfsDetectCycle(adj);
    }

    public static void dfsDetectCycle(ArrayList<ArrayList<Integer>> adj) {
        int[] status = new int[adj.size()]; // -1 white, 0 gray, 1 black

        for (int i = 0; i < adj.size(); i++) {
            status[i] = -1; //everybody is white
        }

        for (int i = 0; i < adj.size(); i++) {
            dfsVisitDetectCycle(adj, status, i);
        }
    }

    private static boolean dfsVisitDetectCycle(ArrayList<ArrayList<Integer>> adj, int[] status, int element) {
        status[element] = 0;

        for (int num: adj.get(element)) {
            if (status[num] == -1) {
                dfsVisitDetectCycle(adj, status, num);
            } else {
                if (status[num] == 0) {
                    System.out.println("there is a cycle...");
                    return true;
                }
            }
        }
        status[element] = 1;
        return false;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            dfsVisit(adj, visited, i);
        }
    }

    public static void dfsVisit(ArrayList<ArrayList<Integer>> list, boolean[] visited, int element) {
        visited[element] = true;
        System.out.println("visiting:" + element);
        for (int vizinho : list.get(element)) {
            if (!visited[vizinho]) {
                dfsVisit(list, visited, vizinho);
            }
        }
    }


    public static void breadthFirstSearch(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = false;

        while(!queue.isEmpty()) {
            int val = queue.poll();
            for (int u : adj.get(val)) {
                if (!visited[u]) {
                    System.out.println("visiting: " + u);
                    visited[u] = true;
                    queue.add(u);
                }
            }
        }
    }

    public static boolean breadthFirstSearch2(ArrayList<ArrayList<Integer>> adj, int end) {
        // -1 - branco
        // 0 - cinza
        // 1 - preto

        int[] status = new int[adj.size()];
        for (int i = 0; i < status.length; i++) {
            status[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int val = queue.poll();
            for (int number : adj.get(val)) {
                if (status[number] == -1) {
                    System.out.println("visiting: " + number);
                    status[number] = 0;
                    queue.add(number);
                }

                if (number == end)
                    return true;
            }
            status[val] = 1;
        }
        return false;
    }


}
