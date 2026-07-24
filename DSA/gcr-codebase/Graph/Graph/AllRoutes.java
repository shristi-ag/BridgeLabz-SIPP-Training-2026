package Graph;

import java.util.*;

public class AllRoutes {

    private Map<Integer, List<Integer>> roads;

    public AllRoutes() {
        roads = new HashMap<>();
    }

    public void addRoad(int u, int v) {
        roads.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        roads.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public List<List<Integer>> findAllRoutes(int source, int destination) {

        List<List<Integer>> allRoutes = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        dfs(source, destination, visited, path, allRoutes);

        return allRoutes;
    }

    private void dfs(int current, int destination,
                     Set<Integer> visited,
                     List<Integer> path,
                     List<List<Integer>> allRoutes) {

        visited.add(current);
        path.add(current);

        if (current == destination) {
            allRoutes.add(new ArrayList<>(path));
        } else {

            for (int next : roads.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    dfs(next, destination, visited, path, allRoutes);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        AllRoutes graph = new AllRoutes();

        graph.addRoad(1, 2);
        graph.addRoad(1, 3);
        graph.addRoad(2, 4);
        graph.addRoad(3, 4);
        graph.addRoad(2, 5);
        graph.addRoad(5, 4);

        List<List<Integer>> routes = graph.findAllRoutes(1, 4);

        System.out.println("All Possible Routes:");

        for (List<Integer> route : routes) {
            System.out.println(route);
        }
    }
}