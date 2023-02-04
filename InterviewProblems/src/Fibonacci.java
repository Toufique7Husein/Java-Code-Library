//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class Fibonacci {
    static int[] dp;
    static int N = 50;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        solve();
        debug(dp);
        pw.close();
    }

    static void solve() {
        dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
