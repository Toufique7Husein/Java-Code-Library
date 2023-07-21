//created by Toufique on 12/06/2023

import java.io.*;
import java.util.*;

public class Cf_Edu_Round150A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            if (n <= 4) pw.println("Bob");
            else pw.println("Alice");
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
