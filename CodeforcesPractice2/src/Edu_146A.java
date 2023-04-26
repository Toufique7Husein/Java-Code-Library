//created by Toufique on 06/04/2023

import java.io.*;
import java.util.*;

public class Edu_146A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long n = in.nextLong(), k = in.nextLong();
            if (n % 2 == 0) {
                pw.println("YES");
                continue;
            }
            if (k % 2 != 0) {
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
