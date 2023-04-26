//created by Toufique on 10/04/2023

import java.io.*;
import java.util.*;

public class Vacation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long[][] a = new long[n][3];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.nextLong();
            a[i][1] = in.nextLong();
            a[i][2] = in.nextLong();
        }
        pw.println(solve(a, n));


        pw.close();
    }

    static long solve(long[][] a, int n) {
        long[][] dp = new long[n][3];
        dp[0][0] = a[0][0];
        dp[0][1] = a[0][1];
        dp[0][2] = a[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max((a[i][0] + dp[i - 1][1]), (a[i][0] + dp[i - 1][2]));
            dp[i][1] = Math.max((a[i][1] + dp[i - 1][2]), (a[i][1] + dp[i - 1][0]));
            dp[i][2] = Math.max((a[i][2] + dp[i - 1][1]), (a[i][2] + dp[i - 1][0]));
        }
        return Math.max(Math.max(dp[n - 1][0], dp[n - 1][2]), dp[n - 1][1]);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
