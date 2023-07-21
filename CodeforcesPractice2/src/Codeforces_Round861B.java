//created by Toufique on 26/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round861B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            Integer[][] mat = new Integer[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = in.nextInt();
            }
            pw.println(solve(mat, n, m));
        }

        pw.close();
    }

    static long solve(Integer[][] mat, int n, int m) {
        long ans = 0;
        for(int i = 0; i < m; i++) {
            Integer[] a = new Integer[n];
            for (int j = 0; j < n; j++) a[j] = mat[j][i];
            Arrays.sort(a);
            Integer[] temp = Arrays.copyOf(a, n);
            for (int j = n - 2; j >= 0; j--) a[j] += a[j + 1];
            for (int j = 0, k = n - 1; j < n - 1; j++, k--) ans += (a[j + 1] - (long)k * temp[j]);
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
