//created by Toufique on 19/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_874C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            if (even(a, n) || odd(a, n) || solve(a, n)) pw.println("YES");
            else pw.println("NO");
        }

        pw.close();
    }

    static boolean solve(int[] a, int n) {
        int min = Integer.MAX_VALUE;
        for (int i: a) {
            if (i % 2 != 0) {
                min = Math.min(i, min);
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && min > a[i]) return false;
        }
        return true;
    }

    static boolean even(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) return false;
        }
        return true;
    }
    static boolean odd(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) return false;
        }
        return true;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
