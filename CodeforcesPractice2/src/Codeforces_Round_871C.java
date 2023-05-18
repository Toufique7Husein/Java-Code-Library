//created by Toufique on 06/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_871C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] m = new int[n];
            char[][] s = new char[n][];
            for (int i = 0; i < n; i++) {
                m[i] = in.nextInt();
                s[i] = in.next().toCharArray();
            }
            int ans = Math.min(oneOne(m, s, n),zeroOne(m, s, n));
            pw.println(ans == (int)1e6 ? -1 : ans);
        }

        pw.close();
    }

    static int oneOne(int[] m, char[][] s, int n) {
        int res = (int)1e6;
        for (int i = 0; i < n; i++) {
            if (s[i][0] == '1' && s[i][1] == '1') {
                res = Math.min(res, m[i]);
            }
        }
        return res;
    }
    static int zeroOne(int[] m,char[][] s, int n) {
        int z0 = (int)1e6;
        int o1 =(int)1e6;
        for (int i = 0; i < n; i++) {
            //debug(s[i][0], s[i][1], m[i]);
            if (s[i][0] == '0' && s[i][1] == '1') z0 = Math.min(z0, m[i]);
            if (s[i][0] == '1' && s[i][1] == '0') o1 = Math.min(o1, m[i]);
        }
        return z0 + o1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
