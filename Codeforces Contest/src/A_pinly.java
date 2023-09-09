//created by Toufique on 30/08/2023

import java.io.*;
import java.util.*;

public class A_pinly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n =in.nextInt(), o = in.nextInt(), q = in.nextInt();
            char[] s = in.next().toCharArray();
            if (yes(n, o, q, s)) {
                pw.println("YES");
                continue;
            }
            if (maybe(n, o, q, s)) {
                pw.println("MAYBE");
                continue;
            }
            pw.println("NO");
        }

        pw.close();
    }


    static boolean maybe(int n, int o, int q, char[] s) {
        int off = n - o;
        int on = n;

        for (int i = 0; i < q; i++) {
            if (s[i] == '-') {
                if (off > 0) off--;
                else {
                    on--;
                    off++;
                }
                continue;
            }
            on++;
            off--;
        }
        if (on >= n) return true;
        return false;
    }

    static boolean yes(int n, int o, int q, char[] s) {
        int off = n - o;
        int on = n;

        for (int i = 0; i < q; i++) {
            if (s[i] == '-' && on > 0) {
                off++;
                on--;
                continue;
            }
            if (s[i] == '-') {
                on++;
                off--;
                continue;
            }
            on++;
        }
        if (on >= n) return true;
        return false;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
