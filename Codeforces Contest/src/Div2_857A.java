//created by Toufique on 09/03/2023

import java.io.*;
import java.util.*;

public class Div2_857A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

       /* int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt(), m = in.nextInt();
            HashSet<Long> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    set.add(in.nextLong());
                }
            }
            debug(set.size());
        }*/

        debug(Integer.parseInt("0001", 2));
        debug(Integer.parseInt("0010", 2));
        debug(Integer.parseInt("0100", 2));
        debug(Integer.parseInt("1000", 2));

        debug(1 ^ 2 ^ 4 ^ 8);






        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
