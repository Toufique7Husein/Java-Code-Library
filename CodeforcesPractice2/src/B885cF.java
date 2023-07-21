//created by Toufique on 16/07/2023

import java.io.*;
import java.util.*;

public class B885cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int i = 0; i < n; i++) a[i] = in.nextLong();
            for (int i = 0; i < n; i++) b[i] = in.nextLong();

            pw.println(solve(a, a, n) ? "YES" : "NO");
        }

        pw.close();
    }

    static boolean solve(long[] a, long[] b, int n) {
        if (n == 1) return true;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            long tot = a[i] + b[i];
            if (tot % 2 == 0) {
                if (a[i] == Math.max(a[i], b[i])) ans[i] = 1;
                else ans[i] = 0;
            } else {
                if (a[i] == Math.max(a[i], b[i])) ans[i] = 0;
                else ans[i] = 1;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i: ans) set.add(i);
        if (set.size() > 0) return false;
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
