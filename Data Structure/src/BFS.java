//created by Toufique on 05/02/2023

import java.io.*;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Graph graph = new Graph(10);
        graph.edge(1, 2);
        graph.edge(1, 3);
        graph.edge(2, 4);
        graph.edge(2, 7);
        graph.edge(7, 8);
        graph.edge(8, 1);

        graph.bfs(1);

        pw.close();
    }

    static class Graph{
        int N;
        ArrayList<Integer>[] adj;
        boolean[] vis;
        LinkedList<Integer> queue;
        Graph(int N) {
            adj = new ArrayList[N + 5];
            this.N = N;
            for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
        }

        public void edge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        public void bfs(int src) {
            queue = new LinkedList<>();
            queue.add(src);
            vis = new boolean[N + 5];
            while (!queue.isEmpty()) {
                int u = queue.pollFirst();
                System.out.println(u);
                Iterator<Integer> itr = adj[u].iterator();
                while (itr.hasNext()) {
                    int v = itr.next();
                    if (!vis[v]) {
                        vis[v] = true;
                        queue.add(v);
                    }
                }
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
