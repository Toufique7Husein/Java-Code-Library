//created by Toufique on 18/09/2023

import java.io.*;
import java.util.*;

public class A_codeTon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong(), k = in.nextLong(), x = in.nextLong();
            pw.println(solve(n, k, x));
        }

        pw.close();
    }

    static long solve(long n, long k, long x) {
        if (n < k || (x + 1) < k) return -1;
        ArrayList<Long> ls = new ArrayList<>();
        long sum = 0;
        for (long i = 0; i < k; i++) ls.add(i);
        if (ls.size() > n) return -1;
        int need = (int)n - ls.size();
        long add = x;
        if (k == x) add = x - 1;
        for (int i = 0; i < need; i++) ls.add(add);
     //   debug(ls);
        for (long v: ls) sum += v;
        return sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
