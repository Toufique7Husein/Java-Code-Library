//created by Toufique on 12/04/2023

import java.io.*;
import java.util.*;

public class CodeTone_4A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n) ? "YES" : "NO");
        }

        pw.close();
    }
    static boolean solve(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] <= i + 1) return true;
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
