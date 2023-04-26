//created by Toufique on 09/04/2023

import java.io.*;
import java.util.*;

public class Div2_864B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt();
            int[][] mat = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) mat[i][j] = in.nextInt();
            }
            pw.println(solve(mat, n, k) ? "YES" : "NO");
        }

        pw.close();
    }

    static boolean solve(int[][] mat, int n, int k) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = mat[i][j];
                int temp2 = mat[n - 1 - i][n - 1 - j];
                if (temp != temp2) k--;
                if (k < 0) return false;
            }
        }
      //  debug(n, k);
        if (n % 2 == 0 && k % 2 == 0) return true;
        if (n % 2 == 0) return false;
        for (int j = 0, m = n - 1; j < n / 2; j++, m--) {
            if (mat[n / 2][j] != mat[n / 2][m]) k--;
            if (k < 0) return false;
        }
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
