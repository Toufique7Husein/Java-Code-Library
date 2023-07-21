//created by Toufique on 05/07/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round847E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for(int tt = 0; tt < t; tt++) {
            int x = in.nextInt();
            if (x % 2 != 0) {
                pw.println(-1);
                continue;
            }

            int a = x + (x  / 2);
            int b = x / 2;
            int l = a ^ b;
            int r = (a + b) / 2;
            if (l == r) pw.println(a + " " + b);
            else pw.println(-1);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
