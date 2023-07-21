//created by Toufique on 24/06/2023

import java.io.*;
import java.util.*;

public class CodTone_5A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int m = in.nextInt();
            long[] a = new long[n], b = new long[m];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < m; i++) b[i] = in.nextLong();

            long sumA = 0, sumB = 0;
            for (long x: a) sumA += x;
            for (long x: b) sumB += x;


            if (sumA == sumB) {
                pw.println("Draw");
                continue;
            }
            if (sumA > sumB) pw.println("Tsondu");
            else pw.println("Tenzing");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
