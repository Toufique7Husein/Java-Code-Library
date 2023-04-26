//created by Toufique on 10/04/2023

import java.io.*;
import java.util.*;

public class FrogJump1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) h[i] = in.nextLong();
        pw.println(solve(h, n));


        pw.close();
    }

    static long solve(long[] h, int n) {
        long[] dp = new long[n + 1];
        dp[0] = 0;
        if (n == 1) return 0;
        dp[1] = dp[0] + Math.abs(h[0] - h[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + Math.abs(h[i - 1] - h[i]), dp[i - 2] + Math.abs(h[i - 2] - h[i]));
        }
        return dp[n - 1];
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
