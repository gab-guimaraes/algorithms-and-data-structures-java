package org.johnwick182.graphs.represent;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix {

    public static void main(String[] args) {
        checkCircle();
    }

    public static void checkCircle() {
        //int[][] myGraph = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
        int[][] myGraph = {
                { 0,1,1,0,0 },
                { 0,0,0,0,0 },
                { 0,0,0,0,1 },
                { 1,0,0,0,0 },
                { 0,0,0,1,0 }
        };

        int[][] myGraph2 = { {1, 0} };
        dfs(myGraph2, 0, new boolean[myGraph2.length]);
    }

    public static void bfs(int [][] graph, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int value = queue.poll();
            System.out.println(value + " ");
            for (int i = 0; i < graph[value].length; i++) {
                if (graph[value][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void dfs(int[][] graph, int start, boolean[] visited) {
        System.out.println(start + " ");
        visited[start] = true;

        for (int i = 0; i < graph[start].length; i++) {
            if (graph[start][i] == 1) {
                if  (!visited[i]) {
                    dfs(graph, i, visited);
                } else {
                    System.out.println("circulo");
                }
            }
        }
    }
}
