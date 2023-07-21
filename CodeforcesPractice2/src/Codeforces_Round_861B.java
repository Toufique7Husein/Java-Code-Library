//created by Toufique on 22/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_861B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            Integer[][] a = new Integer[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) a[i][j] = in.nextInt();
            }
            debug(a);
            pw.println(solve(a, n, m));
        }
        pw.close();
    }

    static long solve(Integer[][] a, int n, int m) {
        long ans = 0;

        for (int i = 0; i < m; i++) {
            ArrayList<Long> ls = new ArrayList<>();
            for (int j = 0; j < n; j++) ls.add((long)a[j][i]);
            Collections.sort(ls);
            long[] temp = new long[n];
            temp[0] = ls.get(0);
            for (int j = 1; j < n; j++) temp[j] = ls.get(j) + temp[j - 1];
            debug(temp);
        }

        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
