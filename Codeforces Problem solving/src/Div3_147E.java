//created by Toufique on 27/01/2023

import java.io.*;
import java.util.*;

public class Div3_147E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            pw.println(solve(a, n));
        }

        pw.close();
    }

    static long solve(long[] a, int n) {
        int numOfNeg = 0;
        long sum = 0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) numOfNeg++;
            sum += Math.abs(a[i]);
            min = Math.min(Math.abs(a[i]), min);
        }
        debug(sum);
        if(numOfNeg % 2 != 0) {
            sum -= 2 * min;
        }
        return sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
