//created by Toufique on 11/07/2023

import java.io.*;
import java.util.*;

public class C884cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n));
        }

        pw.close();
    }

    static long solve(long[] a, int n) {
        long[] dp = new long[2];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0)dp[i % 2] += a[i];
        }
        ans = Math.max(dp[0], dp[1]);

        if (ans == 0) {
            long max = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) max = Math.max(a[i], max);
            ans = max;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
