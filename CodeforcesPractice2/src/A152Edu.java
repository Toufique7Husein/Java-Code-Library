//created by Toufique on 27/07/2023

import java.io.*;
import java.util.*;

public class A152Edu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long b = in.nextLong(), c = in.nextLong(), h = in.nextLong();
            long tot = c + h;
            long ans = 0;
            for (long j = tot; j >= 1; j--) {
                long need = j + 1;
                if (need <= b) {
                //    debug(j);
                    ans = j * 2 + 1;
                    break;
                }
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
