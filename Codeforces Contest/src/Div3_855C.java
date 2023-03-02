//created by Toufique on 02/03/2023

import java.io.*;
import java.util.*;

public class Div3_855C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            pw.println(solve(a, n));
        }

        pw.close();
    }

    static long solve(long[] a, int n) {
        long ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) pq.add(a[i]);
            else {
                if (!pq.isEmpty()) ans += pq.remove();
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
