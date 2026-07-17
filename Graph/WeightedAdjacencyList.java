import java.util.*;

public class WeightedAdjacencyList {
    public static void main(String[] args) {
        int[][] edges = {
            {0, 1, 2}, {0, 2, 1}, {0, 3, 5},
            {1, 2, 8}, {1, 3, 6}, {2, 3, 7},
            {1, 4, 2}, {3, 4, 1}
        };
        int vertices = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w));
        }

        System.out.println("Weighted Graph Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph.get(i)) {
                System.out.print(e + ", ");
            }
            System.out.println();
        }
    }
}
