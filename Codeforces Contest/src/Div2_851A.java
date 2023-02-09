//created by Toufique on 09/02/2023

import java.io.*;
import java.util.*;

public class Div2_851A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int cnt = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                if (v == 2) cnt++;
                a[i] = v;
            }
            if (cnt % 2 != 0) {
                pw.println(-1);
                continue;
            }
            if (cnt == 0) {
                pw.println(1);
                continue;
            }
            cnt /= 2;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 2) cnt--;
                ans++;
                if (cnt == 0) break;
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
