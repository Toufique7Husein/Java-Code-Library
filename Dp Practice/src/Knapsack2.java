//created by Toufique on 18/04/2023

import java.io.*;
import java.util.*;

public class Knapsack2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

            int N = in.nextInt();
            long W = in.nextLong();
            long[] w = new long[N + 1];
            int[] v = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                w[i] = in.nextLong();
                v[i] = in.nextInt();
            }
            //debug(w, v);
            pw.println(solve(w, v, N, W));

        pw.close();
    }

    static int solve(long[] w, int[] v, int N, long W) {
        int X = 21;
        long[][] dp = new long[N + 1][X + 1];
        long inf = (long)1e9 + 1;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= X; j++) dp[i][j] = inf;
        }
        dp[0][0] = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= X; j++) {
                if (j >= v[i]) {
                    if (dp[i - 1][j - v[i]] + w[i] <= W) dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);
                    else dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        int ans = 0;
        for(int i = 1; i <= X; i++){
            if(dp[N][i] <= W) ans = Math.max(ans, i);
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
