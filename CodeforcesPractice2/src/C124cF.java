//created by Toufique on 14/07/2023

import java.io.*;
import java.util.*;

public class C124cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n], b = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < n; i++) b[i] = in.nextLong();
            long[] max = solveMax(a, b, n), min = solveMin(a, b, n);
            for (long x: min) pw.print(x + " ");
            pw.println();
            for (long x: max) pw.print(x + " ");
            pw.println();
        }
        pw.close();
    }

    static long[] solveMax(long[] a, long[] b, int n) {
        long[] ans = new long[n];
        ans[n - 1] = b[n - 1] - a[n - 1];
        int pos = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            long vA = a[i];
            ans[i] = b[pos] - vA;
            if (i > 0 && b[i - 1] < a[i]) {
                pos = i - 1;
            }
        }
        return ans;
    }

    static long[] solveMin(long[] a, long[] b, int n) {
        long[] ans = new long[n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            long vA = a[i];
            while (b[pos] < vA) pos++;
            long diff = b[pos] - vA;
            ans[i] = diff;
        }
        return ans;
    }

    static class Pair implements Comparable<Pair> {
        long x;
        int ind;

        Pair(long x, int ind) {
            this.x = x;
            this.ind = ind;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.x >= o.x) return 1;
            return -1;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", ind=" + ind +
                    '}';
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
