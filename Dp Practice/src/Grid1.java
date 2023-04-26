//created by Toufique on 11/04/2023

import java.io.*;
import java.util.*;

public class Grid1 {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt();
        char[][] mat = new char[n][];
        for (int i = 0; i < n; i++) mat[i] = in.next().toCharArray();
        pw.println(solve(mat, n, m));

        pw.close();
    }

    static long solve(char[][] mat, int n, int m) {
        long[][] dp = new long[n][m];
        boolean findblock = false;
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == '#') findblock = true;
            if (!findblock)dp[i][0] = 1;
        }
        findblock = false;
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == '#') findblock = true;
            if (!findblock)dp[0][j] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == '#') continue;
                long v = (dp[i - 1][j] % mod + dp[i][j - 1] % mod) % mod;
                dp[i][j] = v;
            }
        }
        return dp[n - 1][m - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
