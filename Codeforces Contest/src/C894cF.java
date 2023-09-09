//created by Toufique on 24/08/2023

import java.io.*;
import java.util.*;

public class C894cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            long[] cnt = new long[n + 9];
            for (long x: a) {
                if (x > n) cnt[n]++;
                else cnt[(int)x]++;
            }
            for (int i = n; i >= 0; i--) {
                cnt[i] += cnt[i + 1];
            }
            ArrayList<Long> ans = new ArrayList<>();
            for (int i = 1; i <= n; i++) ans.add(cnt[i]);

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != ans.get(i)) {
                    ok = false;
                    break;
                }
            }
            if (ok)pw.println("YES");
            else pw.println("NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
