//created by Toufique on 24/06/2023

import java.io.*;
import java.util.*;

public class CodeTone_5B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n], b = new long[n], c = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < n; i++) b[i] = in.nextLong();
            for (int i = 0; i < n; i++) c[i] = in.nextLong();
            pw.println(solve(a, b, c, n, m) ? "Yes" : "No");
        }

        pw.close();
    }

    static boolean solve(long[] a, long[] b, long[] c, int n, long m) {

        ArrayList<Long> v1 = addBit(a, n, m), v2 = addBit(b, n, m), v3 = addBit(c, n, m);

        ArrayList<Long> toto = new ArrayList<>();
        for (long x: v1)toto.add(x);
        for (long x: v2)toto.add(x);
        for (long x: v3)toto.add(x);

        long make = 0;
        for (long x: toto) make |= x;
        if (make == m) return true;
        return false;
    }


    static ArrayList<Long> addBit(long[] a, int n, long m) {
        ArrayList<Long> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (long j = 0; j <= 40; j++) {
                long x = 1L << j;
                if (a[i] > m) return num;
                if (x > m) break;
                if (a[i] < x) break;
                long bitA = ((a[i] & x) > 0) ? 1 : 0;
                long bitM = ((m & x) > 0) ? 1 : 0;
                if (bitM == 0 && bitA == 1) return num;
            }
            num.add(a[i]);
        }
        return num;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
