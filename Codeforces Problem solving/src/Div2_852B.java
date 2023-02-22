//created by Toufique on 22/02/2023

import java.io.*;
import java.util.*;

public class Div2_852B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int big = in.nextInt(), small = in.nextInt();
            pw.println((big - small) * 2);
            for (int i = small; i <= big; i++) {
                pw.print(i + " ");
            }
            for (int i = big - 1; i > small; i--) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
