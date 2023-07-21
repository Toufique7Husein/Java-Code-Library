//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871D {
    static long[] out;
    static boolean[] vis;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            adj = new ArrayList[n + 1];
            vis = new boolean[n + 1];
            out = new long[n + 1];
            for (int i = 0; i <= n; i++) adj[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt(), v = in.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            debug(adj);
        }
        pw.close();
    }






    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
