package Graph;

import java.util.*;

public class UndirectedCycleDetection {

    private Map<Integer, List<Integer>> graph;

    public UndirectedCycleDetection() {
        graph = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public boolean hasCycle(int n) {

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                if (dfs(i, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int node, int parent, Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {

                if (dfs(neighbor, node, visited)) {
                    return true;
                }

            } else if (neighbor != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        UndirectedCycleDetection graph = new UndirectedCycleDetection();

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        int vertices = 4;

        if (graph.hasCycle(vertices)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}