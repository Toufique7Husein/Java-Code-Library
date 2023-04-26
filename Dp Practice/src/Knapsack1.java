//created by Toufique on 18/04/2023

import java.io.*;
import java.util.*;

public class Knapsack1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int N = in.nextInt(), W = in.nextInt();
        int[] w = new int[N + 1];
        long[] v = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextLong();
        }
        pw.println(solve(w,v, N, W));
        pw.close();
    }

    static long solve(int[] w, long[] v, int N, int W) {
        long[][] dp = new long[N + 1][W + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (j >= w[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
