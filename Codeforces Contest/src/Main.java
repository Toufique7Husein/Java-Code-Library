import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        outer:
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            long x = in.nextLong(), y = in.nextLong();
            long tot = n * (n + 1L) / 2L;

            long common = (n / lcm(x, y));
            long removeX = (n - (n / x)) + common;
            //  debug(removeX);
            long xx = tot - (removeX * (removeX + 1L) / 2L);
            long Y = (n / y) - common;
            //    debug(Y);
            long removeY = Y * (Y + 1L) / 2L;

            pw.println(xx - removeY);
        }

        pw.close();
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static long gcd(long a, long b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}