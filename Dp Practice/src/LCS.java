//created by Toufique on 11/04/2023

import java.io.*;
import java.util.*;

public class LCS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        char[] s = ("<"+in.next()).toCharArray();
        char[] t =  (">"+in.next()).toCharArray();
        pw.println(solve(t, s));
        pw.close();
    }
    static String solve(char[] s, char[] t) {
        String ans = "";
        int[][] dp = new int[s.length][t.length];


        for (int i = 1; i < s.length; i++) {
            for (int j = 1; j < t.length; j++) {
                if (s[i] == t[j]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        debug(dp);
        boolean[] vis = new boolean[Math.max(s.length, t.length) + 1];
        for (int i = s.length - 1; i >= 1; i--) {
            for (int j = t.length - 1; j >= 1; j--) {
                if (s[i] == t[j] && dp[i][j] == (dp[i - 1][j - 1] + 1) && !vis[dp[i][j]]) {
                    ans = s[i] + ans;
                    vis[dp[i][j]] = true;
                }
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
