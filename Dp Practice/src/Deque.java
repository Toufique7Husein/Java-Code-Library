//created by Toufique on 20/04/2023

import java.io.*;
import java.util.*;

public class Deque {

    static long[][][] dp = new long[3000][3000][2];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            sum += a[i];
        }
        pw.println(solve(n, a, sum));


        pw.close();
    }

    static long solve(int n, long[] a, long sum) {
        for (int i = 0; i < n; i++) {
            dp[i][i][0] = a[i];
            dp[i][i][1] = 0;
        }

        for (int rl = 1; rl < n; rl++) {
            for (int l = 0; l + rl < n; l++) {
                int r = l + rl;
                dp[l][r][0] = Math.max(a[l] + dp[l + 1][r][1], a[r] + dp[l][r - 1][1]);
                dp[l][r][1] = Math.min(dp[l + 1][r][0], dp[l][r - 1][0]);
            }
        }
        long x = dp[0][n - 1][0];
        return 2 * x - sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
