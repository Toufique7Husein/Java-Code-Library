//created by Toufique on 13/07/2023

import java.io.*;
import java.util.*;

public class C838cF {
    static long mod = 998244353;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[] c = in.next().toCharArray();
            pw.println(solve(c, n));
        }

        pw.close();
    }
    static long solve(char[] c, int n) {
        long ans = 1;
        long curr = 1;
        for (int i = 1; i < n; i++) {
            if (c[i - 1] == c[i]) {
                curr = ((curr % mod) * (2L % mod)) % mod;
                ans = ((ans % mod) + (curr % mod)) % mod;
            } else {
                curr = 1;
                ans = ((ans % mod) + (1L % mod)) % mod;
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
