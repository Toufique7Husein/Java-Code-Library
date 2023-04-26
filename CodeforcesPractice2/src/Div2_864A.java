//created by Toufique on 08/04/2023

import java.io.*;
import java.util.*;

public class Div2_864A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();

            if ((x1 == 1 && y1 == 1) || (x1 == n && y1 == 1) || (x1 == 1 && y1 == m) || (x1 == n && y1 == m)) {
                pw.println(2);
                continue;
            }
            if ((x2 == 1 && y2 == 1) || (x2 == n && y2 == 1) || (x2 == 1 && y2 == m) || (x2 == n && y2 == m)) {
                pw.println(2);
                continue;
            }

            if (x1 == 1 || x2 == 1 || x1 == n || x2 == n || y1 == 1 || y2 == 1 || y1 == m || y2 == m) {
                pw.println(3);
                continue;
            }
            pw.println(4);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
