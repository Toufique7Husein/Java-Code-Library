//created by Toufique on 07/04/2023

import java.io.*;
import java.util.*;

public class Div3_863A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), d = in.nextInt();
            char[] s = in.next().toCharArray();
            boolean find = false;
            for (int i = 0; i < n; i++) {
                if ((s[i] - '0') < d && !find) {
                    pw.print(d);
                    pw.print(s[i]);
                    find = true;
                } else {
                    pw.print(s[i]);
                }
            }
            if (!find)pw.println(d);
            else pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
