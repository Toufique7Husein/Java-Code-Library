//created by Toufique on 06/07/2023

import java.io.*;
import java.util.*;

public class B882cF {
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

    static int solve(long[] a, int n) {
        long all = a[0];
        int ans = n;
        for (int i = 0; i < n; i++) all &= a[i];

        long[] suffix = Arrays.copyOf(a, n);
        for (int i = n - 2; i >= 0; i--) suffix[i] &= suffix[i + 1];

        long curr = a[0];
        long sum = 0;
        int split = 0;
        for (int i = 0; i < n - 1; i++) {
            curr &= a[i];
            if ((curr + sum + suffix[i + 1]) <= all) {
                sum += curr;
                split++;
                curr = a[i + 1];
            }
        }
        split++;
        return split;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
