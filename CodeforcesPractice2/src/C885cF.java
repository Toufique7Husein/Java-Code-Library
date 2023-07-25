//created by Toufique on 23/07/2023

import java.io.*;
import java.util.*;

public class C885cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int a = 1, b = 7;

        int cnt = 0;
        while (true) {
            if (a == 0 || b == 0) break;
            int c = Math.abs(b - a);
            a = b;
            b = c;


            debug("a " + " : " + a);
            debug("b " + " : " + b);
            debug(".............");
            cnt++;
        }
        debug(cnt);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
