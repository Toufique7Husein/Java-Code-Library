//created by Toufique on 04/07/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round839D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n));
        }

        pw.close();
    }


    static int solve(int[] a, int n) {
        int lo = 0, hi = (int)1e9;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                hi = Math.min(hi, (a[i] + a[i + 1]) / 2);
            } else if (a[i] > a[i + 1]){
                lo = Math.max(lo, (a[i] + a[i + 1] + 1) / 2);
            }
            if (lo > hi) return -1;
        }
        return lo;
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
