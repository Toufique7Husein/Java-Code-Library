//created by Toufique on 02/02/2023

import java.io.*;
import java.util.*;

public class Div2_484A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            pw.println(solve(a, n));
        }

        pw.close();
    }

    static int solve(int[] a, int n) {
        int sum = 0;
        for (int i: a) sum += i;
        boolean two = false, one = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == -1) {
                one = true;
            }
            if (i > 0 && a[i] == -1 && a[i - 1] == -1) {
                two = true;
            }
        }
        if (two) {
            sum += 4;
            return sum;
        }
        if (!one) {
            sum -= 4;
            return sum;
        }
        return sum;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
