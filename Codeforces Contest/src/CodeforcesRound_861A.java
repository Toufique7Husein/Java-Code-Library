//created by Toufique on 29/03/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_861A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int l = in.nextInt(), r = in.nextInt();
            String ll = String.valueOf(l), rr = String.valueOf(r);
            if (ll.length() != rr.length()) {
                pw.print(rr.charAt(0));
                for (int i = 1; i < rr.length(); i++) pw.print(0);
                pw.println();
                continue;
            }
            if (ll.charAt(0) == rr.charAt(0))pw.println(rr);
            else {
                pw.print(rr.charAt(0));
                for (int i = 1; i < rr.length(); i++) pw.print(0);
                pw.println();
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
