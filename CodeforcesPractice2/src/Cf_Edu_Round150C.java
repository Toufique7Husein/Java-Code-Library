//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

public class Cf_Edu_Round150C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] c = in.next().toCharArray();
            pw.println(solve(c.length, c));
        }

        pw.close();
    }
    static long solve(int n, char[] c) {
        long ans = Long.MIN_VALUE;

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            if (c[i] == 'A') a[i] = 1;
            if (c[i] == 'B') a[i] = 10;
            if (c[i] == 'C') a[i] = 100;
            if (c[i] == 'D') a[i] = 1000;
            if (c[i] == 'E') a[i] = 10000;
        }
        HashMap<Long, Long> map = new HashMap();
        map.put(1L, 0L);
        map.put(10L, 0L);
        map.put(100L, 0L);
        map.put(1000L, 0L);
        map.put(10000L, 0L);

        long[] prefix = new long[n];
        long max = a[n - 1];
        prefix[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            if (max <= a[i]) {
                max = a[i];
                prefix[i] = prefix[i + 1] + a[i];
            } else {
                prefix[i] = prefix[i + 1] - a[i];
            }
        }
        long[] dp = new long[5];
        for (int i = 0; i < n; i++) {
            long temp = 0;
            {
               long tem = map.get(1);
            }
            {

            }
            {

            }
        }


        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
