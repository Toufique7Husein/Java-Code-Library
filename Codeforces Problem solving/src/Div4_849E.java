//created by Toufique on 03/02/2023

import java.io.*;
import java.util.*;

public class Div4_849E {
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
        long sum = 0;
        for (long x: a) sum += x;
        ArrayList<Long> ls = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            long v = a[i - 1], v2 = a[i];

            if (v < 0) sum += (-1L) * v;
            else sum -= v;
            if (v2 < 0) sum += (-1L) * v2;
            else sum -= v2;

            long vv = v * (-1L);
            long vv2 = v2 * (-1L);
            ls.add((sum + vv + vv2));
            sum += v;
            sum += v2;
        }
        return Collections.max(ls);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
