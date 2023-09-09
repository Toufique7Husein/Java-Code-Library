//created by Toufique on 29/07/2023

import java.io.*;
import java.util.*;

public class A889cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for(int i = 1; i <= n; i++) a[i] = in.nextInt();
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                if (i == a[i]) cnt++;
            }
        //    debug();
            int ans = cnt / 2;
            if (cnt % 2 != 0) ans++;
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
