//created by Toufique on 18/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_880A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(n, a) ? "YES" : "NO");
        }

        pw.close();
    }

    static boolean solve(int n, int[] a) {
        boolean[] vis = new boolean[n];
        boolean all = false;
        while(!all) {
            int max = -1;
            int indx = -1;
            for (int i = 0; i < n; i++) {
                if (max < a[i] && !vis[i]) {
                    max = a[i];
                    indx = i;
                }
            }
            if (max == -1) return true;
            vis[indx] = true;
            for (int i = max - 1; i >= 0; i--) {
                boolean ok = false;
                for (int j = 0; j < n; j++) {
                    if (!vis[j] && a[j] == i) {
                        vis[i] = true;
                        ok = true;
                        break;
                    }
                }
                if (!ok) return false;
            }
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (!vis[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) return true;
        }
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
