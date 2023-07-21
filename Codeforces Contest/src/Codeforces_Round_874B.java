//created by Toufique on 19/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_874B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            ArrayList<Pair> ls = new ArrayList<>();
            ArrayList<Integer> ls2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ls.add(new Pair(in.nextInt(), i));
            }
            for (int i = 0; i < n; i++) ls2.add(in.nextInt());
            Collections.sort(ls);
            Collections.sort(ls2);
            int[] ans = new int[n];
            int ind = 0;
            for (Pair p: ls) {
                ans[p.ind] = ls2.get(ind);
                ind++;
            }
            for (int i: ans) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }
    static class Pair implements Comparable<Pair> {
        int v;
        int ind;
        Pair(int v, int ind) {
            this.v = v;
            this.ind = ind;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.v, o.v);
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
