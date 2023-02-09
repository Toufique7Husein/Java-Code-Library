//created by Toufique on 09/02/2023

import java.io.*;
import java.util.*;

public class Div2_851C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            if (n == 1) {
                pw.println("Yes");
                pw.println(1 + " " + 2);
                continue;
            }
            if (n % 2 == 0) {
                pw.println("No");
                continue;
            }
            pw.println("Yes");
            int half = n / 2;
            half++;
            int ans = 1 + 2 * n;
            int last = half + 1;
            for (int i = 1; i <= half; i++, ans--) {
                int next = ans - i;
                pw.println(i + " " + next);
            }
            int ans2 = last + 2 * n - 1;
            for (int i = last; i <= n; i++, ans2--) {
                int next = ans2 - i;
                pw.println(i + " " + next);
            }
        }

        pw.close();
    }



    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
