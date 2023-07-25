//created by Toufique on 21/07/2023

import java.io.*;
import java.util.*;

public class B886cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int prev = 0, idx = -1;
            for (int i = 0; i < n; i++) {
                int a = in.nextInt(), b = in.nextInt();
                if (a <= 10 && prev < b) {
                    prev = b;
                    idx = i + 1;
                }
            }
            pw.println(idx);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
