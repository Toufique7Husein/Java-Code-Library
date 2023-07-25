import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        Graph graph = new Graph(n + 1);
        for (int i = 1; i <= n; i++) {
            int v = in.nextInt();
            graph.addEdge(i, v);
        }
        debug(graph.findCycle(1));

        pw.close();

    }

    static class Graph {
        int N;
        ArrayList<Integer>[] adj;
        boolean[] vis;

        Graph(int n) {
            N = n;
            adj = new ArrayList[N + 1];
            for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();
            vis = new boolean[N + 1];
        }

        void addEdge(int u, int v) {
            adj[u].add(v);
        }

        int findCycle(int s) {
            int parent[] = new int[N + 1];
            Arrays.fill(parent, -1);
            Queue<Integer> q = new LinkedList<>();
            vis[s] = true;
            q.add(s);

            while (!q.isEmpty()) {
                int u = q.poll();
                ArrayList<Integer> cycle = new ArrayList<>();
                cycle.add(u);
                for (int i = 0; i < adj[u].size(); i++) {
                    int v = adj[u].get(i);
                    if (!vis[v]) {
                        vis[v] = true;
                        q.add(v);
                        parent[v] = u;
                        cycle.add(v);
                    } else if (parent[u] != v) {
                       return u;
                    }
                }
            }
            return -1;
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }

}
