//created by Toufique on 09/03/2023

import java.io.*;
import java.util.*;

public class Div2_857B {
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
        int ans = 0;
        int blank = 0;
        int single = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                single++;
                if (blank > 0) {
                    blank--;
                } else {
                    ans++;
                }
            } else {
                int v = single / 2;
                v++;
                blank = ans - v;
                if (blank < 0)blank = 0;
               // if (i == 7)debug(v, blank, ans, single);
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
