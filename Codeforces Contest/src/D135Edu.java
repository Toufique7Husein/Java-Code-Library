//created by Toufique on 30/07/2023

import java.io.*;
import java.util.*;

public class D135Edu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            Map<Long, Integer> a = new HashMap<>(), b = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                a.put(x, a.getOrDefault(x, 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                b.put(x, b.getOrDefault(x, 0) + 1);
            }
            pw.println(solve(a, b, n));
        }

        pw.close();
    }

    static int solve(Map<Long, Integer> a, Map<Long, Integer> b, int n) {
        int ans = 0;
        long[] aa = new long[n];
        int idx= 0;
        for (Map.Entry<Long, Integer> m: a.entrySet()) {
            long k = m.getKey();
            int cnt = m.getValue();
            for (int i = 0; i < cnt; i++) aa[idx++] = k;
        }

     //   debug(aa);
        for (long i: aa) {
            if (a.containsKey(i) && b.containsKey(i)) {
                int cnt = a.get(i);
                cnt--;
                if (cnt == 0) a.remove(i);
                else a.put(i, cnt);

                int cnt2 = b.get(i);
                cnt2--;
                if (cnt2 == 0) b.remove(i);
                else b.put(i, cnt2);
            }
        }

      //  debug(a);
        Map<Integer, Integer> A = new HashMap<>(), B = new HashMap<>();
        for (Map.Entry<Long, Integer> x: a.entrySet()) {
            long k = x.getKey();
            int v = x.getValue();

            if (k > 9) {
                ans += v;
                int len = Long.toString(k).length();
                A.put(len, A.getOrDefault(len, 0) + v);
            }else {
               // ans++;
                A.put((int)k, A.getOrDefault((int)k, 0) + v);
            }
        }
        //debug(ans);
        for (Map.Entry<Long, Integer> x: b.entrySet()) {
            long k = x.getKey();
            int v = x.getValue();

            if (k > 9) {
                ans += v;
                int len = Long.toString(k).length();
                B.put(len, B.getOrDefault(len, 0) + v);
            } else {
                B.put((int)k, B.getOrDefault((int)k, 0) + v);
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m: A.entrySet()) {
            int k = m.getKey(), v = m.getValue();
            for (int i = 0; i < v; i++) ls.add(k);
        }

        for (int x: ls) {
            if (A.containsKey(x) && B.containsKey(x)) {
                int cnt = A.get(x);
                cnt--;
                if (cnt == 0) A.remove(x);
                else A.put(x, cnt);

                int cnt2 = B.get(x);
                cnt2--;

                if (cnt2 == 0) B.remove(x);
                else B.put(x, cnt2);
            }
        }

        for (Map.Entry<Integer, Integer> m: A.entrySet()) {
            if (m.getKey() > 1) ans += m.getValue();
        }
        for (Map.Entry<Integer, Integer> m: B.entrySet()) {
            if (m.getKey() > 1) ans += m.getValue();
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
