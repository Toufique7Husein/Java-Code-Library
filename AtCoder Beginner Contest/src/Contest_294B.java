//created by Toufique on 19/03/2023

import java.io.*;
import java.util.*;

public class Contest_294B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int H = in.nextInt(), W = in.nextInt();
        int[][] mat = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) mat[i][j] = in.nextInt();
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (mat[i][j] == 0) pw.print(".");
                else {
                    int v = (int)'A' - 1 + mat[i][j];
                    pw.print((char)v);
                }
            }
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
