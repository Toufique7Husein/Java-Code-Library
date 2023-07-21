//created by Toufique on 14/06/2023

import java.io.*;
import java.util.*;

public class NT_E {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            long x = in.nextLong(), k = in.nextLong();
            a[i][0] = x;
            a[i][1] = k;
        }
        pw.println(nod(a, n) + " " + sod(a, n) + " " + pod(a, n));

        pw.close();
    }

    static long nod(long[][] a, int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ((ans % mod) * ((a[i][1] + 1) % mod)) % mod;
        }
        return ans;
    }
    static long sod(long[][] a, int n) {
        long ans = 1;

        //s = (p ^ a + 1 + 1) / (p - 1)
        for (int i = 0; i < n; i++) {
            long neu = (bigMod(a[i][0], a[i][1] + 1, mod) - 1 + mod) % mod;
            long den = (bigMod(a[i][0] - 1, mod - 2, mod)) % mod;
            long s = (neu * den) % mod;

            ans = (ans * s) % mod;
        }
        return ans;
    }
    static long pod(long[][] a, int n) {
        long ans = 1;
        long nod = nod(a, n);

        for (int i = 0; i < n; i++) {
            long exp = ((a[i][1] % mod) * (nod % mod)) % mod;
            long denInv = bigMod(2, mod - 2, mod);
            long temp = (exp * denInv) % mod;
            ans = ((ans % mod) * ((bigMod(a[i][0], temp, mod) % mod))) % mod;
        }
        return ans;
    }

    static long bigMod(long base, long pow, long mod) {
        if (pow == 0) return 1 % mod;
        long x = bigMod(base, pow / 2, mod);
        x = (x * x) % mod;
        if (pow % 2 == 1) x = (x * base) % mod;
        return x;
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
