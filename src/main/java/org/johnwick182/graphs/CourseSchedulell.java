package org.johnwick182.graphs;

public class CourseSchedulell {

    public static void main(String[] args) {
        findOrder(2, );
    }
    public static void findOrder(int numCourses, int[][] prerequisites) {
        dfs(0, new boolean[prerequisites.length], prerequisites);
    }


    public void dfs(int start, boolean[] visited, int[][] graph) {
        visited[start] = true;

        for (int i = 0; i < graph[start].length; i++) { //percorrer todos os itens do grafo
            if (graph[start][i] == 1) {
                if (!visited[start]) {
                    dfs(i, visited, graph);
                } else {
                    System.out.println("tem circulo");
                }
            }
        }
    }
}
