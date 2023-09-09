//created by Toufique on 27/07/2023

import java.io.*;
import java.util.*;

public class B152Edu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0 ; i  < n; i++) a[i] = in.nextLong();
            ArrayList<Integer> ans = solve(a, n, k);

            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static ArrayList<Integer> solve(long[] a, int n, long k) {
        ArrayList<Pair> p = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long rem = (a[i] % k) == 0 ? k : (a[i] % k);
            p.add(new Pair(i + 1, rem));
        }
        Collections.sort(p);

        for (Pair i: p) ans.add(i.idx);
        return ans;
    }

    static class Pair implements Comparable<Pair> {
        int idx;
        long v;

        Pair(int idx, long v) {
            this.idx = idx;
            this.v = v;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.v == o.v) {
                if (this.idx > o.idx) return 1;
                else return -1;
            }
            if (this.v < o.v) return 1;
            return -1;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "idx=" + idx +
                    ", v=" + v +
                    '}';
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
