//created by Toufique on 15/08/2023

import java.io.*;
import java.util.*;

public class B893cF {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt   < t; tt++) {
            long n = in.nextLong(), d = in.nextLong(), m = in.nextLong();
            long[] a = new long[(int)m + 1];
            for(int i = 0; i < m; i++) a[i] = in.nextLong();
            a[(int)m] = in.nextLong();
        }

        pw.close();
    }

    static String solve(long[] a, long d, long m) {
        long ans = 0;
        ans += m;
        for (int i = 0; i <= m; i++) {
            
        }


        return "";
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
