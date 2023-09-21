//created by Toufique on 21/09/2023

import java.io.*;
import java.util.*;

public class B989cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long temp = 1;
                for(int j = 0; j < n; j++) {
                    long v = a[j];
                    if (i == j) v++;
                    temp *= v;
                   // debug(temp, v,   i, j);
                }
                ans = Math.max(temp, ans);
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
