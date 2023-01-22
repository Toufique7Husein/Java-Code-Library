//created by Toufique on 21/01/2023

import java.io.*;
import java.util.*;

public class Div2_845B {
    static HashMap<Long, Long> map;
    static HashMap<Long, Long> fact;
    static long N = (long)1e5 + 5;
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        build();
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            long ans = ((map.get(n) % mod) * (fact.get(n) % mod)) % mod;
            pw.println(ans);
        }

        pw.close();
    }

    static void build() {
        map = new HashMap<>();
        //2, 6, 12, 20...
        //1 * 2, 1 * 2 + 2 * 2, 1 * 2 + 2 * 2 + 3 * 2, 1 * 2 + 2 * 2 + 3 * 2 + 4 * 2
        long prev = 2;
        map.put(1L, 0L);
        map.put(2L, 2L);
        for (long i = 2; i <= N; i++) {
            prev = i * 2L + prev;
            map.put((i + 1L), prev);
        }
        //   debug(map.get(5L));
        //factorial
        fact = new HashMap<>();
        fact.put(1L, 1L);
        long pre = 1L;
        for (long i = 1; i <= N; i++) {
            pre *= i;
            pre %= mod;
            fact.put(i, pre);
        }
        // debug(fact.get((long)1e5));
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
