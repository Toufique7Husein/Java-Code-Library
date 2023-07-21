//created by Toufique on 20/06/2023

import java.io.*;
import java.util.*;

public class Cf_Round881C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            pw.println(solve(n));
        }

        pw.close();
    }

    static long solve(long n) {
        long ans = 0;
        ans += n;
        while (n != 0) {
            n /= 2;
            ans += n;
        }
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
