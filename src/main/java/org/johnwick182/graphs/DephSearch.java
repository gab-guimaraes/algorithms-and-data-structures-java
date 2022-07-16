package org.johnwick182.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DephSearch {
    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
                Arrays.asList(1,2), // 0 go to 1 and 2
                Arrays.asList(0,2,3), //1 go to 0,2 and 3
                Arrays.asList(0,1), //2 go to 0 and 1
                List.of(1) //3 go to 1
        );
        final int N = 4; // size of the graph
        boolean[] visited = new boolean[N]; //cria um vetor boolean para armazenar qual percorreu
        bfs(graph, visited);

        //percorre todo o grafo de i ate n
        for (int i = 0; i < N; i++) {
            System.out.println("percorrendo index: " + i);
            if (!visited[i]) { //se nao tiver visitado o index
                dfs(i, graph, visited);
                System.out.println("chama index: " + i + "\npassando graph: " + graph);
            }
        }
    }

    public static void dfs(int node, List<List<Integer>> graph, boolean visited[]) {
        visited[node] = true; //seta que ja visitou o node index

        for (int neighbour : graph.get(node)) //percorre para cada item da lista do node
            if (!visited[neighbour])
                dfs(neighbour, graph, visited);
    }

    public static void bfs(List<List<Integer>> graph, boolean visited[]) {
        System.out.println("###### Starting bfs... #######");
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0); //start to 0 index

        while (!queue.isEmpty()) {
            int myNumber = queue.poll();

            if (!visited[myNumber]) { //se ainda nao visitei o no
                visited[myNumber] = true;
                for (int neighbour : graph.get(myNumber)) {
                    System.out.println("node: " + myNumber + "neightbour: " + neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }

}
