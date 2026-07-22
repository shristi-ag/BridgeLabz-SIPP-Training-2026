package Graph;

import java.util.*;

public class FewestFlights {

    private Map<Integer, List<Integer>> routes;

    public FewestFlights() {
        routes = new HashMap<>();
    }

    public void addFlight(int from, int to) {
        routes.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        routes.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
    }

    public List<Integer> shortestPath(int origin, int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(origin);
        visited.add(origin);
        parent.put(origin, null);

        while (!queue.isEmpty()) {

            int city = queue.poll();

            if (city == destination) {
                break;
            }

            for (int next : routes.getOrDefault(city, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, city);
                    queue.offer(next);
                }
            }
        }

        if (!visited.contains(destination)) {
            return Collections.emptyList();
        }

        LinkedList<Integer> path = new LinkedList<>();

        Integer current = destination;

        while (current != null) {
            path.addFirst(current);
            current = parent.get(current);
        }

        return path;
    }

    public static void main(String[] args) {

        FewestFlights graph = new FewestFlights();

        graph.addFlight(1, 2);
        graph.addFlight(1, 3);
        graph.addFlight(2, 4);
        graph.addFlight(3, 5);
        graph.addFlight(4, 6);
        graph.addFlight(5, 6);

        List<Integer> path = graph.shortestPath(1, 6);

        if (path.isEmpty()) {
            System.out.println("No route found.");
        } else {
            System.out.println("Shortest Path: " + path);
            System.out.println("Number of Flights: " + (path.size() - 1));
        }
    }
}