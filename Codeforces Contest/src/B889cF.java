//created by Toufique on 29/07/2023

import java.io.*;
import java.util.*;

public class B889cF {
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


    static int solve(long n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (long i = 1; i <= (long)1e3; i++) {
            int cnt = 0;
            for (long j = i; j <= 100; j++) {
                if (n % j == 0) cnt++;
                else break;
            }
            ans.add(cnt);
        }

       /* long v = 1;
        for (long i = 1; i <= 22; i++) {
            v *= i;
        }
        debug(Long.MAX_VALUE);
        debug(v);*/
        ans.add(0);
        int len = Collections.max(ans);
        return len;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
