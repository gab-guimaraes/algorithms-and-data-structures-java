package org.johnwick182.graphs;

import java.util.Arrays;
import java.util.List;

public class GraphWithMatrix {
    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(0,2,3),
                Arrays.asList(0,1),
                List.of(1)
        );

        System.out.println("hi");

        final int N = 4; // size of the graph

        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++)
            if (!visited[i])
                dfs(i, graph, visited);

    }

    public static void dfs(int node, List<List<Integer>> graph, boolean visited[]) {
        visited[node] = true;

        for (int neighbour : graph.get(node))
            if (!visited[neighbour])
                dfs(neighbour, graph, visited);
    }

}
