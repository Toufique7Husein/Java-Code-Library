//created by Toufique on 27/01/2023

import java.io.*;
import java.util.*;

public class Div3_847B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), s = in.nextInt(), r = in.nextInt();
            int steel = s - r;
            int remain = r / (n - 1);
            int mod = r % (n - 1);
            pw.print(steel + " ");
            for (int i = 0; i < (n - 1); i++) {
                int v = remain;
                if (mod > 0) {
                    mod--;
                    v++;
                }
                pw.print(v + " ");
            }
            pw.println();
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
