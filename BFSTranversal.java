package latihanModul6;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTranversal {
    private final int node;
    private final LinkedList<Integer>[] adj;
    private final Queue<Integer> que;

    BFSTranversal(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<>();
    }

    void insertEgde(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean nodes[] = new boolean[node];
        int a;
        nodes[n] = true;
        que.add(n);
        while (que.size() != 0) {
            n = que.poll();
            System.out.printf(n + " ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a]) {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSTranversal graph = new BFSTranversal(6);
        graph.insertEgde(0, 1);
        graph.insertEgde(0, 3);
        graph.insertEgde(0, 4);
        graph.insertEgde(4, 5);
        graph.insertEgde(3, 5);
        graph.insertEgde(1, 2);
        graph.insertEgde(1, 0);
        graph.insertEgde(2, 1);
        graph.insertEgde(4, 1);
        graph.insertEgde(3, 1);
        graph.insertEgde(5, 4);
        graph.insertEgde(5, 3);
        System.out.println("Breadth FIrst Traversal for the graph is: ");
        graph.BFS(0);

}
}