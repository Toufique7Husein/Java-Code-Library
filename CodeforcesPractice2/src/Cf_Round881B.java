//created by Toufique on 20/06/2023

import java.io.*;
import java.util.*;

public class Cf_Round881B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            long[] ans = solve(a, n);
            pw.println(ans[0] + " " + ans[1]);
        }

        pw.close();
    }

    static long[] solve(long[] a, int n) {
        long[] ans = new long[2];

        boolean pos = true;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) continue;
            if (pos) {
                if (a[i] > 0) continue;
                pos = false;
                ans[1]++;
            } else {
                if (a[i] > 0) pos = true;
            }
        }

        for (long x: a) ans[0] += Math.abs(x);
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
