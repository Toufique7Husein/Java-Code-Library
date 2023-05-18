//created by Toufique on 28/04/2023

import java.io.*;
import java.util.*;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        printEven(0, n, a);

        pw.close();
    }

    static void printEven(int i, int n, int[] a) {
        if (i < n) {
            if (a[i] % 2 == 0) System.out.println(a[i]);
            printEven(i + 1, n, a);
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
