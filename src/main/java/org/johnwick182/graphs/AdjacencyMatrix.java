package org.johnwick182.graphs;

public class AdjacencyMatrix {

    static int[][] graph;

    public static void main(String[] args) {
        System.out.println("Hello World");
        graph = new int[][] {
                {0, 1, 0, 0, 1, 1},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        dfs(0, new boolean[graph.length]);

    }


    public static void dfs(int start, boolean[] visited) {
        System.out.println("start... ");
        visited[start] = true;

        for (int i = 0; i < graph[start].length; i++) {
            if (graph[start][i] == 1 && (!visited[i])) {
                System.out.println("visiting: " + i);
                dfs(i, visited);
            }
        }
    }

}
