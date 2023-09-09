//created by Toufique on 26/08/2023

import java.io.*;
import java.util.*;

public class AAA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long x = in.nextLong(), y = in.nextLong();
            long n = in.nextLong();
            ArrayDeque<Long> dq = new ArrayDeque<>();
            long v = 0;
            long last = v;
            for (int i = 0; i < n - 1; i++) {
                dq.addFirst(last - v);
                last = last - v;
                v = v + 1;
            }

            long l = dq.peekFirst() - x;
            debug(l, v);
            if (l >= v) {
                dq.addFirst(x);
                while (!dq.isEmpty()) pw.print(dq.pollFirst() + " ");
                pw.println();
            } else pw.println(-1);

        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
