//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class DivSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            ArrayList<Integer> ans = solve(a, n);
            pw.println(ans.size());
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static ArrayList<Integer> solve(long[] a, int n) {
        for (int i = 1; i < n; i++) a[i] += a[i - 1];
        for (int i = 0; i < n; i++) {
            a[i] %= n;
        }
     //   debug(a);


        boolean hasZero = false;
        int[] cnt = new int[n];
        int idx = -1;
        int cntIdxLast = 0;
        long v = 0;
        for (int i = 0; i < n; i++) {
            int x = (int)a[i];
            cnt[x]++;
            if (cnt[x] == 2) {
                v = x;
                cntIdxLast = i;
                break;
            }
            if (x == 0) {
                hasZero = true;
                idx = i;
                break;
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        if (hasZero) {
            for (int i = 0; i <= idx; i++) {
                ls.add(i + 1);
            }
            return ls;
        }


        for (int i = cntIdxLast; i >= 0; i--) {
            if (i != cntIdxLast && a[i] == v) break;
            ls.add(i + 1);
        }
        Collections.sort(ls);
        return ls;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
