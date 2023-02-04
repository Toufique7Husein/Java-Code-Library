//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class DFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        Graph graph = new Graph(10);

        graph.edge(1, 2);
        graph.edge(2, 3);
        graph.edge(3, 4);
        graph.edge(4, 5);
        graph.edge(5, 10);

        graph.dfs(1);

        pw.close();
    }

    static class Graph {
        ArrayList<Integer>[] adj;
        boolean[] vis;
        int N;

        Graph(int N) {
            adj = new ArrayList[N + 5];
            for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
            vis = new boolean[N + 5];
        }

        public void edge(int u, int v) {
            adj[u].add(v);
            adj[v].add(u);
        }

        public void dfs(int u) {
            vis[u] = true;
            System.out.println(u);
            for (int v: adj[u]) {
                if (!vis[v]) dfs(v);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
