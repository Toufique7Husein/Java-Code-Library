//created by Toufique on 24/04/2023

import java.io.*;
import java.util.*;

public class CodeforcesRound_867C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong();
            pw.println(n * n + 2 * (n - 1L) + 4);
        }

        pw.close();
    }
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
