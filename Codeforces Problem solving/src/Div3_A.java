//created by Toufique on 27/01/2023

import java.io.*;
import java.util.*;

public class Div3_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            String n = in.next();
            char[] a = n.toCharArray();
            char[] s = "314159265358979323846264338327".toCharArray();
          //  debug(s.length);
            int ans = 0;
            for (int i = 0; i < n.length(); i++) {
                if (s[i] == a[i]) ans++;
                else break;
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
