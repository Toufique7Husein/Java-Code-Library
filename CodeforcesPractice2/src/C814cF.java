//created by Toufique on 15/07/2023

import java.io.*;
import java.util.*;

public class C814cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), q = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            long[] ans = array(a, n);
          //  debug(ans);
        //    debug(a);

            for (int i = 0; i < q; i++) {
                int ii = in.nextInt() - 1;
                long k = in.nextLong();
                debug(a[ii], ans[ii], ii);
                if (a[ii] != ans[ii]) {
                    pw.println(0);
                    continue;
                }

                long cancel = ii;
                k -= cancel;
                if (k <= 0) {
                    pw.println(0);
                    continue;
                }
                int ind = ind(ans, ans[ii], ii, ans.length - 1);
                if (n == ind) {
                    pw.println(k);
                    continue;
                }
                pw.println(Math.min(k, (long)ind));

            }
        }
        pw.close();
    }

    static int ind(long[] a, long x, int l, int r) {
        int ind = a.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] <= x) {
                l = mid + 1;
                ind = mid;
            } else r = mid - 1;
        }
        return ind;
    }

    static long[] array(long[] a, int n) {
        long[] arr = Arrays.copyOf(a, n);
        for (int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i], arr[i - 1]);
        }
      //  debug(a);
        return arr;
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
