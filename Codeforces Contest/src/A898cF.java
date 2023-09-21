//created by Toufique on 21/09/2023

import java.io.*;
import java.util.*;

public class A898cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            char[] s = in.next().toCharArray();
            if (s[0] == 'a') {
                pw.println("YES");
                continue;
            }
            if (s[1] == 'b') {
                pw.println("YES");
                continue;
            }
            if (s[2] == 'c') {
                pw.println("YES");
                continue;
            }
            pw.println("NO");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
