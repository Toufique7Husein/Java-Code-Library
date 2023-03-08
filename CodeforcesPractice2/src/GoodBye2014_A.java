//created by Toufique on 07/03/2023

import java.io.*;
import java.util.*;

public class GoodBye2014_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < n; i++) a[i] = in.nextInt();
        Graph graph = new Graph(n);
        for (int i = 1; i < n; i++) {
            int u = i;
            int v = a[i] + u;
            graph.edge(u, v);
        }
        graph.dfs(1);
        if (graph.vis[t]) pw.println("YES");
        else pw.println("NO");
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
        }

        public void dfs(int u) {
            vis[u] = true;
            for (int v: adj[u]) {
                if (!vis[v]) dfs(v);
            }
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
