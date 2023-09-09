//created by Toufique on 05/08/2023

import java.io.*;
import java.util.*;

public class A890cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            ArrayList<Long> ls = new ArrayList<>();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }

            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    ls.add(a[i - 1]);
                }
            }
            if(ls.isEmpty()) {
                pw.println(0);
                continue;
            }
            pw.println(Collections.max(ls));
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
