//created by Toufique on 21/09/2023

import java.io.*;
import java.util.*;

public class E989cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long w = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n, w));
        }

        pw.close();
    }

    static long solve(long[] a, int n, long w) {
        long l = 0, r = (long)1e15;
        long ans = 0;
        while (l <= r) {
            long mid = l + (r - l) / 2L;
            if (possible(a, n, mid, w)) {
                l = mid + 1;
                ans = mid;
            } else r = mid - 1;
        }
        return ans;
    }

    static boolean possible(long[] a, int n, long v, long w) {
        long cur = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > v) continue;
            cur += (v - a[i]);
            if (cur > w) return false;
        }
        if (cur > w) return false;
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
