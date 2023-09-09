//created by Toufique on 24/08/2023

import java.io.*;
import java.util.*;

public class D894cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            pw.println(solve(n));
        }

        pw.close();
    }

    static long solve(long n) {
        ArrayList<Long> ls = new ArrayList<>();
        long l = 2, r = (long)1e10;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long v = calc(mid);
          //  debug(v, mid);
            if (v > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
                ls.add(mid + (n - v));
            }
        }
        return Collections.min(ls);
    }

    static long calc(long v) {
        long x = v * (v + 1) / 2;
        x -= v;
        return x;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
