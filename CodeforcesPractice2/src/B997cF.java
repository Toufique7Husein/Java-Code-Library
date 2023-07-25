//created by Toufique on 23/07/2023

import java.io.*;
import java.util.*;

public class B997cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            pw.println(solve(n, k));
        }

        pw.close();
    }


    static long solve(int n, int k) {
/*
        long[] dp = new long[k];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < k; i++) dp[i] = dp[i - 1] + dp[i - 2];
        debug(dp);

        debug(514229);
        debug(2 * (int)1e5);*/

        if (k >= 30) return 0L;
        long ans = 0;
        for (long num = 0; num <= n; num++) {
            long l = num, r = n;
            while (l <= r) {
                long mid = l + (r - l) / 2;
                int v = possible(num, mid, (long)n, k);
                if (v == 0) {
                    ans++;
                    break;
                }
                if (v == -1) l = mid + 1;
                else r = mid - 1;
            }
        }

        return ans;
    }

    static int possible(long f, long s, long n, int k) {
        long[] dp = new long[k];
        dp[0] = f;
        dp[1] = s;
        for (int i = 2; i < k; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            if ((long)Math.log(dp[i]) > (long)Math.log(n)) return 1;
        }
        if (dp[k - 1] == n) return 0;
        if (dp[k - 1] < n) return -1;
        return 1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
