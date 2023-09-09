//created by Toufique on 05/08/2023

import java.io.*;
import java.util.*;

public class C890cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n, k));
        }

        pw.close();
    }
    static long solve(long[] a, int n, long k) {
        long ans = a[n - 1];
        for (int i = 0; i < n - 1; i++) {
            long l = a[i], r = (long)1e15;
            ans = Math.max(a[i], ans);
            while (l <= r) {
                long mid = l + (r - l) / 2L;
              //  debug(mid);
                if (ok(a, i + 1, n, k, mid)) {
                    l = mid + 1;
                    ans = Math.max(mid, ans);
                } else r = mid - 1;
            }
        }
        return ans;
    }

    static boolean ok(long[] a, int i, int n, long k, long need) {
        k -= (need - a[i - 1]);
        need--;
        long sum = 0;
        for ( ; i < n; i++) {
            if (need <= a[i]) {
                if (sum <= k) {
                    return true;
                } else return false;
            }
            sum += (need - a[i]);
            need--;
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
