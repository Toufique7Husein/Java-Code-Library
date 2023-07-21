//created by Toufique on 29/06/2023

import java.io.*;
import java.util.*;

public class Codeforces_EduRound151A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), k = in.nextInt(), x = in.nextInt();
            if (k == 1) {
                pw.println("NO");
                continue;
            }
            if (x != 1) {
                pw.println("YES");
                pw.println(n);
                for (int i = 0; i < n; i++) pw.print(1 + " ");
                pw.println();
                continue;
            }
            if (n % 2 == 0) {
                pw.println("YES");
                pw.println(n / 2);
                for (int i = 0; i < n/ 2; i++) pw.print(2 + " ");
                pw.println();
            } else {
                if (k < 3) {
                    pw.println("NO");
                    continue;
                }
                pw.println("YES");
                int v = (n - 3) / 2;
                pw.println(v + 1);
                pw.print(3 + " ");
                for (int i = 0; i < v; i++) pw.print(2 + " ");
            }

        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
