//created by Toufique on 04/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round877C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] ans = solve(n, m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pw.print(ans[i][j] + " ");
                }
                pw.println();
            }
        }
        pw.close();
    }

    static int[][] solve(int n, int m) {
        int[][] ans = new int[n][m];
        int val = 1;
        for(int i = 1; i < n; i += 2) {
            for (int j = 0; j < m; j++){
                ans[i][j] += val;
                val++;
            }
        }
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                ans[i][j] += val;
                val++;
            }
        }
        return ans;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
