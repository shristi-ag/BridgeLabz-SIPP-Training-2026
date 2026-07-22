package Graph;
import java.util.*;

public class NetworkConnectivity {

    private Map<Integer, List<Integer>> network;

    public NetworkConnectivity() {
        network = new HashMap<>();
    }

    public void addConnection(int u, int v) {
        network.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        network.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public int countNetworkSegments(int n) {

        Set<Integer> visited = new HashSet<>();
        int segments = 0;

        for (int server = 0; server < n; server++) {

            if (!visited.contains(server)) {
                segments++;
                dfs(server, visited);
            }
        }

        return segments;
    }

    private void dfs(int node, Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        NetworkConnectivity graph = new NetworkConnectivity();

        graph.addConnection(0, 1);
        graph.addConnection(1, 2);

        graph.addConnection(3, 4);

        int totalServers = 6;

        int segments = graph.countNetworkSegments(totalServers);

        System.out.println("Number of Network Segments: " + segments);

        if (segments == 1) {
            System.out.println("Network is Fully Connected.");
        } else {
            System.out.println("Network is NOT Fully Connected.");
        }
    }
}