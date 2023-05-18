//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871E {
    static int[][] mat;
    static boolean[][] vis;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n = 0, m = 0;
    static long ans = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            n = in.nextInt();
            m = in.nextInt();
            mat = new int[n][m];
            vis = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = in.nextInt();
            }
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j= 0; j < m; j++) {
                    if (!vis[i][j] && mat[i][j] != 0) {
                        dfs(i, j);
                        cnt = Math.max(ans, cnt);
                        ans = 0;
                    }
                }
            }
            pw.println(cnt);
        }
        pw.close();
    }
    static void dfs(int u, int v) {
        vis[u][v] = true;
        ans += mat[u][v];
        for (int i = 0; i < 4; i++) {
            int U = u + dx[i], V = v + dy[i];
            if (vaild(U, V) && !vis[U][V]) {
                dfs(U, V);
            }
        }
    }
    static boolean vaild(int i, int j) {
        return i >= 0 && j >= 0 && i < n && j < m && mat[i][j] != 0;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
