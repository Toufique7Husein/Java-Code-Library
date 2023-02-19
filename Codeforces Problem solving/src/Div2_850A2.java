//created by Toufique on 19/02/2023

import java.io.*;
import java.util.*;

public class Div2_850A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt() - 1;
            int a[][] = {{0, 1}, {0, 0}}, s = 2;
            for (int i = 2, j = 1, x; n > 0; i += 2, j++) {
                x = Math.min(2 * i + 1, n);
                n -= x;
                if (x % 2 > 0) {
                    a[j % 2][s % 2] += x / 2 + 1;
                    a[j % 2][1 - s % 2] += x / 2;
                } else {
                    a[j % 2][s % 2] += x / 2;
                    a[j % 2][1 - s % 2] += x / 2;
                }
                s += x;
            }
            pw.println(a[0][1] + " " + a[0][0] + " " + a[1][1] + " " + a[1][0]);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
