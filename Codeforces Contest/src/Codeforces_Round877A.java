//created by Toufique on 04/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round877A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            int oneIdx = -1, twoIdx = -1, lastIdx = -1;
            for (int i = 1; i <= n; i++) {
                if (a[i] == 1) {
                    oneIdx = i;
                }
                if (a[i] == 2) {
                    twoIdx = i;
                }
                if (a[i] == n) {
                    lastIdx = i;
                }
            }

            //1 2 5
            if (oneIdx < twoIdx && twoIdx < lastIdx) {
                pw.println(twoIdx + " " + lastIdx);
            //    debug(twoIdx);
                continue;
            }
            //2 1 5
            if (twoIdx < oneIdx && oneIdx < lastIdx) {
                pw.println(oneIdx + " " + lastIdx);
                continue;
            }
            //5 1 2
            if (lastIdx < oneIdx && oneIdx < twoIdx) {
                pw.println(lastIdx + " " + oneIdx);
                continue;
            }
            //5 2 1
            if (lastIdx < twoIdx && twoIdx < oneIdx) {
                pw.println(lastIdx + " " + twoIdx);
                continue;
            }
            pw.println(oneIdx + " " + oneIdx);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
