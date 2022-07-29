package org.johnwick182.graphs.represent;

public class AdjacencyList {

    public static void main(String[] args) {
        int[][] adjacencyList = {
                {1},
                {2,8},
                {3},
                {4},
                {7,5},
                {},
                {},
                {6},
                {3}
        };

        boolean[] visited = new boolean[adjacencyList.length];

        for (int i = 0; i < adjacencyList.length; i++) {
            if (!visited[i]) {
                dfs(i, adjacencyList, visited);
            }
        }
    }

    public static void dfs(int node, int[][] adj, boolean[] visited) {
        visited[node] = true;
        System.out.println("element: " + node);
        for (int number : adj[node]) {
            if (!visited[number]) {
                dfs(number, adj, visited);
            }
        }
    }


}
