//created by Toufique on 25/07/2023

import java.io.*;
import java.util.*;

public class A888cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
           int n = in.nextInt();
           long  m = in.nextLong(),k = in.nextLong(),H = in.nextLong();
           long[] a = new long[n];
           for (int i = 0; i < n; i++) a[i] = in.nextLong();
           pw.println(solve(a, n, H, m, k));
        }

        pw.close();
    }

    static int solve(long[] a, int n, long H, long m, long k) {
        int cnt = 0;
       for (int i = 0; i < n; i++) {
           long s = Math.abs(H - a[i]);
           if (s != 0) {
               long d = s / k;
               if (s % k == 0) {
                   if (d + 1 <= m) cnt++;
               }
           }
       }
       return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
