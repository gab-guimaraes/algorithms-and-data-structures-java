package org.johnwick182.graphs;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println("size of the graph is: " + graph.length);
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

    public static boolean hasCycle(boolean[] visited, int start) {
        System.out.println("Start BFS... ");
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(start); //my first element
        visited[start] = true; //visiting the start elemetn

        while (!myQueue.isEmpty()) {
            int element = myQueue.poll();
            for (int i = 0; i < graph[element].length; i++) {
                if (graph[element][i] == 1) {
                    if (visited[element]) {
                        return true;
                    } else {
                        visited[element] = true;
                        myQueue.add(element);
                    }
                }
            }
        }
        return false;
    }

}
