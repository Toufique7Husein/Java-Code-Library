//created by Toufique on 25/07/2023

import java.io.*;
import java.util.*;

public class C888cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n, k) ? "YES" : "NO");
        }

        pw.close();
    }
    static boolean solve(int[] a, int n, int k) {
        if (a[0] == a[n - 1]) {
            int cnt = 0;
            for (int i: a) if (i == a[0]) cnt++;
            if (cnt >= k) return true;
            return false;
        }
        int last = -1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[0] == a[i]) cnt++;
            if (cnt == k) {
                last = i;
                break;
            }
        }
        cnt = 0;
        if (last == -1) return false;
        for (int i = last + 1; i < n; i++) {
            if (a[n - 1] == a[i]) cnt++;
        }
        if (cnt >= k) return true;
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
