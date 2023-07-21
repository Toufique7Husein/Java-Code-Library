//created by Toufique on 03/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round876A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = in.nextLong();

            long val = Long.MAX_VALUE;
            for (long x: a) val = Math.min(x, val);
            if(val < 0) {
                pw.println(val);
                continue;
            }
            val = Long.MIN_VALUE;
            for (long x: a) val = Math.max(val, x);
            pw.println(val);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
