//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

/*Write a recursive solution to evaluate the previous polynomial for any given x and n. Like, when x=2 and n=5, we have 1 + x + x2 + ................. + xn-1 = 31*/

public class Problem_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long x = in.nextLong(), n = in.nextLong();
        pw.println(solve(0, n, x));

        pw.close();
    }

    static long solve(int i, long n, long x) {
        if (n == 0) return 1;
        if (i < n) return (long)Math.pow(x, i) + solve(i + 1, n, x);
        debug(i);
        return 0;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
