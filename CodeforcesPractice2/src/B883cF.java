//created by Toufique on 07/07/2023

import java.io.*;
import java.util.*;

public class B883cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[][] mat = new char[3][3];
            for (int i = 0; i < 3; i++) mat[i] = in.next().toCharArray();
            pw.println(solve(mat));
        }

        pw.close();
    }

    static String solve(char[][] mat) {
        for (int i = 0; i < 3; i++) {
            char c = mat[i][0];
            boolean in = true;
            if (c == '.')in = false;
            if (in) {
                boolean ok = true;
                for (int j = 1; j < 3; j++) {
                    if (mat[i][j] != c) {
                        ok = false;
                        break;
                    }
                }
                if (ok) return c + "";
            }
            boolean ok = true;
            char cx = mat[0][i];
         //   debug(cx);
            if (cx == '.') continue;
            for (int j = 1; j < 3; j++) {
                if (mat[j][i] != cx) {
                    ok = false;
                    break;
                }
            }
            if (ok)return cx+"";
        }

        if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2] && mat[0][0] != '.') return mat[0][0] +"";
        if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0] && mat[0][2] != '.') return mat[1][1] +"";
        return "DRAW";
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
