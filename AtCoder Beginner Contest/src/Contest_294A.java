//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class Contest_294A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int a = in.nextInt();
            if (a % 2 == 0) {
                pw.print(a + " ");
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
