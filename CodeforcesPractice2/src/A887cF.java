//created by Toufique on 23/07/2023

import java.io.*;
import java.util.*;

public class A887cF {
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
        long min = Long.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i] - a[i - 1]);
        }
        if (min < 0) return 0;
        long ans = (min / 2) + 1;
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
