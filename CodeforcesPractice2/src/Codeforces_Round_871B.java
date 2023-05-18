//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int ans = 0, cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    ans = Math.max(ans, cnt);
                    cnt = 0;
                    continue;
                }
                if (a[i] != 1) cnt++;
            }
            ans =Math.max(ans, cnt);
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
