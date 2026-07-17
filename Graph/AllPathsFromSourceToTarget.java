import java.util.*;

public class AllPathsFromSourceToTarget {

    public static void allPaths(ArrayList<ArrayList<Integer>> graph, LinkedHashSet<Integer> visited, int current, int destination) {
        visited.add(current);

        if (current == destination) {
            System.out.println(visited);
            visited.remove(current);
            return;
        }

        for (int neighbor : graph.get(current)) {
            if (!visited.contains(neighbor)) {
                allPaths(graph, visited, neighbor, destination);
            }
        }

        visited.remove(current);
    }

    public static void main(String[] args) {
        int[][] edges = {
            {0, 1}, {0, 2}, {0, 3},
            {1, 2}, {1, 3}, {2, 3},
            {1, 4}, {3, 4}
        };
        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.println("All paths from source 0 to destination 4:");
        LinkedHashSet<Integer> visited = new LinkedHashSet<>();
        allPaths(graph, visited, 0, 4);
    }
}
