//created by Toufique on 05/08/2023

import java.io.*;
import java.util.*;

public class B890cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n) ? "YES" : "NO");
        }

        pw.close();
    }

    static boolean solve(long[] a, int n) {
        if (n == 1) return false;
        long have = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                have--;
                continue;
            }
            have += (a[i] - 1);
        }
        if (have >= 0) return true;
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
