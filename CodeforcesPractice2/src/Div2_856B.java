//created by Toufique on 27/04/2023

import java.io.*;
import java.util.*;

public class Div2_856B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            a = solve(n, a);
            for (long i: a) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }
    static long[] solve(int n, long[] a) {
        for (int i = 0; i < n; i++) if (a[i] == 1) a[i]++;
        for (int i = 1; i < n; i++) if (a[i] % a[i - 1] == 0) a[i]++;
        return a;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
