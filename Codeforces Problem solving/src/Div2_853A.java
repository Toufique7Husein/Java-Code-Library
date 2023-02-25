//created by Toufique on 25/02/2023

import java.io.*;
import java.util.*;

public class Div2_853A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            boolean ok = false;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    ok |= gcd(a[i], a[j]) <= 2;
                }
            }
            if (ok) pw.println("Yes");
            else pw.println("No");
        }

        pw.close();
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
