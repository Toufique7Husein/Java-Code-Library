//created by Toufique on 28/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round875B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n], b = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            for (int i = 0; i < n; i++) b[i] = in.nextInt();
            pw.println(solve(a, b, n));
        }

        pw.close();
    }
    static int solve(int[] a, int[] b, int n) {
        int[] cnt = new int[2 * n + 3];
        int ans = 0;
        for (int i = 0; i < n; ) {
            int rep = 0;
            int j = i;
            for (; j < n; j++) {
                if (a[i] == a[j])rep++;
                else break;
            }
            cnt[a[i]] = Math.max(cnt[a[i]], rep);
            i = j;
        }

        int[] cnt2 = new int[2 * n + 3];
        for (int i = 0; i < n; ) {
            int rep = 0;
            int j = i;
            for (; j < n; j++) {
                if (b[i] == b[j])rep++;
                else break;
            }
            cnt2[b[i]] = Math.max(cnt2[b[i]], rep);
            i = j;
        }

        for (int i = 0; i <= 2 * n; i++) {
            ans = Math.max(cnt[i] + cnt2[i], ans);
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
