//created by Toufique on 30/07/2023

import java.io.*;
import java.util.*;

public class C814cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayDeque<Pair> deque = new ArrayDeque<>();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++) {
                long c = in.nextLong();
                deque.addLast(new Pair((long)i + 1, c));
                a[i + 1] = c;
            }
            for (int i = 0; i < q; i++) {
                long ind = in.nextLong(), k = in.nextLong();
             //   pw.println(solve(deque, k, ind, a));
            }
            debug(solve(deque));
        }

        pw.close();
    }

    static HashMap<Long, ST> solve(ArrayDeque<Pair> deque) {
        ArrayDeque<Pair> dq = new ArrayDeque<>();
        HashMap<Long, ST> map = new HashMap<>();
        for (Pair p: deque) dq.addLast(p);
        long ans = 0;
        long k = 0;
        while (!dq.isEmpty()) {
           Pair v1 = dq.pollFirst();
           k++;
           if (dq.isEmpty()){
               if (!map.containsKey(v1.v)) {
                   map.put(v1.v, new ST(k, k));
               } else {
                   ST p = map.get(v1.v);
                   map.put(v1.v, new ST(p.start, k));
               }
               break;
           }
           Pair v2 = dq.pollFirst();
           if (v1.v > v2.v) {
               long v = v1.v;
               if (map.containsKey(v)) {
                   ST p = map.get(v);
                   map.put(v, new ST(p.start, k));
               } else {
                   map.put(v, new ST(k, k));
               }
               dq.addFirst(v1);
           } else {
               long v = v2.v;
               if (map.containsKey(v)) {
                   ST p = map.get(v);
                   map.put(v, new ST(p.start, k));
               } else {
                   map.put(v, new ST(k, k));
               }
               dq.addFirst(v1);
           }
        }
        return map;
    }

    static class ST{
        long start = -1;
        long end = -1;


        ST(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "ST{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    static class Pair {
        long ind;
        long v;
        Pair(long ind, long v) {
            this.ind = ind;
            this.v = v;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "ind=" + ind +
                    ", v=" + v +
                    '}';
        }
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
