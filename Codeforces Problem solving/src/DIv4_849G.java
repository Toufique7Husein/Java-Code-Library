//created by Toufique on 11/02/2023

import java.io.*;
import java.util.*;

public class DIv4_849G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n, k));
        }

        pw.close();
    }

    static int solve(long[] A, int n, long tel) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            A[i] = A[i] + i + 1;
        }
        ArrayList<Long> ls = new ArrayList<>();
        for (long i: A) ls.add(i);
        Collections.sort(ls);
        long sum = 0;
        for (int i = 0; i < n; i++ ){
            long v = ls.get(i);
            if ((sum + v) > tel) break;
            sum += v;
            ans++;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
