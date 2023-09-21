//created by Toufique on 18/09/2023

import java.io.*;
import java.util.*;

public class B_codeTon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            long[] a = new long[n], b = new long[m];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < m; i++) b[i] = in.nextLong();
            pw.println(solve(n, m, a, b));
        }

        pw.close();
    }
    static long solve(int n, int m, long[] a, long[] b) {
        long ans = 0;
        int[] bitCount = new int[40];
        for (int i = 0; i < n; i++) {
            for (long j = 0; j < 40; j++) {
                long v = (1L << j);
             //   debug(v);
                if ((v & a[i]) > 0) bitCount[(int)j + 1]++;
            }
        }
        debug(bitCount);
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
