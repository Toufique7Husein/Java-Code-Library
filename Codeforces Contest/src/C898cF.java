//created by Toufique on 21/09/2023

import java.io.*;
import java.util.*;

public class C898cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = 10;
            char[][] mat = new char[n][];
            for (int i = 0; i < n; i++) mat[i] = in.next().toCharArray();
            pw.println(solve(mat, n, n));
        }

        pw.close();
    }

    static long solve(char[][] mat, int n, int m) {
        long ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long v1 = i, v2 = j;
                if (v1 >= 5) v1 = 10 - v1;
                else v1++;
                if (v2 >= 5) v2 = 10 - v2;
                else v2++;


              //  ans += Math.min(v1, v2);

                if (mat[i][j] == 'X'){
                   // debug(v1, v2, i, j);
                    ans += Math.min(v1, v2);
                }
            }
        }


        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
