//created by Toufique on 07/07/2023

import java.io.*;
import java.util.*;

public class A883cF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                int a = in.nextInt(), b = in.nextInt();
                if (a > b) ans++;
            }
            pw.println(ans);
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
