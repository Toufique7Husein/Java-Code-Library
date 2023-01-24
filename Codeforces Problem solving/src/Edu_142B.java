//created by Toufique on 24/01/2023

import java.io.*;
import java.util.*;

public class Edu_142B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long a1 = in.nextLong(), a2 = in.nextLong(), a3 = in.nextLong(), a4 = in.nextLong();
            long ans = a1;
            if (ans > 0) {
                ans += Math.min(a2, a3) * 2;
                long rem = a2 - Math.min(a2, a3) + a3 - Math.min(a2, a3) + a4;
                ans += Math.min(a1 + 1, rem);
            } else ans = 1;
            pw.println(ans);
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}