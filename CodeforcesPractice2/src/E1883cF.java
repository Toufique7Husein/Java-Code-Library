//created by Toufique on 08/07/2023

import java.io.*;
import java.util.*;

public class E1883cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            pw.println(solve(n) ? "YES" : "NO");
        }
        pw.close();
    }
    static boolean solve(long n) {
        for (int i = 2; i <= 1000; i++) {
            long sum = 1;
            long k = i;
            sum += k;
            while (sum <= n) {
                k *= i;
                sum += k;
                if (sum == n) return true;
            }
        }
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
