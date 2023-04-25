//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_859D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), q = in.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                int x = in.nextInt();
                if (x % 2 != 0) a[i] = 1;
            }
            for (int i = 1; i <= n; i++) a[i] += a[i - 1];
            for (int i = 0; i < q; i++) {
                int l = in.nextInt(), r = in.nextInt(), k = in.nextInt();
                int changed = r - l + 1;
                int outer = a[l - 1] + (a[n] - a[r]);
                if (k % 2 != 0 && changed % 2 != 0) outer++;
                if (outer % 2 != 0) pw.println("YES");
                else pw.println("NO");
            }

        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
