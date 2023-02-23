//created by Toufique on 23/02/2023

import java.io.*;
import java.util.*;

public class EDU_143A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            String s1 = in.next();
            String s2 = in.next();
            int count = 0;
            for (int i = m - 1; i >= 0; i--) {
                s1 += String.valueOf(s2.charAt(i));
            }
            debug(s1);
            for (int i = 0; i < (m + n - 1); i++) {
                if (s1.charAt(i) == s1.charAt(i + 1)) {
                    count++;
                }
            }
            if (count <= 1) pw.println("YES");
            else pw.println("NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
