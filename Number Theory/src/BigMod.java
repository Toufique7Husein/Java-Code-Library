//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

public class BigMod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }

        pw.close();
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
