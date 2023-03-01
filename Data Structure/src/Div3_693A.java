//created by Toufique on 01/03/2023

import java.io.*;
import java.util.*;

public class Div3_693A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int W = in.nextInt();
            int H = in.nextInt();
            int N = in.nextInt();
            int max = 1;
            while (W % 2 == 0) {
                W /= 2;
                max *= 2;
            }
            while (H%2 == 0) {
                H /= 2;
                max *= 2;
            }
            boolean answer = (max >= N);
            pw.println(answer ? "YES" : "NO");
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
