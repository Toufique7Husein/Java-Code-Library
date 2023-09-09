//created by Toufique on 15/08/2023

import java.io.*;
import java.util.*;

public class A893cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            long A = in.nextLong(), B = in.nextLong(), C = in.nextLong();
            if (C % 2 != 0) B--;
            if (B >= A) {
                pw.println("Second");
            } else pw.println("First");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
