//created by Toufique on 14/05/2023

import java.io.*;
import java.util.*;

public class Codeforces_Round_873A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int sum = 0;
            int[] a = new int[n];
            for (int i = 1; i<= n; i++) {
                sum += i;
                a[i - 1] = i;
            }
            int rem = sum % n;
            a[0] += rem;
            for (int i: a) pw.print(i + " ");
            pw.println();
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
