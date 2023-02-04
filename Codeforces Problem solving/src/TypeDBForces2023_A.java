//created by Toufique on 04/02/2023

import java.io.*;
import java.util.*;

public class TypeDBForces2023_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            if (n % 2 != 0) {
                pw.println(-1);
            } else {
                long y = n / 2;
                pw.println(1 + " " + y);
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
