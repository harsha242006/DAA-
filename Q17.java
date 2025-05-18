import java.util.*;
class Edge {
    int dest, weight;
    Edge(int d, int w) { dest = d; weight = w; }
}
class Node implements Comparable<Node> {
    int vertex, dist;
    Node(int v, int d) { vertex = v; dist = d; }
    public int compareTo(Node other) {
        return this.dist - other.dist;
    }
}
public class Dijkstra {
    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        
        graph.get(0).add(new Edge(1, 9));
        graph.get(0).add(new Edge(2, 6));
        graph.get(0).add(new Edge(3, 5));
        graph.get(0).add(new Edge(4, 3));
        graph.get(2).add(new Edge(1, 2));
        graph.get(2).add(new Edge(3, 4));

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            for (Edge edge : graph.get(curr.vertex)) {
                if (dist[curr.vertex] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[curr.vertex] + edge.weight;
                    pq.offer(new Node(edge.dest, dist[edge.dest]));
                }
            }
        }

        System.out.println("Shortest distances from source:");
        for (int i = 0; i < V; i++) System.out.println(i + ": " + dist[i]);
    }
}
