//created by Toufique on 18/09/2023

import java.io.*;
import java.util.*;

public class C_codeTon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Pair> p = new ArrayList<>();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int x =  in.nextInt();
                p.add(new Pair(i + 1,x));
                a[i + 1] = x;
            }
            Collections.sort(p);
            int[] ans = solve(n, k, p, a);
            for (int i = 1; i <= k; i++) pw.print(ans[i] + " ");
            pw.println();
        }

        pw.close();
    }

    static int[] solve(int n, int k, ArrayList<Pair> p, int[] a){
        int[] ans = new int[k + 1];
        ArrayDeque<Pair> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) dq.addLast(p.get(i));
        HashSet<Integer> set = new HashSet<>();
        for (int i = n; i >= 1; i--) {
            while (!dq.isEmpty()) {
                Pair pair = dq.peekFirst();
                int v = pair.v;
                if (set.contains(v)){
                    dq.pollFirst();
                    continue;
                }
                if (v > a[i]) break;
                set.add(v);
                dq.pollFirst();
                int diff = Math.abs(i - pair.ind) + 1;
                ans[v] = 2 * diff;
            }
        }
   //     debug(ans);
        return ans;
    }

    static class Pair implements Comparable<Pair> {

        int ind;
        int v;
        Pair(int ind, int v) {
            this.ind = ind;
            this.v = v;
        }
        @Override
        public int compareTo(Pair o) {
            if (this.v == o.v) {
                return Integer.compare(this.ind, o.ind);
            } else {
                return Integer.compare(this.v, o.v);
            }
        }

        @Override
        public String toString() {
            return "[" + this.ind + " " + this.v + "]";
        }
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
