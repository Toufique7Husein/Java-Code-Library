//created by Toufique on 14/07/2023

import java.io.*;
import java.util.*;

public class A_PinelyRound1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            char[][] mat = new char[n][n];
            for (int i = 0; i < n; i++) mat[i] = in.next().toCharArray();
            HashSet<Integer>[] sets = solve(mat, n);
            for (int i = 1; i <= n; i++) {
                pw.print(sets[i].size() + " ");
                for (int x: sets[i]) pw.print(x + " ");
                pw.println();
            }
        }

        pw.close();
    }

    static HashSet<Integer>[] solve(char[][] mat, int n) {
        HashSet<Integer>[] sets = new HashSet[n + 1];
        for (int i = 0; i <= n; i++) sets[i] = new HashSet<>();
        for (int i = 1; i <= n; i++) sets[i].add(i);
      //  debug(sets);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == '1') {
                    sets[j + 1].add(i + 1);
                }
            }
        }
        return sets;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
