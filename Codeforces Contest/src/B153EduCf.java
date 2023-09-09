//created by Toufique on 17/08/2023

import java.io.*;
import java.util.*;

public class B153EduCf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long m = in.nextLong(), k = in.nextLong(), a1 = in.nextLong(), ak = in.nextLong();

            pw.println(solve2(m, k, a1, ak));
        }

        pw.close();
    }
    static long solve2(long m, long k, long a1, long ak) {
        if (m <= a1) return 0L;
        if (m < k) {
            return (m - a1);
        }
        long ans = 0;
        long cf = m / k;
        long one = m - cf * k;
        if (one > a1) {
            one -= a1;
            a1 = 0;
            ans = one;
        } else {
            a1 -= one;
        }
        ak += (a1 / k);
        if (cf > ak) {
            cf -= ak;
            ans += cf;
        }
       // debug(ans);
        return ans;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
