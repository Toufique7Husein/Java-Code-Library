//created by Toufique on 28/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round875A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int tot = n + 1;

            for (int i = 0; i < n; i++) {
                int need = tot - a[i];
                pw.print(need + " ");
            }
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
