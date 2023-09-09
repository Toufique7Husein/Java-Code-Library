//created by Toufique on 29/07/2023

import java.io.*;
import java.util.*;

public class C889cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            ArrayList<Pair> ans = solve(n, a);
            pw.println(ans.size());
            for (Pair p: ans) pw.println(p);
        }
        pw.close();
    }

    static ArrayList<Pair> solve(int n, long[] a) {
        ArrayList<Pair> pairs = new ArrayList<>();

        //already sorted
        boolean ok = true;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                ok = false;
                break;
            }
        }
        if (ok) return pairs;
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        if (max > 0) {
            return pos(n, a, max);
        }
        return neg(n, a, min);
    }


    static ArrayList<Pair> neg(int n, long[] a, long min) {
        ArrayList<Pair> ans = new ArrayList<>();

        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (min == a[i]) {
                ind = i;
                break;
            }
        }

        while (a[ind] > -40) {
            a[ind] += a[ind];
            ans.add(new Pair(ind + 1, ind + 1));
        }
       // debug(a[ind]);
        if (ind != n - 1) {
            a[n - 1] += a[ind];
            ans.add(new Pair(n, ind + 1));
        }
       // debug(a[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (a[i] > a[i + 1]) {
                ans.add(new Pair(i + 1, i + 2));
                a[i] += a[i + 1];
            }
        }
        debug(a);
        return ans;
    }

    static ArrayList<Pair> pos(int n, long[] a, long max) {
        ArrayList<Pair> ans = new ArrayList<>();
        int ind = -1;
        for (int i = 0; i < n; i++) {
            if (max == a[i]) {
                ind = i;
                break;
            }
        }

        while (a[ind] <= 40) {
            a[ind] += a[ind];
            ans.add(new Pair(ind + 1, ind + 1));
        }
        //debug(a[ind], ind + 1);
        if (ind != 0) {
            ans.add(new Pair(1, ind + 1));
            a[0] += a[ind];
        }
       // debug(a);
        for (int i = 1; i < n; i++) {
            while (a[i] < a[i - 1]) {
                a[i] += a[i - 1];
                ans.add(new Pair(i + 1, i));
            }
        }
        ///debug(a);
        return ans;
    }

    static class Pair {
        int i, j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return i + " " + j;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
