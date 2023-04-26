import java.io.PrintWriter;
import java.util.*;


class LongestPath {
    static ArrayList<Integer>[] adj;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = in.nextInt(), M = in.nextInt();
        adj = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) adj[i] = new ArrayList<>();

        Graph g = new Graph(N + 1);
        for (int i = 0; i < M; i++) {
            int u = in.nextInt(), v = in.nextInt();
            adj[u].add(v);
            g.addEdge(u, v);
        }
        g.nonRecursiveTopologicalSort();
        pw.println(solve(g.stack1, N, M));
        pw.close();
    }

    static int solve(Stack<Integer> stack, int n, int m) {
        int[] dp = new int[n + 1];
        while (!stack.isEmpty()) {
            int u = stack.pop();
            int max = 0;
            for (int i : adj[u]) {
                max = Math.max(max, dp[i]);
            }
            dp[u] = (max + 1);
        }

        int ans = 0;
        for (int i : dp) ans = Math.max(i, ans);
        return ans - 1;
    }


    static class Graph {
        private Map<Integer, List<Integer>> graph;
        public Stack<Integer> stack1;
        private int V;

        public Graph(int vertices) {
            V = vertices;
            graph = new HashMap<Integer, List<Integer>>();
            stack1 = new Stack<>();
            for (int i = 0; i < V; i++) {
                graph.put(i, new ArrayList<Integer>());
            }
        }

        public void addEdge(int u, int v) {
            graph.get(u).add(v);
        }

        public void nonRecursiveTopologicalSort() {
            boolean[] visited = new boolean[V];
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    nonRecursiveTopologicalSortUtil(i, visited, stack);
                }
            }
            List<Integer> sorted = new ArrayList<Integer>();
            while (!stack.empty()) {
                sorted.add(stack.pop());
            }
            for (int i : sorted) {
                stack1.push(i);
            }
        }

        private void nonRecursiveTopologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
            visited[v] = true;
            for (int nextNeighbor : graph.get(v)) {
                if (!visited[nextNeighbor]) {
                    nonRecursiveTopologicalSortUtil(nextNeighbor, visited, stack);
                }
            }
            stack.push(v);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}