//created by Toufique on 11/07/2023

import java.io.*;
import java.util.*;

public class B837cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            int[] x = new int[n + 1];
            Arrays.fill(x, -1);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt(), b = in.nextInt();
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                x[b] = Math.max(x[b], a);
            }
            pw.println(solve(n, m, x));
        }

        pw.close();
    }


    static long solve(int n, int m, int[] x) {
        long ans = 0;
        long prev = 0;
        for (int i = 1; i <= n; i++) {
            if (x[i] == -1) {
                ans += (i - prev);
            } else {
                prev = Math.max(prev, x[i]);
                ans += (i - prev);
            }
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
