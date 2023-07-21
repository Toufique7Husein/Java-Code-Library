//created by Toufique on 07/07/2023

import java.io.*;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt(), h = in.nextInt();
            ArrayList<Pair> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Long> time = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    time.add(in.nextLong());
                }
                Collections.sort(time);
                long penalty = 0;
                int cnt = 0;
                long T = 0;
                for (int x = 0; x < m; x++) {
                    T += time.get(x);
                    if (T > h) break;
                    cnt++;
                }
                long cf = cnt;
                for (int x = 0; x < cnt; x++) {
                    penalty += (cf * time.get(x));
                    cf--;
                }
                p.add(new Pair(cnt, penalty, i));
            }
         //   debug(p);
            Collections.sort(p);
           // debug(p);
            for (int x = 0; x < p.size(); x++) {
                if (p.get(x).ind == 0) {
                    pw.println(x + 1);
                    break;
                }
            }
        }

        pw.close();
    }


    static class Pair implements Comparable<Pair> {
        int cnt;
        long penalty = 0;
        int ind;

        Pair(int cnt, long penalty, int ind) {
            this.cnt = cnt;
            this.penalty = penalty;
            this.ind = ind;
        }


        @Override
        public int compareTo(Pair o) {
            if (this.cnt == o.cnt) {
                if (this.penalty > o.penalty) return 1;
                if (this.penalty == o.penalty) return 0;
                return -1;
            }
            if (this.cnt < o.cnt) return 1;
            return -1;
        }
        @Override
        public String toString() {
            return "[" + cnt + " " + penalty + "]";
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
