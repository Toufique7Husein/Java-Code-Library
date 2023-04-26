//created by Toufique on 10/04/2023

import java.io.*;
import java.util.*;

public class FrogJump2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = in.nextLong();
        pw.println(solve(h, n, k));
        pw.close();
    }

    static long solve(long[] h, int n, int k) {
        long[] dp = new long[n + 1];
        dp[0] = 0;
        if (n == 1) return 0;
        dp[1] = dp[0] + Math.abs(h[0] - h[1]);
        for (int i = 2; i < n; i++) {
            long temp = Long.MAX_VALUE;
            for (int j = i - 1, cnt = 1; cnt <= k && j >= 0; j--, cnt++) {
                temp = Math.min(temp, dp[j] + Math.abs(h[j] - h[i]));
            }
            dp[i] = temp;
        }
        return dp[n - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
