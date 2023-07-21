import java.util.*;
import java.io.*;
public class Main {
    static long M = (long)1e9 + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(solve(in.nextLong()));
        pw.close();
    }

    static long solve(long n) {
        long ans = 0;
        long deno = bigMod(2, (long)(1e9 + 7L) - 2L, (long)(1e9 + 7L));
        //debug(deno);
        for (long i = 1; i <= n; ) {
            long q = n / i;
            long next = n / q + 1;

            long left = (((i - 1 + M) % M) * (i % M)) % M;
            left = ((left % M) * (deno % M)) % M;

            long right = ((next % M) * ((next - 1 + M) % M)) % M;
            right = ((right % M) * (deno % M)) % M;

            long v = ((q % M) * (right - left + M) % M) % M;
            ans = ((ans % M) + (v% M)) % M;
            i = next;
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

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}