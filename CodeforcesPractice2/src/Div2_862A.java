//created by Toufique on 26/04/2023

import java.io.*;
import java.util.*;

public class Div2_862A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(n, a));
        }

        pw.close();
    }

    static int solve(int n, int[] a) {
        int ans = -1;

        for (int i = 0; i <= 256; i++) {
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = a[j] ^ i;
            }

            int xor = b[0];
            for (int j = 1; j < n; j++) xor ^= b[j];
            if (xor == 0) return i;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
