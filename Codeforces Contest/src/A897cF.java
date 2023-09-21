//created by Toufique on 11/09/2023

import java.io.*;
import java.util.*;

public class A897cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            ArrayList<Pair> ls = new ArrayList<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                ls.add(new Pair(x, i));
            }
            Collections.sort(ls);
            int[] ans = new int[n];
            int x = n;
            for (int i = 0; i < ls.size(); i++, x--) ans[ls.get(i).ind] = x;
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }


    static class Pair implements Comparable<Pair> {
        long v;
        int ind;
        Pair(long v, int ind) {
            this.ind = ind;
            this.v = v;
        }
        @Override
        public int compareTo(Pair o) {
            return Long.compare(this.v,  o.v);
        }

        @Override
        public String toString() {
            return "[" + this.v + " " + this.ind + "]";
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
